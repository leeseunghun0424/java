
class Shape2{
	private int x;
	private int y;
	
	public Shape2(int x, int y) {  // shape2 �޼ҵ� ����
		System.out.println("Shape");
		this.x = x;  // private int x 
		this.y = y;  // private int y
	}
}

class Rectangle2 extends Shape2{
	private int width;
	private int height;
	
	public Rectangle2(int x, int y, int width, int height) {  //���ο� �޼ҵ� ����
		super(x, y);    // shape2 �޼ҵ带 super�� ���
		System.out.println("Rectangle");
		this.width = width;
		this.height = height;
	}
}

class  ColorRectangle extends Rectangle2{
	private String color;
	
	public ColorRectangle(int x, int y, int width, int height, String color) {
		super(x, y, width, height);   // Rectangle2�޼ҵ带  super�� ���
		System.out.println("ColorRectangle");
		this.color = color;
	}
}

public class ShapeTest2 {
	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(10, 10, 20, 20, "red"); // 
	}
	
}