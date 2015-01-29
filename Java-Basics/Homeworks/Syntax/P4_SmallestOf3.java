import java.util.Locale;
import java.util.Scanner;


public class P4_SmallestOf3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double min = Math.min(a, b);
		min = Math.min(min, c);
		
		System.out.println("MIN: " + min);
		scanner.close();
	}

}
