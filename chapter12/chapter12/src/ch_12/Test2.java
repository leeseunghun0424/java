package ch_12;
class TestTest {

	//private String text;
	//private로 선언 해서 결과 값 미출력
	public String text;
	public TestTest(String s)
	{
		this.text = s;
	}

}
public class Test2 {
	public static void main(String[]args) {
		TestTest test = new TestTest("ABC");
		System.out.println(test.text.toLowerCase());
	}
}
