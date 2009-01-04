package com.snsystems;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		Calendar next = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(now.getTime()));
		System.out.println(sdf.format(next.getTime()));
		
		next.set(next.DATE, 1);
		System.out.println(sdf.format(now.getTime()));
		System.out.println(sdf.format(next.getTime()));
	}

}
