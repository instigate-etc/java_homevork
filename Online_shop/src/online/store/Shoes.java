package online.store;

public class Shoes extends Product{
	String[] brands={"Lui_Vuitton","Gucci","DG","Chanel"};
	int[] values={20000,15000,18000,16000};
	int[] counts={15,7,8,3};
public Shoes(){
	setValues(values);
	setBrands(brands);
	setQuality("Bark");
	setCounts(counts);
	}

}
