class F1 { 
	static String x = "������ �ڹ� ";
	static String y = "���� �ڹ� ";
	static void write() { 
		System.out.print(x);
		System.out.print(y);
		
	}

}

class F2 extends F1 { 
	static int x = 500;
	static void write() { 
		System.out.print(x);
		System.out.print(y);
		
	}

}


public class OverTest {
	public static void main(String args[]) {
		F2 o = new F2();
		o.write();
		F2.write();
		F1.write();
				
	}
}
