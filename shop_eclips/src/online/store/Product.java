package online.store;

public class Product {
private String brand,quality;
 private int count,gin;

public int getGin() {
	return gin;
}
public void setGin(int gin) {
	this.gin = gin;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public String getQuality() {
	return quality;
}
public void setQuality(String quality) {
	this.quality = quality;
}
public String getBrand() {
	return brand;
	
}
public void setBrand(String brand) {
	this.brand = brand;
}
public void sale() {
	
	this.gin = this.gin+this.gin/3;
	System.out.println("Value="+getGin());
	
}
}
