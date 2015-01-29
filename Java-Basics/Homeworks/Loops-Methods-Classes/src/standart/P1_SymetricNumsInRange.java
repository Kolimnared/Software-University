package standart;

import java.util.Scanner;

public class P1_SymetricNumsInRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int beg = scanner.nextInt();
		int end = scanner.nextInt();
		
		for (int i = beg; i <= end; i++) {
			if(isSymetric(i)){
				System.out.print(i + " ");
			}
		}
		scanner.close();

	}
	
	public static boolean isSymetric(int n){
		if(n < 10){
			return true;
		}else if(n < 100 && (n % 10 != 0) && (n % 10) == (n / 10)){
			return true;
		}else if(n > 99 && (n % 10 == n / 100)){
			return true;			
		}
		return false;
	}

}
