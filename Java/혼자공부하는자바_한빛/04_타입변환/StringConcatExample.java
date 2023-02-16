package sec03;

/*
작성자: 김보람
작성일: 2023-02-16
*/ 

public class StringConcatExample {

	public static void main(String[] args) {
		
		// 숫자 연산
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		// 문자열 연산
		String str1 = 10 + 2 + "8"; // 숫자 + 숫자 + 문자열
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2); // 182 or 1028 따라서 182는 오답
		
		String str3 = "10" + 2 + 8;
		System.out.println(str3); // 1010 or 1028 따라서 1010은 오답
		
		/* 순차적으로 +연산을 수행하지 않고 우선 연산하고 싶은 부분이 있다면 해당 부분을 괄호()로 감싸준다.
		   괄호는 최우선으로 연산을 수행한다. */
		String str4 = "10" + (4 + 8);
		System.out.println(str4); // 1010
	}

}