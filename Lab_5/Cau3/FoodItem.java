public class FoodItem
{
    private String name;
    private double price;

    public FoodItem()
    {
        name = "";
        price = 0.0;
    }

    public FoodItem(String name, double price)
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
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        FoodItem fooditem = (FoodItem) obj;
        return name.equals(fooditem.name) && Double.compare(price, fooditem.price) == 0;
    }

    public static void main(String[] args)
    {
        FoodItem food = new FoodItem("String", 10000);
        System.out.println(food);
    }
}