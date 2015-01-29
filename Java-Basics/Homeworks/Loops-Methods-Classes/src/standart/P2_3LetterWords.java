package standart;

import java.util.ArrayList;
import java.util.Scanner;

public class P2_3LetterWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> letters  =new ArrayList<Character>();
		
		String str = scanner.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			letters.add(str.charAt(i));
		}
		
		for(char a : letters){
			for(char b : letters){
				for(char c : letters){
					System.out.println("" + a + b + c + ' ');
				}
			}
		}
		
		scanner.close();
	}

}
