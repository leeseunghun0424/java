package b_package;
import a_package.test1;
//import a_package.*;


public class test2 {
	public static void main(String[] arg)  {
		test1 t1 = new test1();
		System.out.println(t1.sum(10,20));
	}
}
