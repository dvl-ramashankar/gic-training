package com.example.demo.exercises;

import java.util.Scanner;

public class Game {
	public static void main(String args[]) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("This is a computer game. Please eneter the number which is range 1...2147");
		i = sc.nextInt();
		System.out.println("My number are: " + (i * 2) + "\t," + (i * 2 + 1) + "\t," + (i * 2 + 2));
		System.out.println("Sorry, you lost the game");
		System.out.println("i have more and larger number");
		System.out.println("Let's play another game.Please,enter the integer which is range 1....2147");
		j=sc.nextInt();
		System.out.println("My number are: " + (j / 2) + "\t," + (j / 2 -1) + "\t," + (j /2 -2));
		System.out.println("You won the game!");
		System.out.println("I have only samll number");
	}

}
