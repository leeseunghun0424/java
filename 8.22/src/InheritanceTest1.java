class A {
	public int aa = 1;   //  public ���� ����
}

class B extends A {   //  AŬ�����κ��� ��ӹ��� 
	private int bb = 2;   //  private �� ���� �ش�Ŭ���� ���ο����� ��밡��
	public int bb() {     //  public  ���� ����
              //  
		return bb;     
	}
}

class C extends B {   //  B �κ��� ��ӹ���1
	int cc = 3;    //  ������ ���� ���� ��Ű���������� ���ٰ���
}

public class InheritanceTest1  {
	public static void main(String[] args) {
		C objc = new C();
		System.out.println("objc��ü�� ��ü �Ӽ� ���� aa�� ���� " + objc.aa);
                                                           //  ��ӹ��� AŬ���������� aa�� ��
              // System.out.println("objc��ü�� ��ü �Ӽ� ���� bb�� ���� " + objc.bb);
                                                           //  private ���� �ش�Ŭ�������ο�����  ��� ������
		System.out.println("objc��ü�� ��ü �Ӽ� ���� bb�� ���� " + objc.bb());		
															// �޼ҵ�� �����ϸ�ȴ�
		System.out.println("objc��ü�� ��ü �Ӽ� ���� cc�� ���� " + objc.cc);
	}
}