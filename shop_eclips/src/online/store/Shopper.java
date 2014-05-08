package online.store;

import java.util.Scanner;

public class Shopper {
	int n = 4, i = 0;
	int line;
	public String input;
	Shoes shoes = new Shoes();
	Bag bag = new Bag();
	Scanner input1 = new Scanner(System.in);

	public void shopper() {

		while (n != 0) {
			i++;
			System.out.println("Shopper " + i
					+ "---------------------------------------");
			System.out.print("count bag ");
			String s = input1.next();
			System.out.print("count shoes ");
			String s1 = input1.next();
			if (bag.getCount() - Integer.parseInt(s) >= 0) {
				bag.setCount(bag.getCount() - Integer.parseInt(s));
				ChoseBag();
				bag.setGin(9000);
			} else {

				System.out.println("Bag is " + bag.getCount());
			}
			if (shoes.getCount() - Integer.parseInt(s1) >= 0) {
				shoes.setCount(shoes.getCount() - Integer.parseInt(s1));
				ChoseShoper();
				shoes.setCount(0);
			} else {
				shoes.setCount(0);

				System.out.println("Shose is " + shoes.getCount());

			}

			n--;
		}

	}

	public void ChoseShoper() {
		System.out.println("This is Shoes");
		shoes.sale();
		System.out.println("Brand = " + shoes.getBrand());
		System.out.println("Quality = " + shoes.getQuality());
		System.out.println("Total count = " + shoes.getCount() + "\n");
	}

	public void ChoseBag() {
		System.out.println("This is Bag");
		bag.sale();
		System.out.println("Brand = " + bag.getBrand());
		System.out.println("Quality = " + bag.getQuality());
		System.out.println("Total count = " + bag.getCount() + "\n");

	}
}
