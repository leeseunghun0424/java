class OT1a {
	public void show(String str) {    //  �޼ҵ�   show   �� ����
		System.out.println("���� Ŭ������ �޼ҵ� show(String str)����  : " + str);
	}
}
class OT1b extends OT1a {   //  OT1aŬ�����κ��� ���
	public void show() {    // �Ű������� �ٸ��⋚���� �������̵�X 
		System.out.println("���� Ŭ������ �޼ҵ� show() ����");
	}
}
public class OverridingTest1 {
	public static void main(String args[]) {
		OT1b otb = new OT1b();
               
		otb.show("ó�� �����ϴ� �ڹ�");  // �Ű������� �ִ� �޼ҵ� ȣ��,OT1a�� �޼ҵ� �� ����
	       otb.show(); //  
	}
}