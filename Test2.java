import java.util.Scanner;
interface Shape1
{
	void draw();
}

class Circle implements Shape1
{
	public void draw() {
		System.out.println("circle is drawn");
	}
}

class Square implements Shape1
{
	public void draw() {
		System.out.println("square is drawn");
	}
}

class Rectangle1 implements Shape1
{
	public void draw() {
		System.out.println("rectangle is drawn");
	}
}

class ShapeFactory
{
	public static Shape1 getShape() 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one shape");
		String s=scr.next();
		if(s.equals("circle"))
			return new Circle();
		else if(s.equals("rectangle"))
			return new Rectangle1();
		else if(s.equals("square"))
			return new Square();
		else
			System.out.println("invalid string");
		return null;
	}
}

class Test2
{
	public static void main(String[] args)
	{
		Shape1 s=ShapeFactory.getShape();
		s.draw();
	}
}





