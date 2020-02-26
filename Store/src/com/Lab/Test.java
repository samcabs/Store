package com.Lab;

public class Test {
	public static void main(String[] args) {
		BakingData t1 = new BakingData();
		t1.intro(args);
		t1.chefInput();
		t1.main(args);
		t1.status();

		Store t2 = new Store();
		Store.inventory();
		Store.DisplayMenu();
		int[] b = null;
		int[] k = null;
		Store.SelectItem(b, k);
	}
}
