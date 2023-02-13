package sec02.exam06;

/*
작성자: 김보람
작성일: 2023-02-13
 */

public class EscapeExample {
	public static void main(String[] args) {
		String str1 = "나는 \"자바\"를 좋아합니다."; // 이스케이프 escape: 문자열 내부에 역슬래시(\)가 붙은 문자

		String str2 = "나는 "+"파이썬보다 "+"'자바를' "+"더 좋아해야한다"; // 문자열 + 문자열
		
		String str3 = "번호\t이름\t나이"; // 탭만큼 띄어쓰기: \t
		String str4 = "김보람\n람보김";   // 한 줄 내림: \n
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("행 단위 출력\n");
		System.out.println("봄\\여름\\가을\\겨울");
	}
}