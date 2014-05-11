package online.store;

import java.util.Scanner;

public class Store {
	int h = 0;
	int h1 = 0;

	int line;
	public String input;
	Bag bag = new Bag();
	Shoes shoes = new Shoes();

	Scanner input1 = new Scanner(System.in);
	public void shopper() {
		int k = 0;
		int k1 = 0;
		System.out.print("Brand Bag ");
		String s = input1.next();
		System.out.print("Count Bag ");
		String s1 = input1.next();
		for (String t : bag.getBrands()) {
			if (s.equals(t)) {
				bag.setCounts(new int[] { bag.getCounts()[0],
						bag.getCounts()[1],
						bag.getCounts()[k] - Integer.parseInt(s1),
						bag.getCounts()[3] });
				System.out.println(bag.getCounts()[k]);
			}
			k = k + 1;
		}
		if (k == 4) {
			System.out.println("Please we havn't this Brand");
		}
		System.out.print("Brand Shoes ");
		String p = input1.next();
		System.out.print("Count Shoes ");
		String p1 = input1.next();
		for (String t1 : shoes.getBrands()) {
			if (p.equals(t1)) {

				shoes.setCounts(new int[] { shoes.getCounts()[0],
						shoes.getCounts()[1],
						shoes.getCounts()[k1] - Integer.parseInt(p1),
						shoes.getCounts()[3] });
				System.out.println(shoes.getCounts()[k1]);
			}
			k1 = k1 + 1;
		}

	}
	

}
