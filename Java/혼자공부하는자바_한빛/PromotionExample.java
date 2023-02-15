package sec03;

/*
작성자: 김보람
작성일: 2023-02-15
 */

public class PromotionExample {
	public static void main(String[] args) {
		
		//  자동 타입 변환
		byte byteValue = 10;	// byte타입에 byteValue 선언하고, 값 10을 생성(초기화) 					
		int intValue = byteValue; // 작은허용범위타입 byte -> 큰허용범위타입 int로 타입변환
		System.out.println("intValue: " + intValue);
		
		char charValue = '가'; // char타입에 charValue 선언하고, 값 '가'를 생성(초기화)
		intValue = charValue; // 변수 intValue에 charValue 초기화
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50; // 변수 intValue에 값 50을 초기화
		long longValue = intValue; // 변수 long 선언과 동시에 intValue 초기화
		System.out.println("longValue: " + longValue);
		
		longValue = 100; // 변수 longValue에 값 100을 초기화
		float floatValue = longValue; // 변수 float를 선언과 동시에 longValue 초기화
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F; //  변수 float에 100.5F 초기화
		double doubleValue = floatValue; //doubleValue 선언과 동시에 floatVlaue 초기화
		System.out.println("doubleValue: " + doubleValue);
	}
}