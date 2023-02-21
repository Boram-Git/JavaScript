package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-21
 */

// 논리곱(&&), 논리합(||), 배타적논리합(^), 논리부정(!)

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A'; // 유니코드: 65
		
		if( (charCode>=65) & (charCode<=90) ) { // true - true -> 출력
			System.out.println("대문자군요");
		}
			
		if( (charCode>=97) && (charCode<=122) ) { // false - false
			System.out.println("소문자군요");
		}
		
		if( !(charCode<48) && !(charCode>57) ) { // true - false
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) { // true - true -> 출력
			System.out.println("2 또는 3의 배수군요");
		}
			
		if( (value%2==0) || (value%3==0) ) { // true - true -> 출력
				System.out.println("2 또는 3의 배수군요");
		}

	}

}
