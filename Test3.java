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
	public static Shape1 getShape(String c) 
	{
		if(c.equals("circle"))
			return new Circle();
		else if(c.equals("rectangle"))
			return new Rectangle1();
		else if(c.equals("square"))
			return new Square();
		return null;
	}
}

class Test3
{
	public static void main(String[] args)
	{
		Shape1 s=ShapeFactory.getShape("circle");
		s.draw();
		s=ShapeFactory.getShape("square");
		s.draw();
		s=ShapeFactory.getShape("rectangle");
		s.draw();
	}
}





