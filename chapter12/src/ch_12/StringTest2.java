package ch_12;

public class StringTest2 {
	public static void main (String args[]) {
		String s1 = "java korea" ;
		String s2 =	new String("java korea");
		String s3 = s2.intern();
		String s4 = "java korea";
		String s5 = new String("java korea");
		
		System.out.println("s1과 s2가 같은 장소? :" + (s1 == s2));
		System.out.println("s1과 s2가 값이 같은가? :" + (s1.equals(s2)));
		System.out.println("s1과 s3가 같은 장소? :" + (s1 == s3));
		System.out.println("s2과 s5가 같은 장소? :" + (s2 == s5));
		System.out.println("s2과 s5가 값이 같은가? :" + (s2.equals(s5)) );		
	}
}
