package sec03;

/*
작성자: 김보람
작성일: 2023-02-21
 */

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1; char 변수가 산술 연산에 사용되면 int 타입으로 변환되므로 연산 결과는 int 타입이 된다.
	
		System.out.println("c1: " + c1); // >> c1: 66 -> B 컴파일됨
		System.out.println("c2: " + c2); // >> c2: 65 -> A 컴파일됨
		//System.out.println("c3: " + c3); >> 컴파일 에러발생! 변수 c2와 1을 더하면 c2는 int 타입으로 변환되고 1과 연산이 되기 때문에 연산 결과는 int 타입이 된다.
		
		char c3 = (char) (c2 + 1); // 강제 타입 변환을 char 타입으로 결과를 얻을 수 있다.
		System.out.println("c3: " + c3);
		
		

	}

}
