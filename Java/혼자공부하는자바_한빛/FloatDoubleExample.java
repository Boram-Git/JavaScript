package sec02.exam07;

/*
작성자: 김보람
작성일: 2023-02-13
 */

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 실수값 저장
		//float var1 = 3.14; 컴파일 에러-> float 타입 사용할 시 - 변수 안에 값을 3.14f로 입력해야 함 (또는 F)
		float var2 = 3.14f;
		double var3 = 3.14;
		
		// 정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789; //double 타입이 float보다 2배 이상 정밀한 값으로 출력한다
		
		//System.out.println(var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5); //double 타입인 var5가, float 타입인 var4보다 2배 이상 정밀한 값으로 출력
		
		// e 사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
	}
}
