import java.util.Locale;
import java.util.Scanner;


public class P3_PointInsideAFigure {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		
		for(int i = 0; i < 10; i++){
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			
			if(a < 12.5 || a > 22.5 || b < 6 || b > 13.5){
				System.out.println("Outside");
			}else if(b > 8.5 && a > 17.5 && a < 20){
				System.out.println("Outside 2");
			}else{
				System.out.println("Inside!");
			}
		}
		
		scanner.close();
	}

}
