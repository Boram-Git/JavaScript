package sec03.exam02;

/*
 작성자: 김보람
 작성일: 2023-02-11
 */

public class variableInitializationExample {

	public static void main(String[] args) {
		// 방법1. 변수 value 선언하고 변수 value에 값 1을 생성
		int value;
		value = 1;
		
		// 방법2. 변수 value 선언과 동시에 변수 value에 값 1을 생성 **포인트는 동시에 할 수 있다는 것
		//int value = 1;
		
		
		// 변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		// 연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
	}
}
