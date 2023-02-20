package sec03;

/*
작성자: 김보람
작성일: 2023-02-20
 */

//실행하는 방법: 콘솔뷰에 'A'입력하고 실행
public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
											// throws Exception 입력해줘야 한다.
		int keyCode;

		// 반복문
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		} 
	}
}