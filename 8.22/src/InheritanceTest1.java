class A {
	public int aa = 1;   //  public 으로 선언
}

class B extends A {   //  A클래스로부터 상속받음 
	private int bb = 2;   //  private 로 선언 해당클래스 내부에서만 사용가능
	public int bb() {     //  public  으로 선언
              //  
		return bb;     
	}
}

class C extends B {   //  B 로부터 상속받음1
	int cc = 3;    //  한정자 없음 같은 패키지내에서만 접근가능
}

public class InheritanceTest1  {
	public static void main(String[] args) {
		C objc = new C();
		System.out.println("objc객체의 객체 속성 변수 aa의 값은 " + objc.aa);
                                                           //  상속받은 A클래스에서의 aa의 값
              // System.out.println("objc객체의 객체 속성 변수 bb의 값은 " + objc.bb);
                                                           //  private 값은 해당클래스내부에서만  사용 가능함
		System.out.println("objc객체의 객체 속성 변수 bb의 값은 " + objc.bb());		
															// 메소드로 접근하면된다
		System.out.println("objc객체의 객체 속성 변수 cc의 값은 " + objc.cc);
	}
}