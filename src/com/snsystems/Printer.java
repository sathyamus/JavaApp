package com.snsystems;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextLayout;
import java.awt.geom.Point2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;

public class Printer  implements Printable 
{
	static String mText = "Sample Text";
	private static final AttributedString mStyledText = new AttributedString(mText);
	
	static public void main(String args[]) throws Exception
	{

		System.out.println("Printing");
		PrinterJob printerJob = PrinterJob.getPrinterJob();
		printerJob.printDialog();
		printerJob.print();
		System.out.println("Exiting");
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
