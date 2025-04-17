public class Point2D
{
    private float x;
    private float y;

    public Point2D() 
    {
        x = 0.0f;
        y = 0.0f;
    }

    public Point2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public String toString()
    {
        return "[" + getX() + ", " + getY() + "]";
    }

}