class Circle 
{
    protected double radius;
    protected String color;
    
    public Circle()
    {
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius() { return radius; }
    public String getColor() { return color; }
    
    public void setRadius(double radius) { this.radius = radius; }
    public void setColor(String color) { this.color = color; }
    
    public double getArea() { return Math.PI*radius*radius; }
    
    @Override 
    public String toString()
    {
        return String.format("radius: %.1f - color: %s - area: ", radius, color, getArea());
    }
} 
class Cylinder extends Circle{
    private double height;
    
    public Cylinder() { this.height = 1.0; }
    public Cylinder(double radius)
    {
        super(radius);
        this.color = "";
    }
    
    public Cylinder(double radius, double height)
    {
        super(radius);
        this.color = "";
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String color)
    {
        super(radius, color);
        this.height = height;
    }
    
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public double getVolume() { return Math.PI*radius*radius*height; }
    
    @Override 
    public String toString()
    {
        return String.format("height: %.1f - radius: %.1f - volume: %.1f", height, radius, getVolume());
    }
}

public class Ex1
{
    public static void main(String[] args)
    {
        Cylinder cl = new Cylinder(7.5,3,"Black");
        System.out.println(cl);
        Circle c = new Circle(15.3,"red");
        System.out.println(c);
		System.out.println(c.getArea());
    }
}
