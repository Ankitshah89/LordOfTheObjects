package com.skilldistillery.LordOfTheObjects;
public class LordAlex extends WarriorAttributes implements Debatable {

	public LordAlex() {

	}

	public LordAlex(int hp, String name, int speed, int strength) {
		super(hp, name, speed, strength);

		// TODO Auto-generated constructor stub
	}

	@Override
	public int attack() {
		return (int) (1 + (Math.random() * 40));
	}

	public boolean isAlive() {

		if (hp <= 0) {

			System.out.println("You Win!!");
			System.out.println("You have solved the meaning of Life!");
			System.out.println();
			return false;

		}
		return true;

	}

	public void damagePtsHp(WarriorAttributes damage) {

		int damagePts = attack();
		damage.hp -= damagePts;
		if (damage.hp < 0) {
			damage.hp = 0;
		}
		System.out.println();
		System.out.println(damage.name + "'s Health is down to:\t\t " + damage.hp);

	}

	public void message() {
		int random = (int) (1 + Math.random() * 3);
		switch (random) {
		case 1:
			System.out.println("Lord Alex: Let's go further down the rabbit hole!!!");
			break;
		case 2:
			System.out.println("Lord Alex: Pop Quiz!!!!");
			break;
		case 3:
			System.out
					.println("Lord Alex: Now let's move on to quantum physics!!!! You'll need this for simple loops.");
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

}
