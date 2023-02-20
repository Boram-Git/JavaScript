package sec03;

/*
작성자: 김보람
작설일: 2023-02-20
 */

// 실행하는 방법: 콘솔뷰에 'A'입력하고 실행
public class QStopExample {
										
	public static void main(String[] args) throws Exception { // **throws Exception 예외처리 입력해야 한다!
		int keyCode;

		while (true) {
			keyCode = System.in.read(); // read() **메소드를 사용하려면 위에 11라인 예외처리를 입력해야 한다! 
			
			// **여기부터
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break; // 여기까지** keyCode가 113일 경우 while 반복을 중지함
			}
		}

		System.out.println("종료"); // 'q'를 콘솔뷰에 입력하면 113이므로 실행중지된다.
	}

}
