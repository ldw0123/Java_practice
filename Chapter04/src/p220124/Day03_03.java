package p220124;

public class Day03_03 {

	public static void main(String[] args) {
		
		int number1 = 10;
		System.out.println("number1 = 10 -> "+number1); 	// 10 출력
		
		number1 += 10;
		System.out.println("number1 += 10 -> "+number1); 	// 20 출력
		number1 -= 10;
		System.out.println("number1 -= 10 -> "+number1); 	// 10 출력
		number1 *= 2;
		System.out.println("number1 *= 10 -> "+number1); 	// 20 출력
		number1 /= 2;
		System.out.println("number1 /= 10 -> "+number1); 	// 10 출력
		number1 %= 3;
		System.out.println("number1 %= 10 -> "+number1); 	// 1 출력
	}

}
