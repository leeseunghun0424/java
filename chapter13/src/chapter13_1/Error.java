package chapter13_1;

public class Error {
	public static void main(String [] args) {
		x();
	}
	static void x() {
		y();
	}
	static void y() {
		z();
		
	}
	static void z() {
		int i = 1;
		int j = 0;
		System.out.println(i/j);
	}
}


/*Exception 예외 발생 Arithmetic 
0으로 나누는것이 불가능


*/