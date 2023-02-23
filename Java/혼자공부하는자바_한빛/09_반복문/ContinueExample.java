package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-23
 */

// 1에서 10 사이의 수 중에서 짝수만 출력하는 코드

// 블록내부에서 continue문이 실행되면 for문의 증감식 또는 while문, do-while문의 조건식으로 이동한다.
// 즉 continue문은 블록 내부에서 continue문이 실행되면 for문의 증감식 또는 while문 do-while문의 조건식으로 이동한다.

// continue문은 반복문을 종료하지 않고 계속 반복을 수행한다는 점이 break문과 다르다.
// break문과 마찬가지로 continue문도 대개 if문과 같이 사용되는데,
// 특정 조건을 만족하는 경우에 continue문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다.

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {			// 2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
				continue;
			}
			System.out.println(i);		// 홀수는 실행되지 않음
		}
	}

}