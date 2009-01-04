package com.snsystems;

public class Premitives_Wrappers1 
{
	static char c;
	static int i;
	static float f;
	static double d;
	static long l;

	static String s;
	static Integer in;
	static Float fl;
	static Double db;
	static Long ll;

	public Other s1;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
//		int a,b;
//		b=5;
		boolean var = true;
		int nI;
		if(var)
		{
			nI = 10;
		}
		else if(true)
		{
			nI = 20;
		}
		System.out.println("premitives"+nI);
		System.out.println(" ---- Premitives ---- ");
		System.out.println("char c:" +'\u0000');
		System.out.println("int i:" + i);
		System.out.println("float f:" + f);
		System.out.println("double d:" + d);
		System.out.println("long l :" + l);

		System.out.println("\n\n ---- Wrapers ---- ");
		System.out.println("String s :" + s);
		System.out.println("Integer in:" + in);
		System.out.println("Float fl:" + fl);
		System.out.println("Double db:" + db);
		System.out.println("Long ll :" + ll); 

}

}
class Other
{
}

	