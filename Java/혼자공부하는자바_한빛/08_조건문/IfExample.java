package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-22
 */

public class IfExample {

	public static void main(String[] args) {
		int score = 93;

		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score<90) // 세미콜론과 중괄호 없음
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다."); // 이 절은 실행결과를 보면 점수와는 상관없이 무조건 실행된다.
											   // 이유? if문에는 중괄호 블록이 없어 19까지만 영향을 미치며,20라인은 들여쓰기만 되었을 뿐 if문과는 아무런 관련이 없기 때문이다.	

	}
}