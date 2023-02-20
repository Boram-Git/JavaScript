package sec03;

/*
작성자: 김보람
작성일: 2023-02-20
 */

// 실행하는 방법: 콘솔뷰에 'A'입력하고 실행
public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		int keyCode;

		keyCode = System.in.read(); // read는 키코드에서 입력하지 않으면 계속 기다린다
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

	}

}