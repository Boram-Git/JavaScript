package sec03;

/*
작성자: 김보람
작성일: 2023-02-15
 */

public class CastingExzmple {
	public static void main(String[] args) {
		
		
		/* 강제타입 변환: 큰 허용 범위 타입을 작은 허용 범위 타입으로 강제로 나눠서 저장한다.
		* 캐스팅 연산자 괄호(작은 허용 범위 타입)를 사용하는데, 괄호 안에 들어가는 타입은 나누는 단위.
		* 예) int 타입은 byte 타입보다 더 큰 허용 범위를 가진다. 따라서 int 타입은 byte타입으로 자동변환되지 않다.
		* 하지만 (byte) 캐스팅 연산자를 사용해서 byte 타입으로 강제 변환할 수 있다.*/
		int intValue = 10;
		byte byteValue = (byte) intValue; // 강제 타입 변환
		System.out.println(byteValue);
		
		/* int 타입은 char 타입보다 더 큰 허용 범위를 가진다. 따라서 int 타입은 char 타입으로 자동 변환되지 않다.
		 * 하지만 (char) 캐스팅 연산자를 사용해서 char 타입으로 강제 변환할 수 있다.
		 * char 타입으로 변환하는 이유는 문자를 출력할 수 있기 때문이다.*/
		int intValue1 = 65;
		char charValue = (char) intValue1;
		System.out.println(charValue); // "A"가 출력
		
		/* 실수타입은 정수타입으로 자동 변환되지 않기 때문에 강제 타입 변환을 해야한다.
		 * 이 경우 소수점 이하 부분은 버려지고, 정수 부분만 저장된다.*/
		double doubleValue = 3.14;
		int intValue2 = (int) doubleValue;
		System.out.println(intValue2);		
	}
}
