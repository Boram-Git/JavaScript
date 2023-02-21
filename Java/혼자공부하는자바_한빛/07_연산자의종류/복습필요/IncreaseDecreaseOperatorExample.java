package sec03;

/*
작성자: 김보람
작성일: 2023-02-21
 */

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
	
		System.out.println("----------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("----------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("----------------");
		z = x ++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("----------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("----------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
	
}
