package sec03;

/*
작성자: 김보람
작성일: 2023-02-21
 */

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play); // 출력>> true 
		
		play = !play; // 논리 부정 연산자
		System.out.println(play); // 출력>> false
		
		play = !play;
		System.out.println(play); // 출력>> true
	}

}
