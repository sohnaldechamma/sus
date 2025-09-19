package com.game;

public class First {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Quest starts in...");
		for(int i = 5;i > 0;i--) {
			System.out.println(i + "...");
			Thread.sleep(1000);
		}
		System.out.println("GO! The adventure begins!\n");
	}

}
