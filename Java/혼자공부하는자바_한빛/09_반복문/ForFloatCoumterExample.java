package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-23
 */

// for문을 작성할 때 주의할 점은 초기화식에서 루프 카운터 변수를 선언할 때 부동 소수점을 쓰는 float 타입을 사용하지 말아야 한다.
// 아래 코드를 보면, 이론적으로 13라인의 for문은 10번 반복해야 한다.
// 하지만, 0.1dms float 타입으로 정확하게 표현할 수 없기 때문에 루프 카운터 변수 x에 더해지는 실제값은 0.1보다 약간 크다.
// 결국 루프는 9번만 실행해야 한다. (page.152)
public class ForFloatCoumterExample {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}

	}

}
