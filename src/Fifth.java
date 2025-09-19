package com.game;

public class Fifth {

	public static void main(String[] args) {
		String[] car = {"Volvo" , "BMW" , "Ford" , "Mazda"};
		
		for(int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		int[][] myNumbers = { {1,4,2},{3,6,8}};
		System.out.println(myNumbers[1][2]);
		
		int[][]myNumber = {{1,4,2},{3,6,8}};
		myNumber[1][2] = 9;
		System.out.println(myNumber[1][2]); 
	    
	    
	    int[][] myNumb = { {1, 4, 2}, {3, 6, 8, 5, 2} };

	    System.out.println("Rows: " + myNumb.length);             
	    System.out.println("Cols in row 0: " + myNumb[0].length); 
	    System.out.println("Cols in row 1: " + myNumb[1].length); 
	    
	    
	    int[][] even = { {1, 4, 2}, {3, 6, 8, 5, 2} };

	    for (int row = 0; row < even.length; row++) {
	      for (int col = 0; col < even[row].length; col++) {
	        System.out.println("myNumbers[" + row + "][" + col + "] = " + even[row][col]);
	      }
	    }
	  }

	}
