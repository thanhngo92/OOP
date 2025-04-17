public class DrinkItem
{
    private String name;
    private double price;

    public DrinkItem()
    {}

    public DrinkItem(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return String.format("%s - %.2f", name, price);
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        DrinkItem ditem = (DrinkItem) obj;
        return name.equals(ditem.name) && Double.compare(price, ditem.price) == 0;
    }

}