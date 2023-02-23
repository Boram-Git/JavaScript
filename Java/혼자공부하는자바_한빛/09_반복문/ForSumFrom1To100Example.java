package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-23
 */

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		
		// 1부터 100까지의 합을 구하는 코드
		// for문이 시작하기 전에 합계 변수 sum을 선언한 이유는 for문을 끝내고 9라인에서 sum을 사용하기 때문
		
		int sum = 0; // sum은 합계변수
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합 : " + sum); // sum은 합계변수
	}

}
