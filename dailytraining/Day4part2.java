//package
package com.example.demo.dailytraining;

class Animal {
	public void sound() {
		System.out.println("Animal ");
	}
	public void eating() {
		System.out.println("Animal is eating ");
	}
}

//inheritance //modifier used public
public class Day4part2 extends Animal {
	//overriding
	public void sound() {
		System.out.println("Animal is making a sound");
	}

	public static void main(String args[]) {
		//object creating
		Animal obj = new Day4part2();
		obj.sound();
		obj.eating();
	}
}

