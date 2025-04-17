abstract class Shape {
	protected String color;
	public Shape() {
		this.color = "";
	}
	public Shape(String color) {
		this.color = color;
	}
	public abstract double getArea();
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;
	public Rectangle() {
		super();
		this.length = 0;
		this.width = 0;
	}
	public Rectangle(double length, double width, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}
	@Override
	public double getArea() {
		return this.length * this.width;
	}
	public double getPerimeter() {
		return (this.length + this.width) * 2.0;
	}
	public String toString() {
		return "Rectangle{" + "length=" + length +
		       ", width=" + width +
		       ", color=" + color + '}';
	}
}

class Triangle extends Shape
{
    private double base;
    private double height;
    
    public Triangle() { base = 1.0; height = 1.0; }
    public Triangle(double base, double height, String color)
    {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    public double getArea() { return (base*height)/2; }
    @Override
    public String toString()
    {
        return String.format("Triangle: base = %.1f - height = %.1f - Area = %.1f",base,height,getArea());
    }
}

public class Test {
	public static void main(String[] args) {
		Shape s = new Rectangle(4, 3, "white");
		System.out.println(s.toString());
		System.out.println("Area = " + s.getArea());
		s = new Triangle(8, 7, "black");
		System.out.println(s.toString());
		System.out.println("Area = " + s.getArea());
	}
}