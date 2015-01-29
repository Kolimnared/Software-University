package classes1;

import java.math.BigDecimal;
import java.util.Comparator;

public class Product implements Comparable<Product>{
	private String name;
	private BigDecimal price;
	
	public Product(String name, BigDecimal price) {
		super();
		setName(name);
		setprice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getprice() {
		return price;
	}

	public void setprice(BigDecimal price) {
		this.price = price.setScale(2, BigDecimal.ROUND_UP);
	}
	@Override
	public int compareTo(Product compareProduct){
		String compareName = compareProduct.getName();
		return this.getName().compareToIgnoreCase(compareName);
	}
	
	/*public static Comparator<Product> ProductPriceComparator = new Comparator<Product>(){
		@Override
		public int compare(Product p1, Product p2){
			BigDecimal price1 = p1.getprice();
			BigDecimal price2 = p2.getprice();
			
			return price1.compareTo(price2);
		}
	};*/
	
	@Override
	public String toString(){
		String str = "Name: " + this.name + " - " + this.price + "lv";
		return str;
	}
	
	public static class Comparators{
		public static Comparator<Product> PRICE = new Comparator<Product>(){
			@Override
			public int compare(Product p1, Product p2){
				BigDecimal price1 = p1.getprice();
				BigDecimal price2 = p2.getprice();
				
				return price1.compareTo(price2);
			}
		};
		
		public static Comparator<Product> NAME = new Comparator<Product>(){
			@Override
			public int compare(Product p1, Product p2){
				
				return p1.getName().compareToIgnoreCase(p2.getName());
			}
		};
	}
}
