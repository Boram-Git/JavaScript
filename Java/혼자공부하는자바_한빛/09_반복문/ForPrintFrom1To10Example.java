package sec03.exam01;
/*
작성자: 김보람
작성일: 2023-02-23
 */
public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		
		// 초기화 > 조건식 > (true일때)실행문 > 증감식
		// int i=1; -> 1)초기화식
		// i<=10;   -> 2)조건식
		// System.out.println(i); -> 3)실행문
		// i++      -> 4)증감식
		
		// 가장 기본적인 for문의 형태로 1부터 10까지 출력하는 코드
		// for문에서 반복 횟수를 나타내는 루프 카운터 변수 i를 선언하고 i=1부터 i=10까지 10번 반복
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}

	}

}
