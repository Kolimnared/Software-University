import java.util.Scanner;


public class P1_RectangleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Area: " + area(a, b));
		scanner.close();
	}
	
	public static int area(int a, int b){
		return a * b;
	}

}
