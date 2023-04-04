package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class ReadPDFFile {

    public String lolo() {

        String text = null;
        try {
            // Load the PDF document
            PDDocument doc = PDDocument.load(new File("Filepathpdf"));

            // Create a PDFTextStripper object to extract the text
            PDFTextStripper stripper = new PDFTextStripper();

            // Get the text content of the PDF and print it to the console
            text = stripper.getText(doc);
            System.out.println(text);

            // Close the PDF document
            doc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }
}
