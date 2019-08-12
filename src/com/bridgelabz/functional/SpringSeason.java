/*  Purpose: get to know whether the given month and date is in spring season or not
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.utility.*;
public class SpringSeason {

	public static void main(String[] args) 
	{
		int month,day;
		
		month=Integer.parseInt(args[0]);
		
		day=Integer.parseInt(args[1]);
		Utility utility=new Utility();
		boolean season=utility.springseason(month,day);
		System.out.println(season);
		if(season==true)
		{
			System.out.println("The "+day+"/"+month+" is spring season");
		}
		else
		{
			System.out.println("The "+day+"/"+month+" is not spring season");
		}
	}
}