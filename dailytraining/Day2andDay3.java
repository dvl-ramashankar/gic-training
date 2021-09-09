package com.example.demo.dailytraining;

import java.util.Scanner;
public class Day2andDay3 {
	//static method
	public static void even_Number()
	{
		System.out.println("The even elements present in array are printed already");
	}
	public static void main(String args[])
	{
		int array[]=new int[5];
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of array upto 5 elements:");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
			
		}
		System.out.println("The even elements in array are:");
		for(int i=0;i<array.length;i++)
		{
			if(array[i] % 2==0)
			{
				System.out.println(array[i]);
				flag=true;
			}
			
		}
		if(flag==true)
		{
		
		//calling static method
		 even_Number();
		}
		
	}

}
