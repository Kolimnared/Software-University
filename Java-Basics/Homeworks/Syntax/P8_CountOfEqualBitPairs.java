import java.util.Scanner;


public class P8_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		System.out.println(Integer.toBinaryString(n));
		System.out.println("Count: " + countOfEqualsBitPairs(n));
		
		scanner.close();
	}
	
	public static int countOfEqualsBitPairs(int n){
		int count = 0;
		
		while(n > 1){
			int cur = n&1;
			int prev = ((n&2) >> 1);
			if(cur == prev){
				count++;
			}
			
			n >>= 1;
		}
		return count;
	}
}
