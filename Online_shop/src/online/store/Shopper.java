package online.store;

import java.util.Scanner;

public class Shopper {
	int k = 0, n = 4, i = 0, h = 0, k1 = 0;
	int line;
	public String input;
	Bag bag = new Bag();
	Shoes shoes = new Shoes();
	Scanner input1 = new Scanner(System.in);

	public void shopper() {

		System.out.print("Brand Bag");
		String s = input1.next();
		System.out.print("Count Bag");
		String s1 = input1.next();
		for (String t : bag.getBrands()) {
			if (s.equals(t)) {
				h = bag.counts[k] - Integer.parseInt(s1);
				System.out.println(h);
			}
			k = k + 1;
		}
		if (h == 0) {
			System.out.println("Please we havn't this Brand");
		}
		System.out.print("Brand Shoes");
		String p = input1.next();
		System.out.print("Count Shoes");
		String p1 = input1.next();
		for (String t : shoes.getBrands()) {
			if (p.equals(t)) {

				h = shoes.counts[k] - Integer.parseInt(p1);
				System.out.println(h);
			}
			k1 = k1 + 1;
		}

	}

	/*
	 * public void ChoseShoper() { System.out.println("This is Shoes");
	 * shoes.sale(); System.out.println("Brand = " + shoes.getBrand());
	 * System.out.println("Quality = " + shoes.getQuality());
	 * System.out.println("Total count = " + shoes.getCount() + "\n"); }
	 * 
	 * public void ChoseBag() { System.out.println("This is Bag"); bag.sale();
	 * System.out.println("Brand = " + bag.getBrand());
	 * System.out.println("Quality = " + bag.getQuality());
	 * System.out.println("Total count = " + bag.getCount() + "\n");
	 * 
	 * }
	 */
}