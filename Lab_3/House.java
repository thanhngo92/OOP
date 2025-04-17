public class House
{
    private String houseCode;
    private int numberOfBedRooms;
    private boolean hasSwimmingPool;
    private double area;
    private double costPerSquareMeter;
    
    public House()
    {
        houseCode = "A01";
        numberOfBedRooms = 2;
        hasSwimmingPool = false;
        area = 0;
        costPerSquareMeter = 0;
    }
    
    public House(String houseCode, int numberOfBedRooms, boolean hasSwimmingPool, double area, double costPerSquareMeter)
    {
        this.houseCode = houseCode;
        this.numberOfBedRooms = numberOfBedRooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }
    
    public String getHouseCode()
    {
        return houseCode;
    }
    
    public int getNumberOfBedRooms()
    {
        return numberOfBedRooms;
    }
    
    public boolean getHasSwimmingPool()
    {
        return hasSwimmingPool;
    }
    
    public double getArea()
    {
        return area;
    }
    
    public double getCostPerSquareMeter()
    {
        return costPerSquareMeter;
    }
    
    public void setHouseCode(String houseCode)
    {
        this.houseCode = houseCode;
    }
    
    public void setCostPerSquareMeter(int costPerSquareMeter)
    {
        this.costPerSquareMeter = costPerSquareMeter;
    }
    
    public void setArea(double area)
    {
        this.area = area;   
    }
    
    public void setNumberOfBedRooms(int numberOfBedRooms)
    {
        this.numberOfBedRooms = numberOfBedRooms;
    }
    
        public void setHasSwimmingPool(boolean hasSwimmingPool)
    {
        this.hasSwimmingPool = hasSwimmingPool;
    }
    
        public void getHouseCode(String houseCode)
    {
        this.houseCode = houseCode;
    }
    
    public double calculateSellingPrice()
    {
        double Subtotal = area*costPerSquareMeter;
        double sellingPrice;
        if(getHasSwimmingPool())
        {
            Subtotal += Subtotal*(10/100.0);
            sellingPrice = Subtotal + (15/100.0)*Subtotal;
        }
        else
        {
            sellingPrice = Subtotal + (15/100.0)*Subtotal;
        }
        return sellingPrice;
    }
    
    public String toString()
    {
        return "House["+getHouseCode()+", " +getNumberOfBedRooms()+", "+getHasSwimmingPool()+", "+calculateSellingPrice()+"]";
    }
    
}