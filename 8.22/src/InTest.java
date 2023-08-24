class CC1 {
	int a = 100;
	static String b = " 파이팅 자바 ";
}

class CC2 extends CC1 {
	String b;
	String x = "쉬운 자바";
}


public class InTest {
	public static void main(String args[]) {
		CC2 o = new CC2();
		System.out.print(o.x);
		System.out.print(o.b);
		System.out.print(o.a);
		System.out.print(CC1.b);
	}
}
