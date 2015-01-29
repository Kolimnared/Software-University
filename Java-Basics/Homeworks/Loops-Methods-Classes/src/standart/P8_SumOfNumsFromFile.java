package standart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P8_SumOfNumsFromFile {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("input.txt"));
			
			int sum = 0;
			while(scanner.hasNextLine()){
				int n = Integer.parseInt(scanner.nextLine());
				sum += n;
			}
			System.out.println("Sum = " + sum);
		} catch (FileNotFoundException e) {
			System.err.println("File Not Found!");
			System.exit(1);
		}finally{
			if(scanner != null){
				scanner.close();
			}
		}	
	}

}
