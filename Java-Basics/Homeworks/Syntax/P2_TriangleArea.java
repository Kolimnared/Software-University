import java.util.Scanner;


public class P2_TriangleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Xa = scanner.nextInt();
		int Ya = scanner.nextInt();
		int Xb = scanner.nextInt();
		int Yb = scanner.nextInt();
		int Xc = scanner.nextInt();
		int Yc = scanner.nextInt();
		
		double AB = distance(Xa, Ya, Xb, Yb);
		double AC = distance(Xa, Ya, Xc, Yc);
		double BC = distance(Xb, Yb, Xc, Yc);
		
		
		System.out.println("Area: " + area(AB, AC, BC));
		scanner.close();
	}

	public static double distance(int X1, int Y1, int X2, int Y2){
		return Math.sqrt(Math.pow((X1 - X2), 2) + Math.pow((Y1 - Y2), 2));
		
	}
	
	public static int area(double A, double B, double C){
		if((A >= B + C) || (B >= A + C) || (C >= A + B)){
			return 0;
		}
		
		double p = (A + B + C) / 2;
		double area = Math.sqrt(p*(p - A)*(p - B)*(p - C));
		if(area > (int)area){
			area++;
		}
		return (int) area;
	}
}
