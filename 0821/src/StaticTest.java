
class Static {
	public int a =20;
	private int b =5;
	static int c;
	
}

public class StaticTest {
	public static void main(String args[]) {
		int a =10;
		Static.c = a;
		Static st = new Static();
		System.out.println("Ŭ���� ���� : " + (Static.c)++);
		System.out.println("Ŭ���� ���� : " + st.c);
		System.out.println("Ŭ���� ���� : " + a);
		System.out.println("Ŭ���� ���� : " + st.a);
	}
}