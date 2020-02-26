package com.Lab;

import java.util.Scanner;

public class Store extends BakingData {
	public static void inventory() {
		System.out.println("You currently have: ");
		System.out.println("Eggs:\t " + getEggsAmount());
		System.out.println("Milk: " + getMilkAmount());
		System.out.println("Flour: " + getFlourAmount());

	}

	{
		int blank[] = new int[3];
		blank[0] = 0;
		blank[1] = 0;
		blank[2] = 0;

		int prices[] = new int[3];
		prices[0] = 5;
		prices[1] = 45;
		prices[2] = 30;

		inventory();

		DisplayMenu(); // display menu method

		SelectItem(blank, prices); // select item method

	}
//menu of the product1

	public static void DisplayMenu() {
		System.out.println();
		System.out.println("----Menu-----");
		System.out.println("[1] Eggs....... 5.00");
		System.out.println("[2] Milk....... 45.00");
		System.out.println("[3] Flour....... 30.00");
		System.out.println();
	}

	public static void SelectItem(int b[], int k[]) {
		Scanner input = new Scanner(System.in);
		String another; // dictates for another entry
		int quantity;
		int item;
		do {
			System.out.print("Select Item: ");
			item = input.nextInt();
			System.out.print("Select Quantity: ");
			quantity = input.nextInt();

			// array
			switch (item) {
			case 1:
				b[0] = +quantity;
				break;
			case 2:
				b[1] = +quantity;
				break;
			case 3:
				b[2] = +quantity;
				break;
			case 4:
				b[3] = +quantity;
				break;
			}
			System.out.print("Select another item? Press[Y] to proceed, [N] to checkout... ");
			another = input.next();
		} while (another.charAt(0) == 'y' || another.charAt(0) == 'Y');

		System.out.println("\t BILL");
		if (b[0] != 0) {
			System.out.print("\t" + "Eggs" + "\t");
			System.out.print("\t QUANTITY: " + k[0] + "\t");
			k[0] *= quantity;
			System.out.println(k[0]);
		}
		if (b[1] != 0) {
			System.out.print("\t" + "Milk" + "\t");
			System.out.print("\t QUANTITY: " + k[1] + "\t");
			k[1] *= quantity;
			System.out.println(k[1]);
		}
		if (b[2] != 0) {
			System.out.print("\t" + "Flour" + "\t");
			System.out.print("\t QUANTITY: " + k[2] + "\t");
			k[2] *= quantity;
			System.out.println(k[2]);
		}

		int total = (k[0] + k[1] + k[2]);
		System.out.println("\tTOTAL:\t" + total);
		System.out.println("\tAMOUNT RECEIVED");
		System.out.println("\tEnter Amount: ");
		int payment = input.nextInt();
		System.out.println("\tChange\t\t\t\t" + (payment - total));
	}

}