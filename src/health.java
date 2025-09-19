package com.game;

public class health {

	public static void main(String[] args) { 
		int health = 100;
		hbar(health);
		
		int damage = 30;
		health = critDmg(health,damage);
		hbar(health);
		
		isAlive(health);
		
		health = heal(health,20);
		hbar(health);
		
		isAlive(health);

	}
	public static void hbar(int hp) {
		int bars = hp / 10;
		System.out.println("HP: |");
		for (int i = 0; i< bars; i++) {
			System.out.print("|");
		}
		for (int i = bars; i < 10; i++) {
			System.out.print(" ");
		}
		System.out.println("] " + hp + "/100");
	}
	
	public static int critDamage(int hp,int dmg) {
		System.out.println("CRITICAL HT! Took" + (dmg * 2)+ " damage!");
		hp -= dmg * 2;
		return Math.max(hp,0);
	}
	
	public static int heal (int hp , int amount) {
		System.out.println("Healed" + amount + "HP!");
		hp += amount;
		return Math.min(hp, 100);
		
	}
	
		public static void isAlive(int hp) {
			if (hp > 0)
				System.out.println("You are alive.");
			}
			else
			{
				System.out.println("You have died.");
			}
	}
}

