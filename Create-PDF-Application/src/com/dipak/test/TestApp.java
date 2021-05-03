package com.dipak.test;

import java.io.File;
import java.io.FileOutputStream;

import com.dipak.create.CreateParagraph;
import com.dipak.create.CreateTable;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;

public class TestApp {

	 private static String FILE = "D:/hello.pdf";

	public static void main(String[] args) {
	
		
		try {
			
			String par=" To,\r\n"
					+ "\r\n"
					+ "The Principal,\r\n"
					+ "\r\n"
					+ "SRTM , Univercity, Nanded,\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "                                    Subject: Leave application for 22-5-2000 .\r\n"
					+"\n"
					+"\n"
					+ "Respected Sir,\r\n"
					+"\n"
					+ "Hope this application finds you in the best of your health.\r\n"
					+ "This is to inform you that as my parents are aging and are prone to fall sick very often."
					+ "So, as their only child this is my utter responsibility to take care of their health. "
					+ "I have to go the hospital with my parent for their regular medical check-up. "
					+ "Therefore, I request you to kindly grant me five days leave.\r\n"
					+ "I hope you would provide your utmost consideration to my request.\r\n"
					+"\n"
					+"\n"
					
					+ "Thanking you,\r\n"
					+"\n"
					+""
				    + "                                                                                                        Your Sincerely,\r\n"
					+"\n"
					+ "                                                                                                        Dipak Kinholkar\r\n"
					+ "                                                                                        "
					+ "\r\n"
					+ "";
			
			Document doc=new Document();
			
			PdfWriter.getInstance(doc, new FileOutputStream(FILE));
			
			
			
			doc.open();
			//CreateTable.createTable(doc);
			CreateParagraph.createParagraph(doc, par);
			doc.close();
			
			
			
		}
		catch(Exception e)
		{
			
			System.out.print(e);
		}
		
		
		
	}

}
