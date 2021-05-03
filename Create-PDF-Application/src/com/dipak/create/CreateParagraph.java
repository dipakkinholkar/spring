package com.dipak.create;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;

public class CreateParagraph {
	
	
	public static boolean createParagraph(Document doc,String paragraph) throws DocumentException
	{
		Paragraph par=new Paragraph(paragraph);
		
		
		 boolean flag=doc.add(par);
		
		return flag;
	}
	
	

}
