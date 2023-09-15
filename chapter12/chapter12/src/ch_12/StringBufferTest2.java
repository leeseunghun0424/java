package ch_12;

public class StringBufferTest2 {

	
		public static void main(String [] args) {
	StringBuffer sb3 = new StringBuffer("java");
	StringBuffer sb4 = new StringBuffer("easy");
	
	
	System.out.println(sb3.append("korea"));
	System.out.println(sb4.append(sb3));
	System.out.println(sb3);
	System.out.println(sb4);
	System.out.println(sb3.substring(5,9));
	System.out.println(sb3.delete(5,10));
	System.out.println(sb4);
	System.out.println(sb3.reverse());
	
		}
}
