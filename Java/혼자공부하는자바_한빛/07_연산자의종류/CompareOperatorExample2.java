package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-21
 */

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // >> true
		
		double v4 = 0.1;
		float v5 = 0.1f; // 주의할 것!
		System.out.println(v4 == v5); // >> false
		System.out.println((float)v4 == v5); // >> true
		// 0.1 == 0.1f와 같은 경우 - 정상적이라면 0.1f가 왼쪽 피연산자와 같은 double 타입으로 변환되어 0.1 == 0.1이 되고 true가 산출되어야 하지만,
		// 이 결과값은 false가 산출된다.
		// 그 이유는 실수의 저장 방식인 부동 수소점 방식이 0.1을 정확히 표현할 수 없기 때문이다. 0.1f는 0.1의 근사값(0.10000000149011612)으로 표현된다.
		// 따라서 0.1보다 큰 값이 되어 버립니다.
		// 해결책은 피연산자를 모두 false 타입으로 변환해서 비교하거나 정수 타입으로 변환해서 비교하는 것이다.
		
		

	}

}
