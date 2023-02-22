package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-23
 */

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "팀장";

		switch (position) {
		case "실장": // case는 콜론 잊지말자!
			System.out.println("700만원");
			break; // break는 세미콜론 잊지말자!

		case "팀장":
			System.out.println("500만원");
			break;

		default: // default는 콜론 잊지말자!
		}

	}

}
