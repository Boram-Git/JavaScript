package sec03.exam02;

/*
작성자: 김보람
작성일: 2023-02-12
 */

public class variableScopeExample {
	public static void main(String[] args) {
		int v1 = 15; // 변수 v1을 선언하고 15 값을 초기화(생성)
		if(v1>10) {  // if문에서 조건이 변수 v1이 10보다 크면 실행 -> 참 -> 실행
		  int v2;	 	// 변수 v2 선언 
		  v2 = v1 - 10; // 변수 v2에 v1 - 10; 생성
		}				// if문은 여기서 끝	
		int v3 = v1 + v2 + 5; // 변수 v3 선언하고 v1 + v2 + 5를 생성 -> 변수 v1 = 15,
							  // 그런데 문.제.는 '변수 v2'는 'if문'에서 사용하고 그 변수는 폐기되기 때문에 컴파일 에러 발생!  
	}
}