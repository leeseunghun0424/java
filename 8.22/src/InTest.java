class CC1 {
	int a = 100;
	static String b = " ������ �ڹ� ";
}

class CC2 extends CC1 {
	String b;
	String x = "���� �ڹ�";
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
