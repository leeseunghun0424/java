package chapter13_1;

import java.util.Scanner;

public class ExceptionTest02 {
	
	public static void main(String[] args) {
		
	
	Scanner stdIn = new Scanner(System.in);
	System.out.println("첫번째 수 입력 :");
	int num1 = Integer.parseInt(stdIn.next());
	
	System.out.println("두번째 수 입력 :");
	int num2 = Integer.parseInt(stdIn.next());
	
	try {
		System.out.println(num1/num2);
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		System.out.println("0으로 나눌 수 없습니다");
		System.out.println("해당 예외" + e);
		
		//e.printStackTrace();
		}
	catch (NumberFormatException e) {
		System.out.println("첫번째 수는 숫자만 입력하세요");
		System.out.println("해당 예외" + e);
	}
	
	finally {
		// 생략가능
		System.out.println("프로그램 종료");
	}
	
	

	}
}

