package sec03.exam02;

/*
작성자: 김보람
작성일: 2023-02-11
 */

public class variableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		
		// 변수 hour와 minute 값을 출력: 3시간 5분
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour * 60) + minute;
		// int totalMinute = (3 * 60) + minute; -> 변수 hour에 저장된 값으로 대치
		// int totalMinute = 180 + 5;           -> 변수 minute에 저장된 값으로 대치
		// int totalMinute = 185;               -> 185를 변수 totalMinute에 저장   
		
		System.out.println("총 " + totalMinute + "분");
		// "총 " 띄어쓰기는 공백으로 표현 가능
	}
}
