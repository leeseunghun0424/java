class DD1{
	private DD1() {
		System.out.println("Ŭ���� DD1�� ������");
	}
}

class DD2 extends DD1 {
	public DD2() { //  ���� ������ ȣ�� �Ұ���
		System.out.println("Ŭ���� DD2�� ������");
	}
}



public class ConTest {
	public static void main(String args []) {
		DD2 d =new DD2();
	}
}
