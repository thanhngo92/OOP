abstract class Shape
{
    protected String color;
    protected boolean filled;
    
    public Shape() { color = ""; filled = false; }
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled (boolean filled) { this.filled = filled; }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Shape)
        {
            Shape s = (Shape) obj;
            return this.color.equals(s.color) && this.filled == s.filled && Double.compare(s.getArea(), this.getArea()) == 0;
        }
        return false;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString()
    {
        return "Color: " + color + ", Filled: " + filled;
    }
}

class Circle extends Shape
{
    private double radius;
    
    public Circle() { super(); radius = 1.0; }
    public Circle(double radius) { super(); this.radius = radius; }
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    public double getArea() { return Math.PI*radius*radius; }
    public double getPerimeter() { return 2*Math.PI*radius; }
    @Override
    public String toString()
    {
        return String.format("Radius: %.1f - Area: %.1f - Perimeter: %.1f",radius,getArea(),getPerimeter());
    }
    
}

class Rectangle extends Shape
{
    protected double width;
    protected double length;
    
    public Rectangle() { super(); width = 1.0; length = 1.0; }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() { return width; }
    public double getLength() { return length; }
    public void setWidth(double width) { this.width = width; }
    public void setLength(double length) { this.length = length; }
    public double getArea() { return width*length; }
    public double getPerimeter() { return (width + length)*2; }
    @Override 
    public String toString()
    {
        return String.format("width: %.1f - length: %.1f, area: %.1f - perimeter: %.1f",width,length,getArea(),getPerimeter());
    }
}

class Square extends Rectangle
{
    public Square() { super(); }
    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }
    
    public double getSide() { return getLength(); }
    public void setSide(double side) { setLength(side); setWidth(side); }
    public void setWidth(double side) { setWidth(side); }
    public void setLength(double side) { setLength(side); }
}


public class Ex2 
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4.0, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);
        for(int i = 0; i < shapes.length; i++)
        {
            System.out.println(shapes[i]);
        }
        if(shapes[0].equals(shapes[2]))
        {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}