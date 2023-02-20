package sec03;

/*
작성자: 김보람
작성일: 2023-02-20
 */

import java.util.Scanner; // import해야 한다. 패키지에 있다는 것은 컴파일러에게 알려주는 역할

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		
		// Scanner라는 객체를 생성해서
		Scanner scanner = new Scanner(System.in);
		
		String inputData;
		
		
		while(true) {
			inputData = scanner.nextLine(); // 엔터가 입력되기 이전의 모든 문자열을 읽어서 인풋데이터에 저장을 하고
			System.out.println("입력된 문자열: \"" + inputData + "\""); // 출력하는 것
			// 만약에 인풋데이터 안에 저장된 내용, 즉 nextLine으로 읽은 내용이 q라면 break로 while문을 빠져나간다.  
			if(inputData.equals("q")) {
				break;
			}
			
		}
		
		System.out.println("종료"); // 마지막으로 종료라고 출력된다.
	}

}
