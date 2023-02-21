package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-21
 */

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; // 왼쪽에서 오른쪽으로 차례차례 산술연산
		String str4 = 3 + 3.0 + "JDK"; // 왼쪽에서 오른쪽으로 차례차례 산술연산
		System.out.println(str3); // >> JDK33.0
		System.out.println(str4); // >> 6.0JDK 

	}

}
