package ui;

import datalayer.FakeDataRepository;
import entities.Patient;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Accordion;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import services.PropertiesReader;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class HomeViewController extends VBox implements IPartialView {

    final int ROW_HEIGHT = 80;

    public Accordion PatientsAccordionView;
    //final ObservableList patientsList = FXCollections.observableArrayList();
    //final ObservableList stationsList = FXCollections.observableArrayList();


    public HomeViewController(String fxml) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }


        Properties prop = null;
        try {
            PropertiesReader reader = new PropertiesReader();
            prop = reader.getPropValues();
        }
        catch (IOException e) {
           //TODO SHow Message
        }

        buildUpStationAccordeon();
    }

    private void buildUpStationAccordeon() {

        TitledPane[] tps = new TitledPane[FakeDataRepository.getInstance().getStations().size()];
        List<String> stations = FakeDataRepository.getInstance().getStations();

        for (int i = 0; i < stations.size(); i++) {
            final String stationName = stations.get(i);

            ObservableList<Patient> pats = FXCollections.observableArrayList();
            pats.addAll(
                    FakeDataRepository.getInstance().getPatients()
                            .stream()
                            .filter(p -> p.getStationName().equals(stationName))
                            .collect(Collectors.toList())
            );

            ListView<Patient> stationPatients = new ListView();
            stationPatients.getSelectionModel().selectedItemProperty().addListener(
                    new ChangeListener<Patient>() {
                        @Override
                        public void changed(ObservableValue<? extends Patient> observable, Patient oldValue, Patient newValue) {
                            if (newValue != null) {
                                FakeDataRepository.getInstance().setCurrentPatient(newValue);
                            }
                        }
                    }
            );

            stationPatients.setItems(pats);

            stationPatients.setCellFactory(listView -> new PatientCell());

            stationPatients.setPrefHeight(pats.size()*ROW_HEIGHT);
            tps[i] = getStationPane(stationName,  stationPatients);

        }

        PatientsAccordionView.getPanes().addAll(tps);
        PatientsAccordionView.setExpandedPane(tps[0]);

    }

    private TitledPane getStationPane(String title, Node content) {
        TitledPane tp = new TitledPane();
        tp.setText(title);
        tp.setContent(content);

        return tp;
    }



    @Override
    public void beforeLeaving() {

    }

    @Override
    public void beforeOpen() {

    }
}