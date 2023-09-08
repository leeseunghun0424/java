/*
 * 2023 09 08
 * 202095070 이승훈
 * 추상클래스 동물의 울음소리를 출력하자.
 */

//추상클래스 선언
abstract class myAnimal{
	//추상메소드 : 동물의 소리를 표현하는 메소드
	abstract String Sound();
	
	// 일반메소드: 돔울의 기본 정보
	void displayInfo() {
		System.out.println (" 동물의 울음 소리 입니다 ");
	}
	
}

//고양이 클래스 
class myCat extends myAnimal {

	
	@Override
	void displayInfo() {
		System.out.println("고양이 울음 소리 입니다 ");
	}

	@Override
	String Sound() {
		// 오버라이딩으로 재정의
		return "애옹" ;
	}
}


public class animalTest {
	public static void main(String args[]) {
		
		myAnimal cat = new myCat();
		cat.displayInfo();
		System.out.println(cat.Sound());
	}
}
