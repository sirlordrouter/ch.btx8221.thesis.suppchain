package services;

import entities.Prescription;
import org.krysalis.barcode4j.impl.datamatrix.DataMatrixBean;
import org.krysalis.barcode4j.impl.datamatrix.SymbolShapeHint;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.krysalis.barcode4j.output.bitmap.BitmapEncoder;
import org.krysalis.barcode4j.output.bitmap.BitmapEncoderRegistry;
import org.krysalis.barcode4j.tools.UnitConv;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p></p>
 * Project: MediPrep
 * Package: services
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 28.04.15
 */
public class BarcodeGenerator {

    public static int PRINT_LABEL_WITH = 300;
    public static int PRINT_LABEL_HEIGT = 100;

    public void generate(File outputFile, Prescription basedOnPrescription) throws IOException {
        String msg = "1";
        String content = "Natriumchlorid 0.9% Ceftriaxon OrPha 2g";
        /*
        for (PreparedMedication preparedMedication : basedOnPrescription.getMedications()) {
            content += preparedMedication.getName().get() + ", ";
        }*/

//+ basedOnPrescription.getPolypointID()    + basedOnPrescription.getDescription()
        String[] paramArr = new String[] {
                "Prescription ID: " ,
                "Beschreibung: " ,
                "Inhalt: Natriumchlorid 0.9%",
                "Ceftriaxon OrPha 2g"
        };

        //Create the barcode bean
        DataMatrixBean bean = new DataMatrixBean();

        final int dpi = 200;

        //Configure the barcode generator
        bean.setModuleWidth(UnitConv.in2mm(8.0f / dpi)); //makes a dot/module exactly eight pixels
        bean.doQuietZone(false);
        bean.setShape(SymbolShapeHint.FORCE_SQUARE);

        boolean antiAlias = false;
        int orientation = 0;
        //Set up the canvas provider to create a monochrome bitmap
        BitmapCanvasProvider canvas = new BitmapCanvasProvider(
                dpi, BufferedImage.TYPE_BYTE_BINARY, antiAlias, orientation);

        //Generate the barcode
        bean.generateBarcode(canvas, msg);

        //Signal end of generation
        canvas.finish();

        //Get generated bitmap
        BufferedImage symbol = canvas.getBufferedImage();

        int fontSize = 14; //pixels
        int lineHeight = (int)(fontSize * 1.2);
        Font font = new Font("Arial", Font.PLAIN, fontSize);
        Font font1 = new Font("Arial", Font.BOLD, fontSize);
        int width = 5;
        int height = symbol.getHeight();
        FontRenderContext frc = new FontRenderContext(new AffineTransform(), antiAlias, true);
        for (int i = 0; i < paramArr.length; i++) {
            String line = paramArr[i];
            Rectangle2D bounds = font.getStringBounds(line, frc);
            width = (int)Math.ceil(Math.max(width, bounds.getWidth())) >= width ?
                    (int)Math.ceil(Math.max(width, bounds.getWidth())) : width;
            height += lineHeight;
        }

        //Add padding
        int padding = 5;
        width += 4 * padding;
        height += 2 * padding;


        BufferedImage bitmap = new BufferedImage(PRINT_LABEL_WITH, PRINT_LABEL_HEIGT, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = (Graphics2D)bitmap.getGraphics();

        g2d.setBackground(Color.white);
        g2d.setColor(Color.black);
        g2d.clearRect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        g2d.setFont(font);

        //Place the barcode symbol
        AffineTransform symbolPlacement = new AffineTransform();
        symbolPlacement.translate(padding, padding);
        g2d.drawRenderedImage(symbol, symbolPlacement);

        //Add text lines (or anything else you might want to add)
        int y = padding;
        int x = padding + symbol.getWidth() + 20 + padding;
        for (int i = 0; i < paramArr.length; i++) {
            String line = paramArr[i];
            y += lineHeight;
            g2d.drawString(line, x, y);
        }

        g2d.dispose();

        //return bitmap;


        //Encode bitmap as file
        String mime = "image/png";
        OutputStream out = new FileOutputStream(outputFile);
        try {
            final BitmapEncoder encoder = BitmapEncoderRegistry.getInstance(mime);
            encoder.encode(bitmap, out, mime, dpi);

        } finally {
            out.close();
        }
    }

    public void printBarcode(Prescription prescription) throws PrinterException, IOException {

        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
        System.out.println("Number of print services: " + printServices.length);

        PrintService service = null;
        for (PrintService printer : printServices) {
            System.out.println(printer.getName());
            if (printer.getName().equals("PDFwriter")) {
                service = printer;
            }
        }


        PrinterJob job = PrinterJob.getPrinterJob();
        //boolean doPrint = job.printDialog();
        //if (doPrint) {
            job.setPrintService(service);
            /*BufferedImage bufferedImage = generate(null,prescription);
            ImagePrintable imagePrintable = new ImagePrintable(
                    job,bufferedImage
            );*/

            job.setPrintable(new PreparedPrescriptionPrinter());
            job.print();


        //}
    }
}
