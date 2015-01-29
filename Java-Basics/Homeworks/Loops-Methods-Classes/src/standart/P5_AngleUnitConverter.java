package standart;

import java.util.Scanner;

public class P5_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			String input = scanner.nextLine();
			String splitInput[] = input.split("\\s");
			if(splitInput[1].equals("rad")){
				System.out.println(Math.toDegrees(Double.parseDouble(splitInput[0])) + " deg");
			}else if(splitInput[1].equals("deg")){
				System.out.println(Math.toRadians(Double.parseDouble(splitInput[0])) + " rad");
			}else{
				System.err.println("Wrong Input!");
			}
		}
		
		scanner.close();
	}

}
