package standart;

import java.util.ArrayList;

public class P6_RandomHandsOf5Cards {

	public static void main(String[] args) {
		String[] suites = {"♣", "♦", "♥", "♠"};
		String faces[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		ArrayList<String> deck = new ArrayList<String>();
		for(String face : faces){
			for(String suit : suites){
				deck.add(face.concat(suit));
			}
		}
		
		for (int i = 0; i < 13; i++) {
			for(int j = 0; j < 4; j++){
				int index =(int)(Math.random() * deck.size());
				System.out.printf("%3s ", deck.get(index));
				deck.remove(index);
			}
			System.out.println();
		}
	}
}
