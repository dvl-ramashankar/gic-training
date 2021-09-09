package com.example.demo.dailytraining;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day5part2 {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Mango");
		arrList.add("Apple");
		arrList.add("Orange");
		System.out.println("The Elements are present in arraylist: ");
		System.out.println(arrList);
		// ArrayList to LinkedList
		LinkedList<String> linkList = new LinkedList<>(arrList);
		System.out.println("The Elements are present in linkedlist:");
		System.out.println(linkList);
	}
}