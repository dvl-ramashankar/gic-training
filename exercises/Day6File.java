package com.example.demo.exercises;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Day6File {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("animals.txt", true);
		PrintWriter out = new PrintWriter(fw);

		out.println("dog");
		out.println("lion");

		out.close();
	}
}