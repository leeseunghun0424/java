
class Constructor {
	public int a = 3;
	public int b = 5;
	public int c = 7;
	
	public Constructor(int a , int b) {
		a = a;
		b = b;
	}
	
}


class ConstructorTest {
	public static void main(String args[]) {
		Constructor ct = new Constructor (2,4);
		System.out.println(ct.a);
		System.out.println(ct.b);
		System.out.println(ct.c);
	}
}