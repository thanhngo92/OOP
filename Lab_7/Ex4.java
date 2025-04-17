interface GeometricObject
{
    double getArea();
    double getPerimeter();
}
interface Resizable
{
    void resize(int percent);
}

class Circle implements GeometricObject
{
    protected double radius;

    public Circle() { radius = 1.0; }
    public Circle(double radius) { this.radius = radius; }
    public double getRadius() { return radius;}
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public double getArea() { return Math.PI*radius*radius; }
    @Override
    public double getPerimeter() { return 2*Math.PI*radius; }

}

class ResizableCircle extends Circle implements Resizable
{
    public ResizableCircle() { super(); }
    public ResizableCircle(double radius) { super(radius); }

    @Override
    public void resize(int percent) { setRadius(getRadius()*percent / 100.0); }
}

public class Ex4 {
    public static void main(String[] args) {
        ResizableCircle rc = new ResizableCircle(10.0);
        System.out.println("Before resize:");
        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());

        rc.resize(50);  // Resize to 50%

        System.out.println("After resize:");
        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());
    }
}