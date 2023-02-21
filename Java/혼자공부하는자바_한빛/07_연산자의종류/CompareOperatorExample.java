package sec03.exam01;
/*
작성자: 김보람
작성일: 2023-02-21
 */
public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2); // == num1과 num2가 같은지
		boolean result2 = (num1 != num2); // != num1과 num2가 다른지
		boolean result3 = (num1 <= num2); // <= num1이 num2보다 작거나 같은지
		
		System.out.println("result1: " + result1);
		System.out.println("result1: " + result2);
		System.out.println("result1: " + result3);

		char char1 = 'A'; // 유니코드: 65
		char char2 = 'B'; // 유니코드: 66
		boolean result4 = (char1 < char2);
		System.out.println("result4: " + result4);
		
		
	}

}
