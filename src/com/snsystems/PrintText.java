package com.snsystems;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;

import java.awt.print.*;
import java.text.*;

public class PrintText implements Printable {

	private static final String mText = "Device Name: ";// +acmtxt_DeviceName.
	// getText
	// ()+"\n Alarm Text :"
	// +acmtxt_AlarmText
	// .getText
	// ()+"\n Time stamp: "
	// +acmtxt_TimeStamp
	// .getText
	// ()+"\n Alarm Detail: "
	// +jta_AlarmDetail.
	// getText();

	private static final AttributedString mStyledText = new AttributedString(mText);

	static public void main(String args[]) {

		PrinterJob printerJob = PrinterJob.getPrinterJob();

		Book book = new Book();
		book.append(new PrintText(), new PageFormat());

		printerJob.setPageable(book);

		boolean doPrint = printerJob.printDialog();
		if (doPrint) {
			try {
				printerJob.print();
			} catch (PrinterException exception) {
				System.err.println("Printing error: " + exception);
			}
		}
	}

	public int print(Graphics g, PageFormat format, int pageIndex) 
	{
		Graphics2D g2d = (Graphics2D) g;

		g2d.translate(format.getImageableX(), format.getImageableY());

		g2d.setPaint(Color.black);

		Point2D.Float pen = new Point2D.Float();
		AttributedCharacterIterator charIterator = mStyledText.getIterator();
		LineBreakMeasurer measurer = new LineBreakMeasurer(charIterator, g2d.getFontRenderContext());
		float wrappingWidth = (float) format.getImageableWidth();
		while (measurer.getPosition() < charIterator.getEndIndex()) 
		{
			TextLayout layout = measurer.nextLayout(wrappingWidth);
			pen.y += layout.getAscent();
			float dx = layout.isLeftToRight() ? 0 : (wrappingWidth - layout.getAdvance());
			layout.draw(g2d, pen.x + dx, pen.y);
			pen.y += layout.getDescent() + layout.getLeading();
		}
		return Printable.PAGE_EXISTS;
	}
}
