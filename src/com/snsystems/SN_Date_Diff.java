package com.snsystems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SN_Date_Diff 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter the DATE, MONTH and YEAR seperated by space \n \n(Eg:'25th January 2000' as '25 01 2000' ): ");
		String str = br.readLine();
		String[] strArr = str.split(" ");
		int days =  Integer.parseInt(strArr[0]);
		int month =  Integer.parseInt(strArr[1]);
		int year = Integer.parseInt(strArr[2]);
		System.out.println("Given :");
		System.out.println(" Days : "+days);
		System.out.println("Month : "+month);
		System.out.println(" Year : "+year);
		System.out.print("\n Please enter the no of DAYS");
		String str1 = br.readLine();
		int days1 =  Integer.parseInt(str1);
		System.out.println("No. of DAYS : "+days1);

//		HashMap<Integer,Integer> daysInMonths = new HashMap<Integer, Integer>();
/*		
		The number of days in each month of the Gregorian / Julian calendar are:
			January	31
			February	28/29
			March	31
			April	30
			May		31
			June	30
			July	31
			August	31
			September	30
			October	31
			November	30
			December	31
*/			
		Integer[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int d = days1;
		while(d>0)
		{
		int toYears = days1 / 365;
		int toMonths = toYears / 12;
		int toDays = toMonths / 30;
		System.out.println(" to years : "+toYears);
		System.out.println("to months : "+toMonths);
		System.out.println("  to days : "+toDays);
		}
		

		
	}
	
	/*

	main()
	{
	int day,day1,mon,mon1,year,year1,d,m,y;
	clrscr();
	printf("Date Form : DD-MM-YYYY\n");
	printf("Enter Present Date :");
	scanf("%d-%d-%d",&day,&mon,&year);
	printf("Enter  Your  D O B :");
	scanf("%d-%d-%d",&day1,&mon1,&year1);
	if (day>=day1)
	{
	d=day-day1;
	}
	else
	{
	d=30+day-day1;
	d=d-1;
	}
	if (mon>=mon1)
	{
	m=mon-mon1;
	m=m-1;
	}
	else
	{
	m=11+mon-mon1;
	y=y-1;
	}
	y=year-year1;
	printf("Your Age is : %d-%d-%d",d,m,y);
	getch();
	}

	*/

}
