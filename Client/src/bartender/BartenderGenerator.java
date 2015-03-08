package bartender;

import services.PropertiesReader;
import webservice.erp.Item;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>Class for the generation of trigger text files to print labels with BarTender.
 * Configurations have to be made in the config.properties file.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 24-02-2015
 */
public class BartenderGenerator {
    private String printerNameSSCC, printerNameDataMatrix,printerNameLieferschein,labelTemplateSSCC, labelTemplateDataMatrix,labelTemplateLieferschein, fileNameSSCC, fileNameDataMatrix, fileNameLieferschein;
    Properties prop;

    public BartenderGenerator(){
        PropertiesReader reader = new PropertiesReader();
        try {
            prop = reader.getPropValues();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // read the user configuration
        printerNameSSCC=prop.getProperty("barcodePrinterSSCC");
        printerNameDataMatrix=prop.getProperty("barcodePrinterDataMatrix");
        printerNameLieferschein=prop.getProperty("barcodePrinterLieferschein");
        labelTemplateSSCC = prop.getProperty("bartenderLabelTemplateSSCC");
        labelTemplateDataMatrix=prop.getProperty("bartenderLabelTemplateDataMatrix");
        labelTemplateLieferschein=prop.getProperty("bartenderLabelTemplateLieferschein");
        fileNameSSCC=prop.getProperty("triggerTextFileNameSSCC");
        fileNameDataMatrix=prop.getProperty("triggerTextFileNameDataMatrix");
        fileNameLieferschein=prop.getProperty("triggerTextFileNameLieferschein");
    }

    public void createSSCCtriggerFile(String glnOrigin, String descOrigin, String glnDestination, String descDestination, String sscc){
        // build the trigger text field at the specified location
        try{
            java.util.Date date = new java.util.Date();
            DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String dateString = formatter.format(date);
            Writer output = null;
            File file = new File(fileNameSSCC);
            output = new BufferedWriter(new FileWriter(file));
            output.write("%BTW% /AF="+labelTemplateSSCC+" /D=%Trigger File" +
                    " Name% /PRN=\""+printerNameSSCC+"\" /R=3 /P /DD\n" +
                    "%END%\n"+glnOrigin+","+descOrigin+","+glnDestination+","
                    +descDestination+","+dateString+","+sscc);
            output.close();
            System.out.println("File has been written");
        }catch(Exception e){
            System.out.println("Could not create file");
        }


    }
    public void createDataMatrixtriggerFile(List<Item> items){
        // build the trigger text field at the specified location
        try{
            Writer output = null;
            File file = new File(fileNameDataMatrix);
            output = new BufferedWriter(new FileWriter(file));
            output.write("%BTW% /AF="+labelTemplateDataMatrix+" /D=%Trigger File" +
                    " Name% /PRN=\""+printerNameDataMatrix+"\" /R=3 /P /DD\n" +
                    "%END%");
            for(Item item:items){
                output.append("\n"+item.getGTIN()+","+item.getExpiryDate()+","+item.getLot()+
                ","+item.getSerial()+","+item.getBeschreibung());
            }

            output.close();
            System.out.println("File has been written");
        }catch(Exception e){
            System.out.println("Could not create file");
        }
    }
    public void createShipmenttriggerFile(){
        // build the trigger text field at the specified location
        try{
            Writer output = null;
            File file = new File(fileNameLieferschein);
            output = new BufferedWriter(new FileWriter(file));
            output.write("%BTW% /AF="+labelTemplateLieferschein+" /D=%Trigger File" +
                    " Name% /PRN=\""+printerNameLieferschein+"\" /R=3 /P /DD\n" +
                    "%END%\n");


            output.close();
            System.out.println("File has been written");
        }catch(Exception e){
            System.out.println("Could not create file");
        }
    }

}
