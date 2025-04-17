class Point2D
{
    protected float x;
    protected float y;
    
    public Point2D() 
    { 
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    
    public float getX() { return x; }
    public float getY() { return y; }
    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }
    public float[] getXY() { return new float[] {x,y}; }
    public void setXY(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString()
    {
        return String.format("x: %.1f - y: %.1f", x, y);
    }
    
}

class Point3D extends Point2D
{
    private float z;
    
    public Point3D() { this.z = 0.0f; }
    public Point3D(float x, float y, float z)
    {
        super(x,y);
        this.z = z;
    }
    
    public float getZ() { return z; }
    public void setZ() { this.z = z; }
    public float[] getXYZ() { return new float[] {x,y,z}; }
    public void setXYZ(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public String toString()
    {
        return String.format("x: %.1f - y: %.1f - z: %.1f",x,y,z);
    }
    
}

public class Ex3
{
    public static void main(String[] args)
    {
        Point2D p2d = new Point2D(7,8);
                System.out.println(p2d);
        float[] arr1 = p2d.getXY();
        
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        Point3D p3d = new Point3D(2,5,6);
        System.out.println(p3d);
        float[] arr2 = p3d.getXYZ();
        
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}