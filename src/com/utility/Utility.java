/*  Purpose: To get Sum of Two Dice
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.utility;

public class Utility {
	
	
	/*	*****************************************************************************	
	/**
	 * @param 		int			month
	 * @param 		int			day
	 * @return		boolean		true or false
	 */
	public boolean springseason(int month,int day)
	{
		switch(month)
		{
		case 3:
			if(day>19 && day<32)
			{
				return true;
			}
			else
				return false;
		case 4:
			if(day>0 && day<31)
			{
				return true;
			}
		case 5:
			if(day>0 && day<32)
			{
				return true;
			}
		case 6:
			if(day>0 && day<21)
			{
				return true;
			}
			default: 
				return false;
				
		}
	}
	
	
/*	*****************************************************************************
	/**
	 * @param 		int		a
	 * @param 		int		b
	 * @param 		int		c
	 * @return		int		operation
	 */
	public int integerOperation1(int a,int b, int c)
	{
		int operation=a+(b*c);
		return operation;
	}
	public int integerOperation2(int a,int b, int c)
	{
		int operation=(a*b)+c;
		return operation;
	}
	public int integerOperation3(int a,int b, int c)
	{
		int operation=(a%b)+c;
		return operation;
	}
	
	
/*	*****************************************************************************	
	 * @param 		double	a
	 * @param 		double	b
	 * @param 		double	c
	 * @return		double	operation
	 */
	public double doubleOperation1(double a,double b, double c)
	{
		double operation=a+(b*c);
		return operation;
	}
	public double doubleOperation2(double a,double b, double c)
	{
		double operation=(a*b)+c;
		return operation;
	}
	public double doubleOperation3(double a,double b, double c)
	{
		double operation=(a%b)+c;
		return operation;
	}
 
	
/*	*****************************************************************************
 Purpose: get to know whether the Number is HappyNumber or not.
 **
 * @param   	int		number
 * @return		int		number
 */
public int varifyNum(int number)
{
	int secondDigit,lastDigit,firstDigit;
	while(number!=1 && number!=4)
	{
		secondDigit=0;
		lastDigit=number%10;
		firstDigit=number/10;
		if(firstDigit>=10)
		{
			secondDigit=firstDigit%10;
			firstDigit=firstDigit/10;
		}
		
		number=((firstDigit*firstDigit)+(secondDigit*secondDigit)+(lastDigit*lastDigit));
		
	}
	return number;
}

/*	******************************************************************************
  	Purpose: Prints five uniform random values between 0 and 1,
	their average value, and their minimum and maximum value. Use Math.random(),
	Math.min(), and Math.max().

 * @return		double (s
 * sum/5=Average)
 */
public double generateRandomNumber()
{
	double MinNum = 1,MaxNum = 0,sum=0;
	double number[]=new double[5];
	for(int i=0;i<5;i++)
	{
		number[i]=(Math.random()*1);
		System.out.println("random generated number is "+number[i]);
		sum=sum+number[i];
		MinNum=Math.min(MinNum, number[i]);
		
		MaxNum=Math.max(MaxNum, number[i]);
	
	}
	System.out.println("Sum of Random no is: "+sum);
	System.out.println("Minimum no is: "+MinNum);
	System.out.println("Maximum no is: "+MaxNum);
	return (sum/5);
	
}


}