package com.example.demo.exercises;

import java.util.Scanner;

public class Miles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char selection;
		System.out
				.println("This program prints conversion tables." + "\n Typea character to select a conversion table");
		System.out.println("m miles to kilometers" + "\n k kilometers to miles" + "\n p pounds to kilometers"
				+ "\n x exit the program");
		Scanner sc = new Scanner(System.in);
		selection = sc.next().charAt(0);
		if (selection == 'm') {
			System.out.println("miles" + "\t" + "kilometers");
			for (int i = 10; i <= 110; i += 10) {
				System.out.println(i + "\t" + (i * 1.60934));
			}
		} else if (selection == 'k') {
			System.out.println("kilometers" + "\t" + "miles");
			for (int i = 10; i <= 110; i += 10) {
				System.out.println(i + "\t" + (i * 0.621));
			}
		} else if (selection == 'p') {
			System.out.println("pounds" + "\t" + "kilometers");
			for (int i = 10; i <= 110; i += 10) {
				System.out.println(i + "\t" + (i * 0.4536));
			}
		} else if (selection == 'x') {
			System.out.println("program has ended");

		} else {
			System.out.println("you have entered the wrong choice");
		}

	}
}