package com.dipak.create;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

public class CreateTable {


	  public static void createTable(Document document) throws DocumentException {
	       
		  PdfPTable table = new PdfPTable(3);

	        // t.setBorderColor(BaseColor.GRAY);
	        // t.setPadding(4);
	        // t.setSpacing(4);
	        // t.setBorderWidth(1);

	        PdfPCell c1 = new PdfPCell(new Phrase("EID"));
	        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	        table.addCell(c1);

	        c1 = new PdfPCell(new Phrase("ENAME"));
	        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	        table.addCell(c1);

	        c1 = new PdfPCell(new Phrase("ECITY"));
	        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	        table.addCell(c1);
	        table.setHeaderRows(1);

	        table.addCell("101");
	        table.addCell("Dipak K");
	        table.addCell("Parbhani");
	       
	        table.addCell("102");
	        table.addCell("Atish K");
	        table.addCell("Latur");


	        table.addCell("103");
	        table.addCell("Atish K");
	        table.addCell("Latur");
	        
	        table.addCell("104");
	        table.addCell("Atish K");
	        table.addCell("Latur");
	        
	        document.add(table);

	    }








}
