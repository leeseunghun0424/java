class S1{
	private int a=50;
	static String x = "������ �ڹ�" ; 	
}

class S2 extends S1 {
	public int a = 100;
	String x = "�����ڹ�" ;
			void write() {
				System.out.println(x);
				System.out.println(a);
				System.out.println(super.x);
				System.out.println(super.a);
				
	}
}
public class SuperTest1 {
	public static void main(String args[]) {
		S2 s = new S2();
		s.write();
	}
}
