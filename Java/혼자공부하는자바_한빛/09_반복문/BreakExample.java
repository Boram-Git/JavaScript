package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-23
 */

// while문을 이용해서 주사위 번호 중 하나를 반복적으로 무작위로 뽑되, 6이 나오면 while문을 종료한다.

public class BreakExample {

	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);

			if (num == 6) {
				break; 	// 아래 실행문도 작성 까먹지말자! 
			}

		}
		System.out.println("프로그램 종료"); // 까먹지말자!
	}
}