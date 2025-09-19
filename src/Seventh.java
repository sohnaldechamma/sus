package com.game;
import java.util.Scanners;
import java.util.ArrayList;
import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		Inventory.add("Sword");
		Inventory.add("Potion");
		Inventory.add("Shield");
		
		boolean running = true;
		
		while(running) {
			System.out.println("\n-- ADVENTURE MENU --");
			System.out.println("1: Explore");
			System.out.println("2: Rest");
			System.out.println("3: Quit");
			System.out.println("Choose your action:");
			
			int choice = sc.nextInt();
			sc.nextLine()
			
			switch (choice) {
			case 1:
				System.out.println("Enter items to add: ");
				String newItem = sc.newItem();
				inventory.add(newItem);
				System.out.println(newItem + "added");
				break;
				
			case 2:
				System.out.println("Enter item to remove.");
				String removeItem = sc.nextLine();
				if (inventory.remove(removeItem))
					System.out.println(removeItem + "removed");
				break;
				
			case 3:
				System.out.println("Exiting...");
				running = false;
				break;
			default:
				System.out.println("That's not an option. Try again.");
			}
		}
		Scanner.close();
		}
	}

