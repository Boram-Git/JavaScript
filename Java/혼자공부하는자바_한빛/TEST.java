package sec03.exam02;
/*
작성자: 김보람
작성일: 2023-02-13
 */

public class TEST {
	public static void main(String[] args) {
		//byte var1 = 200;  // byte 타입 변수에 허용 범위를 초과한 값을 대입했을 경우 컴파일 에러: -128 ~ 127까지 저장되는 값의 허용 범위
		short var1 = 200;   // byte의 허용범위를 넘어서서 short 타입 사용해야 함
		
		//char var2 = 'AB'; 컴파일 에러
		char var2 = 'A';	// 위에 컴파일 에러 해결방법1
		char var3 = 'B';	// 위에 컴파일 에러 해결방법2
		String var4 = "AB"; // 위에 컴파일 에러 해결방법3
		
		//long var5 = 50000000000; 컴파일 에러
		long var5 = 50000000000L;	// 위에 컴파일 에러 해결방법1 (대문자 L)
		long var6 = 50000000000l;	// 위에 컴파일 에러 해결방법2 (소문자 l)
		//int var7 = 50000000000;   // int는 뒤에 L안붙여도 되는데, 유효범위가 넘어서 컴파일 에러
		
		//String str = "나의 직업은 "개발자"입니다."; 컴파일 에러
		String str = "나의 직업은 \"개발자\"입니다."; // 이스케이프 문자 사용해서 구분해줘야 함
		
		// int v2 = 1e2; 컴파일 에러
		double v2 = 1e2; // double 타입 사용해야 함
		
		// float = 1e2f; 컴파일 에러
		//float = 1e2f; // 타입 float를 변수로 사용할 수 없다
		
		System.out.println(var1);
		
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		System.out.println(var5);
		System.out.println(var6);
		
		System.out.println(str);

		System.out.println(v2);
	}
}