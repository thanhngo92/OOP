public class OrderItem
{
    private String name;
    private int quantity;
    private double price_per;

    public OrderItem()
    {
        name = "";
        quantity = 0;
        price_per = 0.0;
    }

    public OrderItem(String name, int quantity, double price_per)
    {
        this.name = name;
        this.quantity = quantity;
        this.price_per = price_per;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public double getPrice_Per()
    {
        return price_per;
    }

    @Override
    public String toString()
    {
        return String.format("%s - Qty: %d - Price: %.2f", name, quantity, price_per);
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        OrderItem orderitem = (OrderItem) obj;
        return name.equals(orderitem.name) && quantity == orderitem.quantity && Double.compare(price_per, orderitem.price_per) == 0;
    }

}