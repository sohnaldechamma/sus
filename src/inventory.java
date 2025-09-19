package com.game;

public class inventory {

	public static void main(String[] args) {
		String[] inventory = {"Sword" , "Shield" , "Potion"};
		System.out.println("Your Inventory:");
		for(String item : inventory) {
			System.out.println("-" + item);
		}

	}

}
