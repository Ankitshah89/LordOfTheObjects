package com.skilldistillery.LordOfTheObjects;

import java.util.Scanner;

public class CohortSD25 extends WarriorAttributes implements Debatable {

	// F i e l d s
	protected int choice;
	// M e t h o d s

	public CohortSD25() {

	}

	public CohortSD25(int hp, String name, int speed, int strength) {
		super(hp, name, speed, strength);

	}

	@Override
	public int attack() {
		return (int) (1 + (Math.random() * 40));
	}

	public boolean isAlive() {

		if (hp <= 0) {

			System.out.println("You Lose!!");
			System.out.println("Lord Alex Schooled Ya!");
			System.out.println();
			return false;

		}
		return true;
	}


	public void message(int choice) {
		switch (choice) {
		case 1:
			System.out.println(name + ": Spitball Attack! Head Shot!!");
			break;
		case 2:
			System.out.println(name + ": SD25 Class Skip Day!!! The jokes on you!!");
			break;
		case 3:
			System.out.println(name + ":  Just sitting here daydreaming not listening to a thing you say!!");
			break;
		}

	}

	public void damagePtsSpeed(WarriorAttributes damage) {

		int damagePts = (int) ((Math.random() * 20));
		damage.speed -= damagePts;
		System.out.println(damage.name + "'s Speed is down to:\t\t " + damage.speed);

	}

	public void damagePtsStrength(WarriorAttributes damage) {

		int damagePts = (int) ((Math.random() * 20));
		damage.strength -= damagePts;
		System.out.println(damage.name + "'s Strength is down to:\t\t " + damage.strength);

	}
	public void damagePtsHp(WarriorAttributes damage) {
		
		int damagePts = attack();
		damage.hp -= damagePts;
		if (damage.hp < 0) {
			damage.hp = 0;
		}
		System.out.println(damage.name + "'s Health is down to:\t\t " + damage.hp);
		
	}

	public void playerAttack(Scanner kb) {

		printMenu();
		int option = kb.nextInt();
		message(option);
		this.choice = option;
		System.out.println();

		while (option < 1 || option > 3) {
			System.out.println("Invalid Choice !");
			printMenu();
			option = kb.nextInt();

		}

	}

	private void printMenu() {
		System.out.println("Attack Option (1-3)");
		System.out.println();
		System.out.println("1. SpitBall");
		System.out.println("2. No Show");
		System.out.println("3. DayDream");

		System.out.print("Choose : ");
	}
}
