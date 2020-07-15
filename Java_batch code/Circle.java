class Shape
{
	protected int size=7;
	public Shape()
	{
		System.out.println("Super class constructor");
	}
	public Shape(int x)
	{
		System.out.println("Value of x is "+x);
	}
}
public class Circle extends Shape
{
	protected int radius=6;
	public Circle()
	{
		super(20);
		//super();
		System.out.println("Sub Class Constructor");
	}
	public void show()
	{
		System.out.println("Size is "+size);
		System.out.println("Radius is "+radius);
	}
	public static void main(String args[])
	{
		Circle c1=new Circle();
		c1.show();
	}
}
