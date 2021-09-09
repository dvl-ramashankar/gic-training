package com.example.demo.dailytraining;


	import java.util.regex.*;  
	class Day6part1{  
	   public static void main(String args[]){  
	      String content = "This is RK " +
		    "from Beginnersbook.com.";

	      String pattern = ".*book.*";

	      boolean isMatch = Pattern.matches(pattern, content);
	      System.out.println("The text contains 'book'? " + isMatch);
	   }
	}  

