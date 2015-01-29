import java.util.Scanner;


public class P3_SumOfTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a = ");
		int a = Integer.parseInt(scanner.nextLine());
		System.out.print("b = ");
		int b = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Sum = " + sum(a, b));
	}
	
	public static int sum(int a, int b){
		return a + b;
	}

}
