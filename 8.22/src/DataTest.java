
class Date{
	private int year;
	private String month;
	private int day;
	
	public Date() {
		this(1900,"1월",1);
	}
	
	public Date(int year) {
		this(year,"5월",18);		
	}
	
	public Date(int year,String month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//오버라이딩하여 사용
	public String toString(){
		return year + " 년 " + month +day +"일 " ;
		
	}
}



public class DataTest {
	public static void main(String[] args) { 
		Date date1 = new Date (2023,"5월",1);
		Date date2 = new Date (2023);
		Date date3 = new Date ();
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
	}

}
