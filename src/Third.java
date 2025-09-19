package com.game;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Choose your class: \n 1)WARRIOR\n 2)MAGE\n 3)ARCHER\n");
			while(!sc.hasNextInt() ) {
				System.out.println("Please enter a number fom 1-3");
				sc.next();
				
			}
			choice = sc.nextInt();
			
		}while (choice < 1 || choice > 3);
		System.out.println("You picked class number : " + choice);
		sc.close();
	}

}
