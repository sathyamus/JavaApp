package com.snsystems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DatesDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int day,day1,mon,mon1,year,year1,d=0,m=0,y=0;
		Integer daysInMonths[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		Integer dayCount = 0;
//		HashMap map = new HashMap<Integer, V>
		String str1;
		String str2;
		String[] firstDate;
		String[] secondDate;
		System.out.println("Date Format : DD-MM-YYYY\n");
		System.out.println("Enter Present Date :");
		str1 = bufferedReader.readLine();
		System.out.println("Enter  Your  D O B :");
		str2 = bufferedReader.readLine();
		
		firstDate = str1.split("-");
		day = Integer.parseInt(firstDate[0]);
		mon = Integer.parseInt(firstDate[1]);
		year = Integer.parseInt(firstDate[2]);

		secondDate = str2.split("-");
		day1 = Integer.parseInt(secondDate[0]);
		mon1 = Integer.parseInt(secondDate[1]);
		year1 = Integer.parseInt(secondDate[2]);
		
		

	}

}
