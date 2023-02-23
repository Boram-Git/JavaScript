package sec03.exam01;
/*
작성자: 김보람
작성일: 2023-02-23
 */

// 중첩은 같은 블록내에 for문 사용한다. 블록 표시할 때 블록설정 주의하기!
// 13라인의 바깥쪽 for문은 m이 2에서 9까지 변하면서 8번 반복 실행되는데,
// 바깥쪽 for문이 한번 설정할 때마다 15라인의 중첩 for문은 n이 1에서 9까지 변하면서 9번 반복 실행한다.
// 즉 m=2일 때 n은 1~9까지 변하면서 2 x n = 2*n을 출력하게 된다.

public class ForMultiplicationTableExample {
	// 구구단 2단부터 9단을 출력하는 코드
	public static void main(String[] args) {
		for(int m=2; m<=9; m++) { // {은 바깥쪽 for문
			System.out.println("*** " + m + "단 ***"); // 구구단 제목출력 >> *** 2단 ***
			for(int n=1; n<=9; n++) { // {은 중첩 for문
				System.out.println(m + " x " + n + " = " + (m*n)); // >> 2 x 1 = 2
			}
		}

	}

}
