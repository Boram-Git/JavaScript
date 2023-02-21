package sec03;

/*
작성자: 김보람
작성일: 2023-02-21
 */

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println(result1); // output>> 7
		
		int result2 = v1 - v2;
		System.out.println(result2); // output>> 3
		
		int result3 = v1 * v2;
		System.out.println(result3); // output>> 10
		
		int result4 = v1 / v2;
		System.out.println(result4); // output>> 2가 나옴 why? int 타입으로 연산하면 소수점 이하 부분을 버리고 2만 출력된다.
		
		int result5 = v1 % v2;
		System.out.println(result5); // output>> 1
		
		double result6 = (double)v1 % v2;
		System.out.println(result6); // output>> 1.0 
		
		double result7 = (double)v1 / v2;
		System.out.println(result7); // output>> 2.5

	}

}
