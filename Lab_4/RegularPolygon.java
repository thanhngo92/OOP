public class RegularPolygon
{
    private String name;
    private int edgeAmount;
    private double edgeLength;
    
    public RegularPolygon()
    {
        name = "";
        edgeAmount = 3;
        edgeLength = 1;
    }
    
    public RegularPolygon(String name, int edgeAmount, double edgeLength)
    {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }
    
    public RegularPolygon(RegularPolygon polygon)
    {
        this.name = polygon.name;
        this.edgeAmount = polygon.edgeAmount;
        this.edgeLength = polygon.edgeLength;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getEdgeAmount()
    {
        return this.edgeAmount;
    }
    
    public double getEdgeLength()
    {
        return this.edgeLength;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEdgeAmount(int num)
    {
        edgeAmount = num;
    }
    
    public void setEdgeLength(double length)
    {
        edgeLength = length;
    }
    
    public String getPolygon()
    {
        return (edgeAmount == 3) ? "Triangle" : (edgeAmount == 4) ? "Quadrangle" : (edgeAmount == 5) ? "Pentagon" : (edgeAmount == 6) ? "Hexagon" : "Polygon has the number of edges greater than 6";
    }
    
    public double getPerimeter()
    {
        return edgeLength*edgeAmount;
    }
    
    public double getArea()
    {
        double a = (edgeAmount == 3) ? 0.433 : (edgeAmount == 4) ? 1 : (edgeAmount == 5) ? 1.72 : (edgeAmount == 6) ? 2.595 : -1;
        return edgeLength*edgeLength*a;
    }
    
    @Override
    public String toString()
    {
        return getName() + " - " + getPolygon() + " - " + getArea();
    }
    
}