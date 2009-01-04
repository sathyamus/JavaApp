package com.snsystems;

import java.io.File;
import java.io.FileOutputStream;

import com.lowagie.text.pdf.PdfReader;

public class WritePDF 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		File file = new File("G://books/test_result.pdf");
		FileOutputStream byteStream = new FileOutputStream(file);
		PdfReader pdfReader = new PdfReader("G://books/test.pdf");
		int i = 1;
		while(i <= pdfReader.getNumberOfPages())
		{
			byteStream.write(pdfReader.getPageContent(i));
			i++;
		}
		byteStream.close();
	}

}
