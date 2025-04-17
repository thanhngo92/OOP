interface Movable
{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString()
    {
        return "Point at (" + x + ", " + y + ") with speed (" + xSpeed + ", " + ySpeed + ")";
    }
    @Override
    public void moveUp() { y += ySpeed; }
    @Override
    public void moveDown() { y -= ySpeed; }
    @Override    
    public void moveLeft() { x -= xSpeed; }
    @Override
    public void moveRight() { x += xSpeed; }
}

class MovableCircle implements Movable
{
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "Circle with radius " + radius + " and center " + center;
    }

    @Override
    public void moveUp() { center.moveUp(); }
    @Override
    public void moveDown() { center.moveDown(); }
    @Override
    public void moveLeft() { center.moveLeft(); }
    @Override
    public void moveRight() { center.moveRight(); }
}

public class Ex3
{
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(0, 0, 2, 3);
        System.out.println("Before move: " + p1);
        p1.moveUp();
        p1.moveRight();
        System.out.println("After move:  " + p1);

        System.out.println();

        MovableCircle c1 = new MovableCircle(5, 5, 3, 1, 10);
        System.out.println("Before move: " + c1);
        c1.moveDown();
        c1.moveLeft();
        System.out.println("After move:  " + c1);
    }
}