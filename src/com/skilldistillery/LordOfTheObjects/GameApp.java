package com.skilldistillery.LordOfTheObjects;

import java.util.Scanner;

public class GameApp {

	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		GameApp ga = new GameApp();

		ga.run();

	}

	public void run() {
		System.out.println("\t\tWelcome to the Dungeon");
		System.out.println("\t\t----------------------");
		System.out.print("Enter your name: ");
		String name = kb.nextLine();

		boolean play = true;
		do {

			CohortSD25 Player1 = new CohortSD25(100, name, 100, 100);
			LordAlex Player2 = new LordAlex(100, "Alex", 100, 100);

			boolean alive = true;
			do {
				Player1.playerAttack(kb);

				Player1.damagePtsHp(Player2);
				Player1.damagePtsSpeed(Player2);
				Player1.damagePtsStrength(Player2);
				Player1.message(Player1.choice);
				System.out.println();

				System.out.println();
				Player2.message();
				Player2.damagePtsHp(Player1);
				Player2.damagePtsSpeed(Player1);
				Player2.damagePtsStrength(Player1);
				System.out.println();

				if (Player1.isAlive() == false || Player2.isAlive() == false) {
					alive = false;
				}

			} while (alive);
			System.out.print("Press \"Y\" to play again : ");
			String playAgain = kb.next();
			if (playAgain.equalsIgnoreCase("Y")) {

				play = true;
			} else {
				System.out.println("Thanks For Playing!");
				play = false;

			}
		} while (play);
	}

}
