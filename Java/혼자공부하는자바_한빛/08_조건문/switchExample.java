package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-23
 */
// 주사위의 번호 뽑기를 if문이 아닌 switch문으로 변형하기
public class switchExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1; // 임의의 난수 뽑기 메소드 사용
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
			break;
		}
		

	}

}
