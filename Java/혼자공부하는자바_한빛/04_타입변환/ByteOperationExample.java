package sec03;

/*
작성자: 김보람
작설일: 2023-02-16
 */

// 자바는 실행 능력을 향상시키기 위해서 컴파일 단계에서 연산을 수행할 수 있다.
public class ByteOperationExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
		// 정수 연산식에서 모든 변수가 int 타입으로 변환되는 것은 아님, 두 피연산자 중 허용 범위가 큰 타입으로 변환되어 연산을 수헹한다.
	}
}