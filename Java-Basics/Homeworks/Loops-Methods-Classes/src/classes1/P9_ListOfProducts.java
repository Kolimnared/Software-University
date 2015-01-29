package classes1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.Scanner;

public class P9_ListOfProducts {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		PrintStream output = null;
		Scanner input = null;
		try {
			input = new Scanner(new File("products.txt"));
			output = new PrintStream("sortedProducts.txt");
			while(input.hasNextLine()){
				String productStr[] = input.nextLine().split("\\s");
				products.add(new Product(productStr[0], new BigDecimal(Double.parseDouble(productStr[1]))));
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("File \"products.txt\" not found!");
		}finally{
			if(input != null){
				input.close();
			}
		}
		
		
		//Collections.sort(products);
		Collections.sort(products, Product.Comparators.NAME);
		System.out.println("Sorted by name: ");
		printInStream("Sorted By Name:", output);
		for(Product product : products){
			System.out.println(product.toString());
			printInStream(product.toString(), output);
		}
		
		//Collections.sort(products, Product.ProductPriceComparator);
/*		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product a, Product b){
				return a.getprice().compareTo(b.getprice());
			}
		});*/
		
		Collections.sort(products, Product.Comparators.PRICE);
		System.out.println("\nSorted by price: ");
		printInStream("\r\nSorted By Price:", output);
		for(Product product: products){
			System.out.println(product.toString());
			printInStream(product.toString(), output);
		}
		
		if(output != null){
			output.close();
		}
	}
	
	public static void printInStream(String str, PrintStream output){
		if(output != null){
			output.println(str);
		}
	}
}
