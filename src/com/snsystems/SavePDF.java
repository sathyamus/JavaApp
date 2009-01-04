package com.snsystems;

import java.io.FileOutputStream;

import com.lowagie.text.pdf.PdfReader;

public class SavePDF 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception 
	{
		try 
		{
			PdfReader pdfReader = new PdfReader("E://SN/test.pdf");
			System.out.println(pdfReader.getMetadata());
			System.out.println(pdfReader.getPageContent(1));
			FileOutputStream fos = new FileOutputStream("E://SN/test_result.pdf");
			fos.write(pdfReader.getPageContent(1));
			// Document document = new Document(PageSize.A3.rotate());
			// PdfWriter writer = null;
			// SimpleDateFormat formatter = new SimpleDateFormat(
			// "yyyy.MM.dd.HH.mm.ss");
			// String dateString = formatter.format(new Date());
			// Date currentDate = formatter.parse(dateString);
			// File file = File.createTempFile("AchampLirf", ".pdf");
			// FileOutputStream byteStream = new FileOutputStream(file);
			// PdfContentByte cb = null;
			// try {
			// writer = PdfWriter.getInstance(document, byteStream);
			// document.addTitle("LIRF");
			// document.addSubject("LIRF : GRAPHICAL VERSION");
			// document.addKeywords("LIRF, GRAPHICAL VERSION, CHAMP");
			// document.addCreator("CHAMP/ITC INFOTECH MASS & BALANCE SYSTEM");
			// document.addAuthor("ABHILSHIT SONI");
			// document.addCreationDate();
			// document.open();
			// cb = writer.getDirectContent();
			//
			//			
			// cb.toPdf(writer);
			// document.close();
			// writer.close();
			// FileInputStream fin = new FileInputStream(file);
			// byte[] fileBytes = new byte[(int) file.length()];
			// fin.read(fileBytes);
			// Hibernate.createBlob(fileBytes);
			// // response.getOutputStream().write(fileBytes);
			// // save(fileBytes, currentLeg, currentDate, 1);
			// file.delete();
			// // FacesContext.getCurrentInstance().responseComplete();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}