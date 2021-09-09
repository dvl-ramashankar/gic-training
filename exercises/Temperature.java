package com.example.demo.exercises;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Temperature {
	public static void print_temperature_table() throws Exception {
		System.out.println("celsius" + "\t" + "fahrenheit");
		double fahrenheit = -4;
		for (int celsius = -20; celsius <= 25; celsius += 5) {
			int a = 0;

			System.out.println(celsius + "\t" + fahrenheit + "\n");
			do {
				fahrenheit = fahrenheit + 9;
				a = 2;
			} while (a == 0);
			FileWriter fw = new FileWriter("temperaturevalue.txt",  true);
			 PrintWriter out = new PrintWriter("temperaturevalue.txt");
			 out.println(celsius + "\t" + fahrenheit + "\n");
			 out.close();
			 fw.close();

		}
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, Enter your choice to convert the degrees:" + "\n Type 1 for Fahrenheit to Celsius"
				+ "\n Type 2 for Celsius to Fahrenheit" + "\n Type 3 for both Celsius and Fahrenheit"
				+ "\n Type 0 for printing the table");
		int selection;

		selection = sc.nextInt();

		if (selection == 1) {
			double fahrenheit, convertCelsius;
			System.out.println("Please,Enter the degree in fahrenheit:");
			fahrenheit = sc.nextDouble();
			convertCelsius = (fahrenheit - 32) * 5 / 9;
			System.out.println("Degree converted fahrenheit to celsius:" + convertCelsius);

		} else if (selection == 2) {
			double celsius, convertFahrenheit;
			System.out.println("Please,Enter the degree in fahrenheit:");
			celsius = sc.nextDouble();
			convertFahrenheit = (celsius * 9 / 5) + 32;
			System.out.println("Degree converted celsius to fahrenheit:" + convertFahrenheit);

		} else if (selection == 3) {
			double number, convertFahrenheit, convertCelsius;
			System.out.println("Please,Enter the number:");
			number = sc.nextDouble();

			convertFahrenheit = (number * 9 / 5) + 32;
			convertCelsius = (number - 32) * 5 / 9;
			System.out.println("Number degree converted in fahrenheit and celsius respectively are:" + convertFahrenheit
					+ "\t" + convertCelsius);

		} else if (selection == 0) {
			print_temperature_table();
		} else {

			System.out.println("You have entered the wrong choice");
		}

	}
}
