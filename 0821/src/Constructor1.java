
class Constructor1 {
	
	public int a = 3;
	public int b = 5;
	public int c = 7;
	public Constructor1(int a,int b) {
		this.a =a;
		this.b =b;
		this.c =c;
	}
}


class ConstructorTest1{
public static void main(String args[]) 
{
		Constructor1 ct = new Constructor1 (2,4);
		System.out.println("��ü���� a:" + ct.a);
		System.out.println("��ü���� b:" + ct.b);
		System.out.println("��ü���� c:" + ct.c);
		
}
}

	
	
	
