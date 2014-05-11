package online.store;

public class MainShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopper shopper=new Shopper("Ani","Vanadzor");
		Shopper shopper1=new Shopper("Aram","Abovyan");
		System.out.println(shopper.getName()+"'s from "+shopper.getCity()+" I choes the");
		Store d = new Store();
		d.shopper();
		System.out.println(shopper1.getName()+"'s from "+shopper1.getCity()+" I choes the");
		d.shopper();
	}

}
