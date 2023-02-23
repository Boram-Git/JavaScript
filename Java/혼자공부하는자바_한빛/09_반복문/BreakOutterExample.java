package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-23
 */

// 바깥쪽 for문은 'A'~'Z'까지 반복하고 중첩된 for문은 'a'~'z'까지 반복하는데,
//중첩된 for문에서 lower 변수가 'g'를 갖게 되면 바깥쪽 for문까지 빠져나오도록 한다.

//위 코드처럼 반복문이 중첩되어 있을 경우 break문은 가장 가까운 반복문만 종료하고
//바깥쪽 반복문은 종료하지 않는다. 중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 바깥쪽 반복문에 이름(라벨)을 붙이고, 'break이름;'을 사용하면 된다.

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
