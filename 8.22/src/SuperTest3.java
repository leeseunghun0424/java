class SD1 {
	public int i1;
	public double d1;
	
	public SD1(int i1) {   //  i1�� �޼ҵ� ����
		System.out.println("SD1(int i1) ������ ����");
		this.i1 = i1 * i1 ;
		System.out.println(i1 +"�� 2������ : "+this.i1);
	}
	public SD1(double d1) {  //  d1�� �޼ҵ����
		System.out.println("SD1(double d1) ������ ����");
		this.d1 = d1 * d1 ;
		System.out.println(d1 +"�� 2������ : "+this.d1);
	}
}	

class Sub1 extends SD1 {
	public Sub1(int i1) {   //  SD1�� i1 �޼ҵ� �����ε�
		super(i1);     //  super�� SD1�� �޼ҵ� ����
		System.out.println("Sub1(int i1) ������ ����");
		this.i1 = this.i1 * i1 ;
		System.out.println(i1 +"�� 3������ : "+this.i1);
	}

	public Sub1(double d1) {  //  SD1�� d1 �޼ҵ� �����ε�
		super(d1);     //   super�� SD1 �޼ҵ����
		System.out.println("Sub1(double d1) ������ ����");
		this.d1 = this.d1 * d1 ;
		System.out.println(d1 +"�� 3������ : "+this.d1);
	}
}

public class SuperTest3 {
	public static void main(String args[]) {
		Sub1 sub1 = new Sub1(10);   //  super(i1)���� > sub1 ����
		Sub1 sub2 = new Sub1(10.5);   //  
	}
}