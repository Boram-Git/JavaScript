package sec03.exam01;

/*
작성자: 김보람
작성일: 2023-02-22
 */

// 대입 연산자는 모든 연산자들 중에서 가장 낮은 연산 순위를 가지고 있기 때문에 제일 마지막에 수행된다.
// 연산의 진행 방향이 오른쪽에서 왼쪽이기 때문에 a = b = c = 5는 3 <- 2 <- 1 순서로 연산된다.
public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result= " + result);
		
		result -=5;
		System.out.println("result= " + result);
		
		result *=3;
		System.out.println("result= " + result);
		
		result /=5;
		System.out.println("result= " + result);
		
		result %=3;
		System.out.println("result= " + result);

	}

}
