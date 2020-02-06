package com.skilldistillery.LordOfTheObjects;

public class WarriorAttributes {

	// F i e l d s

	protected int hp;
	protected String name;
	protected int speed;
	protected int strength;

	// M e t h o d s

	public WarriorAttributes() {
		super();
	}

	public WarriorAttributes(int hp, String name, int speed, int strength) {
		super();
		this.hp = hp;
		this.name = name;
		this.speed = speed;
		this.strength = strength;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "WarriorAttributes [hp=" + hp + ", name=" + name + ", speed=" + speed + ", strength=" + strength + "]";
	}

}
