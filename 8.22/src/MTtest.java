
public class MTtest {
	public static void method1(int n,int m) {
		n+=m;
		xMethod(3.4);
	}
	
	public static int xMethod(double n) {
		if (n >0) return 1;
		else if (n == 0)  return 0;
		else return -1;
	}
}
