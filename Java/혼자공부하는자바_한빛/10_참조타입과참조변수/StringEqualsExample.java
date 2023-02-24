package sec03;

/*
작성자: 김보람
작성일: 2023-02-24
목적성: 참조타입- 스택영역과 힙영역에서 내부 문자열 비교하는 ==방법과 equals() method 방법 비교
 */

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "김보람";
		String strVar2 = "김보람";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} else {
			System.out.println("strVar1과 strVar2는 문자열이 다름");
		}

		String strVar3 = new String("김보람");
		String strVar4 = new String("김보람");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		} else {
			System.out.println("strVar3과 strVar4는 문자열이 다름");
		}
	}

}
