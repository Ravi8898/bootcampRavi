package com.bridgelabz.functional;
import java.util.*;

public class PyramidPattern {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int n=scanner.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=(n-1); j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int j=1; j<=(i-1); j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		scanner.close();

	}

}
