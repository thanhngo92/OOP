class Product
{
    protected String name;
    protected double basePrice;
    protected int stock;
    protected double promotionDiscount;

    public Product() {}
    public Product(String name, double basePrice, int stock, double promotionDiscount)
    {
        this.name = name;
        this.basePrice = basePrice;
        this.stock = stock;
        this.promotionDiscount = promotionDiscount;
    }
    public double calculateFinalPrice() { return basePrice*(1 - promotionDiscount/100.0); }
    public boolean sellItem(int quantity)
    {
        if(quantity <= stock)
        {
            this.stock -= quantity;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return String.format("Product [name=%s, basePrice=%.1f, stock=%d, promotionDiscount=%.1f", name, basePrice, stock, promotionDiscount);
    }
}

class FoodItem extends Product
{
    private boolean isHot;

    public FoodItem(String name, double basePrice, int stock, double promotionDiscount, boolean isHot)
    {
        super(name, basePrice, stock, promotionDiscount);
        this.isHot = isHot;
    }
    @Override
    public double calculateFinalPrice() { return super.calculateFinalPrice() + ((isHot) ? 5000.0 : 0.0); }

}

class BeverageItem extends Product
{
    private String size;

    public BeverageItem() { super(); }
    public BeverageItem(String name, double basePrice, int stock, double promotionDiscount, String size)
    {
        super(name, basePrice, stock, promotionDiscount);
        this.size = size;
    }

    @Override
    public double calculateFinalPrice()
    {
        if("M".equals(size))
            return super.calculateFinalPrice() + 3000.0;
        if("L".equals(size))
            return super.calculateFinalPrice() + 6000.0;
        return super.calculateFinalPrice();
    }

}

class OrderManager
{
    private Product[] products;

    public OrderManager(Product[] products) { this.products = products; }
    

    public Product findProduct(String name)
    {
        for(Product p : products)
        {
            if(p.name.equals(name))
                return p;
        }
        return null;
    }

    public double processOrder(String[] orderNames, int[] quantities) {
        double totalCost = 0.0;
        boolean hasSandwich = false;
        int coffeeCount = 0;
        double coffeeUnitPrice = 0.0;
    
        for (int i = 0; i < orderNames.length; i++) {
            Product p = findProduct(orderNames[i]);
            if (p != null && p.sellItem(quantities[i])) {
                totalCost += p.calculateFinalPrice() * quantities[i];
    
                if (p.name.equals("Ham Sandwich")) {
                    hasSandwich = true;
                }
    
                if (p.name.equals("Vietnamese Iced Coffee")) {
                    coffeeCount += quantities[i];
                    coffeeUnitPrice = p.calculateFinalPrice();
                }
            }
        }
    
        if (hasSandwich && coffeeCount >= 2) {
            totalCost -= coffeeUnitPrice;
        }
        return totalCost;
    }
    
    
}

public class SevenElevenOrderManager
{
    public static void printProduct(Product[] p)
    {
        for(Product ps : p)
        {
            System.out.println(ps);
        }
    }
    public static void main(String[] args) {
        Product[] menu = new Product[6];
        menu[0] = new FoodItem("Grilled Chicken Sandwich", 45000.0, 10, 0, true);
        menu[1] = new FoodItem("Ham Sandwich", 30000.0, 15, 0, false);
        menu[2] = new FoodItem("Sweet Pastry", 17000.0, 20, 0, false);
        menu[3] = new BeverageItem("Vietnamese Iced Coffee", 35000.0, 30, 10.0, "M");
        menu[4] = new BeverageItem("Green Tea", 28000.0, 25, 5.0, "");
        menu[5] = new BeverageItem("Orange Juice", 24000.0, 20, 0, "L");

        OrderManager odm = new OrderManager(menu);

        System.out.println("Form !");
        String[] orderNames3 = {"Grilled Chicken Sandwich", "Ham Sandwich", "Sweet Pastry", "Vietnamese Iced Coffee", "Green Tea"};
        int[] quantities3 = {2,3,4,2,3};
        double total3 = odm.processOrder(orderNames3, quantities3);
        printProduct(menu);
        System.out.println("Total cost: " + total3 + "\n");
    }
}

