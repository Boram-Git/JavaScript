package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-22
 */

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println("grade: " + grade);
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}
