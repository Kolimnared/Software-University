package standart;

public class P3_FullHause {

	public static void main(String[] args) {
		String[] suites = {"♣", "♦", "♥", "♠"};
		String faces[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		int count = 0;
		
		for (int face1 = 0; face1 < faces.length; face1++) {
			for (int face2 = 0; face2 < faces.length; face2++) {
				for (int suit1f1 = 0; suit1f1 < suites.length; suit1f1++) {
					for (int suit2f1 = suit1f1 + 1; suit2f1 < suites.length; suit2f1++) {
						for (int suit3f1 = suit2f1 + 1; suit3f1 < suites.length; suit3f1++) {
							for (int suit1f2 = 0; suit1f2 < suites.length; suit1f2++) {
								for(int suit2f2 = suit1f2 + 1; suit2f2 < suites.length; suit2f2++){
									if(face1 != face2){
										System.out.format("%2s%s %2s%s %2s%s %2s%s %2s%s", faces[face1], suites[suit1f1], faces[face1], suites[suit2f1], 
														 faces[face1], suites[suit3f1], faces[face2], suites[suit1f2], faces[face2], suites[suit2f2] );
										++count;
										if(count % 6 == 0){
											System.out.println();
											if(count % 24 == 0){
												System.out.println();
											}
										}else{
											System.out.print(" ... ");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count + " Full Houses!");
	}
	
	
}
