import java.util.Scanner;


public class P7_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		System.out.println("String way: " + countOfOnes(n));
		System.out.println("Binary way: " + countOfOnesBinary(n));
		scanner.close();
	}
	
	public static int countOfOnes(int n){
		int count = 0;
		String nStr = Integer.toBinaryString(n);
		
		for(int i = 0; i < nStr.length(); i++){
			if(nStr.charAt(i) == '1'){
				count++;
			}
		}
		return count;
	}
	
	public static int countOfOnesBinary(int n){
		int count = 0;
		
		while(n != 0){
			if((1&n) == 1) count++;
			n >>= 1;
		}
		return count;
	}
}
