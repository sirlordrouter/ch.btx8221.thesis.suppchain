package ui;

import barcode.GtinFormatConverter;
import datalayer.IRepository;
import entities.PreparedMedication;
import exceptions.NotCorrectEANLenghtException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import services.Helpers;
import ui.validation.RequiredField;
import webservice.erp.MediPrepResult;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 *     A Dialog to add Product Information manually
 * <p></p>
 * Project: MediPrep
 * Package: ui
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 13.04.15
 */
public class AddMedDialog extends Stage implements Initializable {

    /**
     * Sample Skeleton for 'AddMedDialog.fxml' Controller Class
     */

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtLot"
    private TextField txtLot; // Value injected by FXMLLoader

    @FXML // fx:id="txtExpiryDate"
    private TextField txtExpiryDate; // Value injected by FXMLLoader

    @FXML // fx:id="txtSerial"
    private TextField txtSerial; // Value injected by FXMLLoader

    @FXML // fx:id="txtGtin"
    private TextField txtGtin; // Value injected by FXMLLoader$

    @FXML
    private Label lblName;

    @FXML
    private Label lblErrorCode;

    @FXML
    private RequiredField requiredFieldGTIN;
    @FXML
    private RequiredField requiredFieldExpDate;
    @FXML
    private RequiredField requiredFieldLot;
    @FXML
    private RequiredField requiredFieldSerial;

    private boolean canceled = false;

    private IRepository repository;

    private PreparedMedication currentMedication;

    public AddMedDialog(Parent parent, PreparedMedication selectedMedication, IRepository dataSource) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddMedDialog.fxml"));
        fxmlLoader.setController(this);

        try {
            setScene(new Scene((Parent) fxmlLoader.load()));
            this.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    canceled = true;
                    close();
                }
            });
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        currentMedication = selectedMedication;
        this.lblErrorCode.setText("");
        this.lblName.setText(selectedMedication.getName().get());
        this.repository = dataSource;
    }

    @FXML
    void save(ActionEvent event) {
        evalFields();

        if(!requiredFieldGTIN.getHasErrors() &&
                !requiredFieldExpDate.getHasErrors() &&
                !requiredFieldLot.getHasErrors() &&
                !requiredFieldSerial.getHasErrors()) {

            String gtin = txtGtin.getText();
            try {
                gtin = GtinFormatConverter.ConvertEan13To14(gtin);
            } catch (NotCorrectEANLenghtException e) {  /* leave old gtin as it is 14*/     }
            final String gtin14 = gtin;

            if (!currentMedication.getGtinBs().stream().anyMatch(l -> l.equals(gtin14))
                    && !currentMedication.getGtinA().equals(gtin14)){
                ShowWrongProductInfo();

            } else {

                try {
                    updateMedication(gtin);

                    List<PreparedMedication> medicationList = new ArrayList<>();
                    medicationList.add(currentMedication);
                    //Additional Medics are directly in controlled state as they are immediately given to the patient but mapping must be
                    //done first, so state is prepared for webservice but logical it is controlled
                    MediPrepResult success = repository.UpdatePreperationState(medicationList, PreparedMedication.MedicationState.prepared);

                    if (!success.isResult()) {
                        showErrors(Helpers.getWebserviceErrorCode(success));

                    } else {
                        close();
                    }

                } catch (DateTimeParseException e) {
                    txtExpiryDate.setBackground(new Background(new BackgroundFill(Paint.valueOf("red"), CornerRadii.EMPTY
                            , Insets.EMPTY)));
                    lblErrorCode.setText("Das Ablaufdatum ist nicht analysierbar,\n " +
                            "bitte halten Sie sich an die Form ddmmyyyy");
                }
            }
        }
    }

    private void showErrors(String errorMessage) {
        txtExpiryDate.setBackground(new Background(new BackgroundFill(Paint.valueOf("red"), CornerRadii.EMPTY
                , Insets.EMPTY)));
        txtLot.setBackground(new Background(new BackgroundFill(Paint.valueOf("red"), CornerRadii.EMPTY
                , Insets.EMPTY)));
        txtSerial.setBackground(new Background(new BackgroundFill(Paint.valueOf("red"), CornerRadii.EMPTY
                , Insets.EMPTY)));

        lblErrorCode.setText("");
        lblErrorCode.setText(errorMessage);
        currentMedication.setState(PreparedMedication.MedicationState.open);
    }

    private void updateMedication(String gtin) throws DateTimeParseException{
        String expDate = "";
        expDate = Helpers.parseDateFrom(getTxtExpiryDate().getText());
        String lot = getTxtLot().getText();
        String serial = getTxtSerial().getText();

        currentMedication.setAssignedProductGTIN(gtin);
        currentMedication.setExpiryDate(expDate);
        currentMedication.setBatchLot(lot);
        currentMedication.setSerial(serial);
        currentMedication.setPreparationTime(LocalDateTime.now());
        currentMedication.setState(PreparedMedication.MedicationState.controlled);
    }

    private void ShowWrongProductInfo() {
        //TODO: ERROR message below field
        txtGtin.setBackground(new Background(new BackgroundFill(Paint.valueOf("red"), CornerRadii.EMPTY
        , Insets.EMPTY)));
        lblErrorCode.setText("Das eingegebene Produkt passt nicht zum Produkt der Verordnung!\n" +
                "Überprüfen Sie noch einmal das Medikament.");
    }

    private void evalFields() {
        requiredFieldGTIN.eval();
        requiredFieldExpDate.eval();
        requiredFieldLot.eval();
        requiredFieldSerial.eval();
    }

    @FXML
    void cancel(ActionEvent event) {
        this.canceled = true;
        close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        assert txtLot != null : "fx:id=\"txtLot\" was not injected: check your FXML file 'AddMedDialog.fxml'.";
        assert txtExpiryDate != null : "fx:id=\"txtExpiryDate\" was not injected: check your FXML file 'AddMedDialog.fxml'.";
        assert txtSerial != null : "fx:id=\"txtSerial\" was not injected: check your FXML file 'AddMedDialog.fxml'.";
        assert txtGtin != null : "fx:id=\"txtGtin\" was not injected: check your FXML file 'AddMedDialog.fxml'.";
    }

    public TextField getTxtLot() {
        return txtLot;
    }

    public void setTxtLot(TextField txtLot) {
        this.txtLot = txtLot;
    }

    public TextField getTxtExpiryDate() {
        return txtExpiryDate;
    }

    public void setTxtExpiryDate(TextField txtExpiryDate) {
        this.txtExpiryDate = txtExpiryDate;
    }

    public TextField getTxtSerial() {
        return txtSerial;
    }

    public void setTxtSerial(TextField txtSerial) {
        this.txtSerial = txtSerial;
    }

    public TextField getTxtGtin() {
        return txtGtin;
    }

    public void setTxtGtin(TextField txtGtin) {
        this.txtGtin = txtGtin;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
