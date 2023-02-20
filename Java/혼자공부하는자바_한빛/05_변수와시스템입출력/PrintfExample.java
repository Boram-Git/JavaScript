package sec03;

/*
작성자: 김보람
작성일: 2023-02-20
 */

// System.out.println(리터럴 또는 변수);
// : 시스템이 가지고 있는 출력장치로 괄호 안의 내용을 출력하고 행을 바꿔라.

public class PrintfExample {
	
	public static void main(String[] args) {
		System.out.printf("이름: %1$s, 나이: %2$d", "감자바", 31);
		
		// 자주 사용되는 형식 문자열 표현방법
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); // 정수 >> 123원
		System.out.printf("상품의 가격:%6d원\n", value); // 6자리 정수, 왼쪽 빈 자리 공백 >> ___123원
		System.out.printf("상품의 가격:%-6d원\n", value); // 6자리 정수, 오른쪽 빈 자리 공백 >> 123___원
		System.out.printf("상품의 가격:%06d원\n", value); // 6자리 정수, 왼쪽 빈 자리 0 채움 >> 000123원
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		String name = "김보람";
		String job = "개발자";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
	}

}