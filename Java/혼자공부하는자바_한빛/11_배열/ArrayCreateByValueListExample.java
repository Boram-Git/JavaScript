package sec03;

import sec02.exam01.integerLiteralExample;

/*
작성자: 김보람
작성일: 2023-02-24
키워드: 배열 인덱스, 배열길이, 배열선언, 배열생성
포인트: 값 목록으로 배열 생성 (page.180)
 */

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
//		배열 객체를 생성
//		중괄호 {}는 주어진 값들을 항목으로 가지는 배열 객체를 힙에 생성하고, 배열 객체의 번지를 리턴한다.
//		배열 변수는 리턴된 번지를 저장함으로써 참조가 이우러진다.
//		예) 83, 90, 87 정수를 갖는 배열을 생성할 수 있다.

		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

//		이렇게 성적을 배열로 만들면 성적의 평균값은 배열의 인덱스를 이용해서 for문으로 쉽게 구할 수 있다.

//		for문이 3번 반복 실행하면서 i가 0~2까지 변하고 있다. 따라서 sum 변수에는 score[0]~score[2]까지 더해지고,
//		마지막으로 얻은 sum을 3으로 나누어 평균 avg를 얻는다.
//		학생 수가 3명이 아니라 수백 명이 되어도 for문의 조건식 i<3만 변경하면 되므로 많은 양의 데이터를 적은 코드로 손쉽게 처리할 수 있다.
		int sum = 0;
		for (int i = 0; i < 3; i++) { // i는 0; 3까지; 인덱스씩 증가;로 해석
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3; // 평균이라서 실수로 나타나기 때문에 실수 타입으로 강제 타입 변환 시도
		System.out.println("평균 : " + avg);
	}

}
