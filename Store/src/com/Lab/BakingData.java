package com.Lab;

import java.util.Scanner;

//INTIALIZATION
public class BakingData {
	private static int eggsAmount;
	private int eggsMin = 1;
	private static int milkAmount;
	private int milkMin = 200; // milliliter
	private static int flourAmount;
	private int flourMin = 100; // grams

	// INTRODUCTION
	public String intro(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Please input your name...");
		String chefName = name.nextLine();
		System.out.println("Hello Chef " + chefName + "!");
		System.out.println("Factory is starting up...");
		return chefName;
	}

	// INGREDIENTS
	public int chefInput() {
		System.out.println("How many eggs do you have?");
		Scanner chefInput;
		chefInput = new Scanner(System.in);
		setEggsAmount(chefInput.nextInt());
		System.out.println("You have " + getEggsAmount() + " eggs...");
		// EGGS

		System.out.println("How much milk do you have?");
		chefInput = new Scanner(System.in);
		setMilkAmount(chefInput.nextInt());
		System.out.println("You have " + getMilkAmount() + "ml of milk...");
		// MILK

		System.out.println("How much flour do you have?");
		chefInput = new Scanner(System.in);
		setFlourAmount(chefInput.nextInt());
		System.out.println("You have " + getFlourAmount() + "g of flour...");
		// FLOUR
		return getEggsAmount();
	}

	// MAIN CODE
	public void main(String[] args) {
		System.out.println("");
		if (getEggsAmount() < eggsMin || getMilkAmount() < milkMin || getFlourAmount() < flourMin) {
			System.out.println("Insufficient materials... Please proceed to store...");
		} else {
			setEggsAmount(getEggsAmount() / eggsMin);
			System.out.println("you have " + getEggsAmount() + " portions of eggs...");

			setMilkAmount(getMilkAmount() / milkMin);
			System.out.println("you have " + getMilkAmount() + " portions of milk...");

			setFlourAmount(getFlourAmount() / flourMin);
			System.out.println("you have " + getFlourAmount() + " portions of flour...");
		}

	}

	public int status() {
		// INVENTORY CHECK
		int smallest;
		if (getEggsAmount() <= getMilkAmount() && getMilkAmount() <= getFlourAmount()) {
			smallest = getEggsAmount();
		} else if (getMilkAmount() <= getFlourAmount() && getMilkAmount() <= getEggsAmount()) {
			smallest = getMilkAmount();
		} else {
			smallest = getFlourAmount();
		}

		// STATUS
		System.out.println("");
		System.out.println("You can make " + smallest * 4 + " pieces of cookies...");
		System.out.println("");
		System.out.println("You will need " + smallest * eggsMin + " eggs...");
		System.out.println("You will need " + smallest * milkMin + " ml of milk...");
		System.out.println("You will need " + smallest * flourMin + " grams of flour...");
		System.out.println("");
		System.out.println("Factory is shutting down...");
		return smallest;
	}

	// SETTER
	public void eggsAmount(int eggsAmount) {
		this.setEggsAmount(eggsAmount);
	}

	public void eggsMin(int eggsMin) {
		this.eggsMin = eggsMin;
	}

	public void milkAmount(int milkAmount) {
		this.setMilkAmount(milkAmount);
	}

	public void milkMin(int milkMin) {
		this.milkMin = milkMin;
	}

	public void flourAmount(int flourAmount) {
		this.setFlourAmount(flourAmount);
	}

	public void flourMin(int flourMin) {
		this.flourMin = flourMin;
	}

	// GETTER

	public int milkAmount() {
		return this.getMilkAmount();
	}

	public int milkMin() {
		return this.milkMin;
	}

	public int eggsAmount() {
		return this.getEggsAmount();
	}

	public int eggsMin() {
		return this.eggsMin;
	}

	public int flourAmount() {
		return this.getMilkAmount();
	}

	public int flourMin() {
		return this.flourMin;
	}

	public static int getFlourAmount() {
		return flourAmount;
	}

	public void setFlourAmount(int flourAmount) {
		this.flourAmount = flourAmount;
	}

	public static int getMilkAmount() {
		return milkAmount;
	}

	public void setMilkAmount(int milkAmount) {
		this.milkAmount = milkAmount;
	}

	public static int getEggsAmount() {
		return eggsAmount;
	}

	public void setEggsAmount(int eggsAmount) {
		this.eggsAmount = eggsAmount;
	}
}