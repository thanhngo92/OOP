class Shape
{
    protected String color;
    protected boolean filled;

    public Shape()
    {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}

class Circle extends Shape
{
    private double radius;

    public Circle() { this.radius = 1.0; }
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double width) { this.radius = width; }
    public double getArea() { return Math.PI*radius*radius; }
    public double getPerimeter() { return 2*Math.PI*radius; }
    
    @Override
    public String toString()
    {
        return "Circle["  + color + ", " + isFilled() + ", " + getRadius() + "]";
    }
}
class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle()
    {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length)
    {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    public double getArea() { return width * length; }
    public double getPerimeter() { return (width + length)*2; }

    @Override
    public String toString() {
        return "Rectangle[color=" + color + ", filled=" + isFilled() + 
               ", width=" + width + ", length=" + length + "]";
    }
}

class Square extends Rectangle
{
    public Square() { super(1.0, 1.0); }
    public Square(double side) { super(side,side); }
    public Square(double side, String color, boolean filled) { super(side,side,color,filled); }
    
    public double getSide() { return this.length; }
    public void setSide(double side)
    { 
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) { setSide(side); }
    @Override
    public void setLength(double side) { setSide(side); }

    
    @Override
    public String toString() {
        return "Square[color=" + color + ", filled=" + isFilled() + ", side=" + getSide() + "]";
    }
}

public class Ex4
{
    public static void main(String[] args)
    {
        Shape s = new Shape("Blue", true);
        System.out.println(s);

        Circle c = new Circle(5.5, "Green", false);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        Rectangle r = new Rectangle(2.0, 3.0, "Yellow", true);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        Square sq = new Square(4.0, "Black", false);
        System.out.println(sq);
    }
}