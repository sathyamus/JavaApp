
package com.snsystems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DatesDifference 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception 
	{
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

		if (day>=day1)
		{
			d=day-day1;
		}
		else
		{
			if(mon==2 && year%4==0)
			{
				dayCount = 29;
			}
			else
			{
				dayCount = daysInMonths[mon-1];
			}
			
			if(mon==1)
			{
				mon=11+mon;
				year = year-1;
			}
			else
				mon=mon-1;
			
			d=dayCount+day-day1;
		}
		if (mon>=mon1)
		{
			m=mon-mon1;
		}
		else
		{
			year=year-1;
			m=12+mon-mon1;
		}
		y=year-year1;
		System.out.println("Your Age is : "+d+" Days, "+m+" Months, "+y+" Years");
		
		long totalDays = 0;
		
		for(int mm = 1; mm<=m ; mm++)
		{
			totalDays = totalDays+(daysInMonths[mm-1]);
		}
		
		totalDays = totalDays+(y*365);
		totalDays = totalDays+d;
		
		System.out.println("Total Days : "+totalDays);
		
		}

}
