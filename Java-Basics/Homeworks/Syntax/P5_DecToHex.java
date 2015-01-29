import java.util.Scanner;


public class P5_DecToHex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		String hex = Integer.toHexString(n);
		System.out.println(hex);
		scanner.close();
	}

}
