package com.bridgelabz.functional;
import java.util.*;
public class TempConversion {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the conversion type: \n 1. Degree celcius to Fahrenheit \n 2. Fahrenheit to Degree Celcius");
		int select=scanner.nextInt();
		TempConversion converted=new TempConversion();
		double temp=converted.conversion(select);
		if(select==1 )
			System.out.println("Temperature in Fahrenheit is: "+temp);
		if(select==2)
		System.out.println("Temperature in DegCelcius is: "+temp);
		scanner.close();
	}
	public double conversion(int a)
	{
		Scanner scanner=new Scanner(System.in);
	double DegCelcius, Fahrenheit,b = 0;
	
	if(a==1)
	{
		System.out.println("Enter the Temperature in Degree celcius");
		DegCelcius=scanner.nextDouble();
		
		b=(((DegCelcius*9)/5)+32);
		
	}
	if(a==2)
	{
		System.out.println("Enter the Temperature in Fahrenheit: ");
		Fahrenheit=scanner.nextDouble();
		
		b=(((Fahrenheit-32)*5)/9);
	
	}
return b;

}
}
