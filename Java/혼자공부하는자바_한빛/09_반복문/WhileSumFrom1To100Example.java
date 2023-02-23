package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-23
 */

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
//		int sum = 0; // 합계에 저장할 변수 선언
//		
//		int i = 1;   // 루프 카운터 변수
//		
//		while(i<=100) {
//			i++;
//			System.out.println("1~100 합 : " + sum);
//		} 위 코드는 오답
		
		// while문 내부에서 계속 누적되는 값을 갖는 루프 카운터 변수는 while문의 시작하기 전에 미리 선언해놓아야 한다.
		int sum = 0; // 합계를 저장할 변수
		
		int i = 1;	 // 루프 카운터 변수
		
		while(i<=100) {
			sum += i;
			i++;
		}			
								// (i-1)는 루프 카운터 변수
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		}											// sum은 합계를 저장할 변수
		
	}