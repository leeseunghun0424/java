
class Constructor1 {
	public int a = 3;
	public int b = 5;
	public int c = 7;
	
	public Constructor1(int a , int b) {
		this.a = a;
		this.b = b;
	}
	
}


class ConstructorTest1 {
	public static void main(String args[]) {
		Constructor1 ct = new Constructor1 (2,4);
		System.out.println(ct.a);
		System.out.println(ct.b);
		System.out.println(ct.c);
	}
}