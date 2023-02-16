package sec03;

/*
작성자: 김보람
작성일: 2023-02-16
 */

public class OperationPromotionExample {
	
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//  컴파일 에러 예시
		// byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1; // int intValue2 = 1; 책보면 char라고 써있지만 int로 가능
		// 컴파일 에러 예시
		// char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4; // intValue3 / intValue4와 같다
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// 컴파일 에러 예시
		// int intValue6 = 10 / 4.0;
		double doubleValue1 = 10 / 4.0;
		System.out.println(doubleValue1);
		
		int x = 1;
		int y = 2;
		double doubleValue2 = (double) x / y;
		System.out.println(doubleValue2);
	}
}