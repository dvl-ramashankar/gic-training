package com.example.demo.exercises;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[7];
		int count = 0, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array and range is 1...39");
		do {
			boolean flag = true;
			n = sc.nextInt();
			if (n >= 1 && n <=39) {
				for (int i = 0; i < count; i++) {
					if (n == arr[i]) {
						flag = false;
						System.out.println("That integer is already been given.Enter element again in given range");
						break;
					}
				}
				if (flag)
					arr[count] = n;
				else
					continue;
			} else {
				System.out.println("enter the number which is out of range");
				break;
			}
			count++;
		} while (count < 7);
		System.out.println("the array elements in reverse order are:");
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println("\nthe array elements in normal order are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
