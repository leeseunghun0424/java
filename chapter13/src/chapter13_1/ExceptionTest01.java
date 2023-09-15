//두개의 정수를 입력받아 나눗셈하는 프로그램
package chapter13_1;

import java.util.Scanner;

public class ExceptionTest01 {
	
	public static void main(String[] args) {
		
	
	Scanner stdIn = new Scanner(System.in);
	System.out.println("첫번째 수 입력 :");
	int num1 = stdIn.nextInt();
	
	System.out.println("두번째 수 입력 :");
	int num2 = stdIn.nextInt();
	
	try {
		System.out.println(num1/num2);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("0으로 나눌 수 없습니다");
		System.out.println("해당 예외" + e);
		
		//e.printStackTrace();
	}
	}
}

