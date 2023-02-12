package sec02.exam01;

/*
작성자: 김보람
작성일: 2023-02-12
 */

public class integerLiteralExample {
	public static void main(String[] args) {
		// page.60 - 정수 리터럴 참조
		int var1 = 0b1011; // 변수 var1을 선언하고 0b1011 값을 초기화 '2진수'
		int var2 = 0206;   // 8진수
		int var3 = 365;    // 16진수
		int var4 = 0xb3;   // 16진수
		
		// 반복적인 코드 복붙하는 꿀팁: Ctrl + Alt + ↑
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}
}
