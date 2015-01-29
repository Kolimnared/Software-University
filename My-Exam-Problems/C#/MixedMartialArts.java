import java.util.Locale;
import java.util.Scanner;


public class MixedMartialArts {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		
		double weightInKilos = Double.parseDouble(scanner.nextLine());
		int dailyIntake = Integer.parseInt(scanner.nextLine());
		int trainingsPerWeek = Integer.parseInt(scanner.nextLine());
		int weeksToGo = Integer.parseInt(scanner.nextLine());
		String weightClass = scanner.nextLine();
		int weightClassInLbs = getLbsFromWeightClass(weightClass);
		
		for (int i = 0; i < weeksToGo; i++) {
			int weeklyConsumption = (int)(7 * weightInKilos * 35) + (2500 * trainingsPerWeek) - (7 * dailyIntake);
			double kilosBurned = (double)weeklyConsumption / 3500;
			weightInKilos -= kilosBurned;
			weightInKilos = roundUp(weightInKilos);
			System.out.println("Week " + (i+1) + ": " + weightInKilos*2.205);
		}
		
		double weightInLbs = weightInKilos * 2.205;
		if(weightInLbs > weightClassInLbs + 1){
			System.out.format("No, %.2f lbs extra\n", Math.abs(roundUp(weightClassInLbs - weightInLbs)));
		}else if(weightInLbs < weightClassInLbs - 1 ){
			System.out.printf("Yes, %.2f lbs less\n", Math.abs(roundUp(weightInLbs - weightClassInLbs)));
		}else{
			System.out.println("Just did it!");
		}
		
		scanner.close();
	}
	
	public static double roundUp(double n){
		n *= 100;
		if(n > (int) n){
			int roundedUpInt = (int)n + 1;
			n = roundedUpInt;
		}
		n /= 100;
		
		return n;
	}
	
	public static int getLbsFromWeightClass(String weightClass){
		switch(weightClass){
			case "featherweight": return 145;
			case "lightweight": return 155;
			case "welterweight": return 170;
			case "middleweight": return 185;
			case "light heavyweight": return 205;
			case "heavyweight": return 265;
			default: return 0;
		}
	}
}
