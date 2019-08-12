package com.bridgelabz.functional;
import java.util.*;
public class Anagram {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first string: ");
		String firstIn=scanner.nextLine();
		
		System.out.println("Enter first string: ");
		String secondIn=scanner.nextLine();
		
		int found=0;
		int firstInLength=firstIn.length();
		int secondInLength=secondIn.length();
		if(firstInLength==secondInLength)
		{
			for(int i=0;i<firstInLength;i++)
			{
				found=0;
				for(int j=0;j<secondInLength;j++)
				{
					if(firstIn.charAt(i)==secondIn.charAt(j)) 
					{
						found=1;
						
						String toRep="*";
						String valueReplace=secondIn.charAt(j);
						String replaceString=valueReplace.replace(valueReplace,toRep);
					j=secondInLength+1;
					}
				}
			}
				
		}
		if(found==1)
		{
			System.out.println("This is Anagram");
		}
		else
			System.out.println("This is not Anagram");

	}

}
