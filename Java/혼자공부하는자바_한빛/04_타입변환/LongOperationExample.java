package sec03;

/*
작성자: 김보람
작성일: 2023-02-16
 */

/* int 타입보다 허용 범위가 더 큰 long 타입이 피연산자로 사용되면
 * 다른 피연산자는  무조건 long 타입으로 변환하고 연산을 수행한다. 따라서 연산 결과를 long 타입 변수에 저장해야 한다.*/

public class LongOperationExample {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result4 = value1 + value2 + value3;
		System.out.println(result4);

	}

}
