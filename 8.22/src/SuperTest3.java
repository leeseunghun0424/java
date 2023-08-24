class SD1 {
	public int i1;
	public double d1;
	
	public SD1(int i1) {   //  i1의 메소드 생성
		System.out.println("SD1(int i1) 생성자 수행");
		this.i1 = i1 * i1 ;
		System.out.println(i1 +"의 2제곱은 : "+this.i1);
	}
	public SD1(double d1) {  //  d1의 메소드생성
		System.out.println("SD1(double d1) 생성자 수행");
		this.d1 = d1 * d1 ;
		System.out.println(d1 +"의 2제곱은 : "+this.d1);
	}
}	

class Sub1 extends SD1 {
	public Sub1(int i1) {   //  SD1의 i1 메소드 오버로딩
		super(i1);     //  super로 SD1의 메소드 실행
		System.out.println("Sub1(int i1) 생성자 수행");
		this.i1 = this.i1 * i1 ;
		System.out.println(i1 +"의 3제곱은 : "+this.i1);
	}

	public Sub1(double d1) {  //  SD1의 d1 메소드 오버로딩
		super(d1);     //   super로 SD1 메소드수행
		System.out.println("Sub1(double d1) 생성자 수행");
		this.d1 = this.d1 * d1 ;
		System.out.println(d1 +"의 3제곱은 : "+this.d1);
	}
}

public class SuperTest3 {
	public static void main(String args[]) {
		Sub1 sub1 = new Sub1(10);   //  super(i1)수행 > sub1 실행
		Sub1 sub2 = new Sub1(10.5);   //  
	}
}