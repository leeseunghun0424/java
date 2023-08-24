class OT1a {
	public void show(String str) {    //  메소드   show   를 생성
		System.out.println("상위 클래스의 메소드 show(String str)수행  : " + str);
	}
}
class OT1b extends OT1a {   //  OT1a클래스로부터 상속
	public void show() {    // 매개변수가 다르기떄문에 오버라이딩X 
		System.out.println("하위 클래스의 메소드 show() 수행");
	}
}
public class OverridingTest1 {
	public static void main(String args[]) {
		OT1b otb = new OT1b();
               
		otb.show("처음 시작하는 자바");  // 매개변수가 있는 메소두 호출,OT1a의 메소드 를 수행
	       otb.show(); //  
	}
}