package com.educationalportal.Service;

import com.educationalportal.Entity.PaymentEntity;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class PaymentService {
	public void generateReceipt(PaymentEntity paymentEntity) {
        Document document = new Document();

        try {
            // Replace with your desired file path and name
            PdfWriter.getInstance(document, new FileOutputStream("path/to/receipt.pdf"));
            document.open();

            // Add content to the PDF
            document.add(new Paragraph("Payment Receipt"));
            document.add(new Paragraph("-------------------------"));
            document.add(new Paragraph("ID: " + paymentEntity.getId()));
            document.add(new Paragraph("Customer ID: " + paymentEntity.getCustomerid()));
            document.add(new Paragraph("Status: " + paymentEntity.getStatus()));

            document.close();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
