import java.util.Locale;
import java.util.Scanner;

public class P9_PointInsideTheHouse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		for (int i = 0; i < 10; i++) {
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			
			if(isInsideTriangle(12.5, 8.5,22.5, 8.5, 17.5, 3.5, x, y) || 
				isInsideRectagle(12.5, 17.5, 8.5, 13.5, x, y) ||
				isInsideRectagle(20.0, 22.5, 8.5, 13.5, x, y)){
				System.out.println("Inside!");
			}else{
				System.out.println("Outside!");
			}
		}
		
		scanner.close();
	}
	
	public static boolean isInsideRectagle(double x1, double x2, double y1, double y2, double x, double y){
		if(x >= x1 && x <= x2 && y >= y1 && y <= y2)
			return true;
		return false;
	}
	
	public static boolean isInsideTriangle(double x1, double y1, double x2, double y2, double x3, double y3, double x, double y){
		 /* Calculate area of triangle ABC */
		   double A = area (x1, y1, x2, y2, x3, y3);
		 
		   /* Calculate area of triangle PBC */  
		   double A1 = area (x, y, x2, y2, x3, y3);
		 
		   /* Calculate area of triangle PAC */  
		   double A2 = area (x1, y1, x, y, x3, y3);
		 
		   /* Calculate area of triangle PAB */   
		   double A3 = area (x1, y1, x2, y2, x, y);
		   
		   /* Check if sum of A1, A2 and A3 is same as A */
		   return (A == A1 + A2 + A3);
	}
	
	public static double area(double x1, double y1, double x2, double y2, double x3, double y3){
		return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
	}
}
