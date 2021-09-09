package com.example.demo.dailytraining;

//Enum
enum Directions {
	EAST, WEST, NORTH, SOUTH
}

public class Day5part1 {

	public static void main(String args[]) {
		Directions dir = Directions.NORTH;
		if (dir == Directions.EAST) {
			System.out.println("Direction: East");
		} else if (dir == Directions.WEST) {
			System.out.println("Direction: West");
		} else if (dir == Directions.NORTH) {
			System.out.println("Direction: North");
		} else {
			System.out.println("Direction: South");
		}
	}
}
