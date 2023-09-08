/*
 * 2023 09 08
 * 202095070 이승훈
 * 추상클래스 동물의 울음소리를 출력하자.
 * 클래스 메소드 
 */

//추상클래스 선언
abstract class myAnimal2{
	//추상메소드 : 동물의 소리를 표현하는 메소드
	abstract String Sound2();
	
	// 일반메소드: 돔울의 기본 정보
	static void displayInfo2() {
		System.out.println (" 동물의 울음 소리 입니다 ");
	}
	
}

//고양이 클래스 
class myCat2 extends myAnimal2 {

	//static 메소드는 오버라이딩이 불가능하다
	static void displayInfo2() {
		System.out.println("고양이 울음 소리 입니다 ");
	}

	@Override
	String Sound2() {
		// 오버라이딩으로 재정의
		return "애옹" ;
	}
}


public class animalTest2 {
	public static void main(String args[]) {
		
		myAnimal2 cat2 = new myCat2();
		cat2.displayInfo2();
		System.out.println(cat2.Sound2());
	}
}
