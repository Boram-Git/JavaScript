package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-23
 */

// char 타입 변수를 이용해서 알파벳 대소문자에 관계없이 동일하게 처리하도록 switch문을 만들기
public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B'; // 이전에 계속 했던 랜덤메소드가 아님

		switch (grade) { // 중괄호와 그 안에 변수도 잊지말자!
		case 'A': // 세미콜론 아니고 콜론 잊지말자!
		case 'a':
			System.out.println("우수 회원입니다.");
			break;

		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		case 'C':
		case 'c':
			System.out.println("손님입니다.");
			break;
		}
	}
}
