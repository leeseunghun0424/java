class pi{
	
	double idnum;
	 static double pi = 3.14;
	int r = 3;
	public pi() {
		idnum = r*pi;
	}
	
}
public class Circle {
	public static void main(String args[]) {
		pi mypi = new pi();
		
		
		System.out.println("¿øÀÇ ³ĞÀÌ : " + mypi.idnum);
	}
	
}
