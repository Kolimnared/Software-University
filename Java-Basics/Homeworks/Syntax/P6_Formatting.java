import java.util.Locale;
import java.util.Scanner;


public class P6_Formatting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		
		int a = scanner.nextInt();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		String aStr = String.format("%10s", Integer.toBinaryString(a));
		String aStrFormated = aStr.replace(' ', '0');
		System.out.format("|%-10s|%10s|%-10.2f|%10.3f|",Integer.toHexString(a) ,aStrFormated, b, c);
		scanner.close();
	}

}
