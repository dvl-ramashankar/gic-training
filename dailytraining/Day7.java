package com.example.demo.dailytraining;

//Serialization
import java.io.Serializable;
import java.io.*;

 class Day implements Serializable {
	int id;
	String name;

	public Day(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Day7 {
	public static void main(String args[]) {
		try {
			Day emp1 = new Day(1, "rk");
			Day emp2 = new Day(2, "pk");
			Day emp3 = new Day(3, "ck");
			FileOutputStream fout = new FileOutputStream("names.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(emp1);
			out.writeObject(emp2);
			out.writeObject(emp3);
			out.flush();
			out.close();
			System.out.println("Serialization is been successfully executed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}