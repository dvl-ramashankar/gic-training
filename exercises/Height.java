package com.example.demo.exercises;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		int selection;
		System.out.println("This program makes calculation related to your height:"
				+ "\n Type 1 to give your height in feet and inches or"
				+ "\n Type 2 to give your height in centimeters.");
		Scanner sc = new Scanner(System.in);
		selection = sc.nextInt();
		if (selection == 1) {
			int feet, inches;
			double centimeter = 0;
			System.out.println("Enter the height in feet and inches :");
			feet = sc.nextInt();
			inches = sc.nextInt();
			centimeter = 30.48 * feet + 2.54 * inches;
			System.out.println("The height calculated in centimeters are:" + centimeter);
		} else if (selection == 2) {
			int cent;
			int feet, inches;
			System.out.println("Enter the height in centimeters:");
			cent = sc.nextInt();
			feet = (int) (cent / 30.48);
			inches = (int) (cent % 2.54 * 12);
			System.out.println("The height calculated in feet and inches respectively are:" + feet + "\t" + inches);

		} else {
			System.out.println("You have entered the wrong choice");

		}
	}

}
