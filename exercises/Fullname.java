package com.example.demo.exercises;

import java.util.Scanner;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.List;
import java.util.LinkedList;

public class Fullname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first_name, last_name, full_name, reverse_first_name = "", reverse_last_name = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, Type your first name:");
		first_name = sc.next();
		System.out.println("Please, Type your last name:");
		last_name = sc.next();
		full_name = first_name + "\t" + last_name;
		System.out.println("Your full name is :\t" + full_name);
		System.out.println("Your first name has \t " + first_name.length() + "\t characters");
		System.out.println("Your last name has \t " + last_name.length() + "\t characters");
		for (int i = first_name.length() - 1; i >= 0; i--) {
			reverse_first_name = reverse_first_name + first_name.charAt(i);
		}
		for (int i = last_name.length() - 1; i >= 0; i--) {
			reverse_last_name = reverse_last_name + last_name.charAt(i);
		}

		System.out.println("Your full name in reverse order is :\t" + (reverse_first_name + "\t" + reverse_last_name));
		StringBuffer sb = new StringBuffer();
		char ch[] = full_name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String hexString = Integer.toHexString(ch[i]);
			sb.append(hexString);
		}
		String result = sb.toString();
		System.out.println("Your full name in hexadecimal form:\t " + result);

		System.out.println("Your full name in random order is:");

		for (int j = 0; j < 5; j++) {
			List<Character> characters = new LinkedList<>();

			for (char c : full_name.toCharArray()) {
				characters.add(c);
			}
			StringBuffer s = new StringBuffer("");
			for (int i = 0; i < full_name.length(); i++) {
				int randomPosition = new Random().nextInt(characters.size());
				s = s.append(characters.get(randomPosition));
				characters.remove(randomPosition);
			}

			System.out.println(s);
		}
	}

}
