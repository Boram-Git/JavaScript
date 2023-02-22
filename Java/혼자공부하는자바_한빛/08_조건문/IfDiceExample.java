package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-22
 */
// 주사위의 번호 뽑기 (page.139)
// 먼저 임의의 정수를 뽑는 방법은 Math.random() 메소드를 활용해야 한다.
// int num = (int) (Math.random() * n) + start; 이때 n은 n개의 정수 중에서 임의의 정수 하나

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1; // + 1은 주사위 번호 하나 뽑기

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if (num == 6) {
			System.out.println("6번이 나왔습니다.");
		}

	}
}