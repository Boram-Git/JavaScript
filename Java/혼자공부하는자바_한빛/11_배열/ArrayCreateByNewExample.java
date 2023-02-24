package sec03;

/*
작성자: 김보람
작성일: 2023-02-24
핵심어: new 연산자
포인트: 값의 목록을 가지고 있지 않지만, 향후 값들을 저장할 배열을 미리 만들고 싶다면 new 연산자로 배열 객체를 생성할 수 있다.
 */

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3]; // new 연산자로 배열 생성 -> 타입[] 변수 = new 타입[길이];에서 길이는 배열이 저장할 수 있는 값의 개수
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[ " + i + "] : " + arr1[i]);
		}

		arr1[0] = 10; // 배열이 생성되고 나서 특정 인덱스 위치에 새로운 값을 저장하려면 대입 연산자를 사용하면 된다.
		arr1[1] = 20; // 변수[인덱스] = 값;에서 배열 arr1의 0, 1, 2 인덱스에 각각 10, 20, 30를 저장하는 코드
		arr1[2] = 30;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}

		double[] arr2 = new double[3]; // new 연산자로 배열 생성
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

		String[] arr3 = new String[3]; // new 연산자로 배열 생성
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}

}
