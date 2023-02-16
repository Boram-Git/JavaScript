package sec02.exam08;

/*
작성자: 김보람
작성일: 2023-02-13
 */

public class BooleanExample {
	public static void main(String[] args) {
		// boolean 타입 변수는 주로 두 가지 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는 데 사용
		boolean stop = true; // stop 변수가 true 값을 가지고 있기 때문에 if 블록이 실행되어 "중지합니다"가 출력됨,
							 //만약 stop 변수가 false 값을 가지고 있다면 else 블록이 실행되어 "시작합니다."를 출력함
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}