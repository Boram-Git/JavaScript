package sec03.exam02;

public class variableExchangeExample {

	public static void main(String[] args) {
		int x = 3; // 변수 x에 10을 저장
		int y = 5;  // 변수 y에 변수 x에 저장된 값을 저장 -> 변수 x에 저장된 값을 변수 y에 복사(저장)
		// System.out.println("x:" + x + ", y:" + y); -> 결과값: x:3, y:5

		
		
		// 두 변수의 값을 교환하는 방법
		int temp = x; // 두 변수의 값을 교환하기 위해서 새로운 변수 temp를 선언하고, 거기에 x 값(3)을 생성
		x = y;		  // 변수 x에는 y의 값(5)를 생성
		y = temp;	  // 변수 y에는 temp에 생성된 값(3)을 생성
		System.out.println("x:" + x + ", y:" + y);
	}

}