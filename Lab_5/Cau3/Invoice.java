public class Invoice
{
    private OrderItem[] orders;
    private int count;
    private double total_amount;

    public Invoice()
    {
        orders = new OrderItem[100];
        count = 0;
        total_amount = 0.0;
    }

    public void addItem(OrderItem item)
    {
        for(int i = 0; i < count; i++)
        {
            if(orders[i] != null &&orders[i].getName().equals(item.getName()))
            {
                orders[i] = new OrderItem(item.getName(), orders[i].getQuantity() + item.getQuantity(), item.getPrice_Per());
                total_amount += item.getQuantity() * item.getPrice_Per();
                return;
            }
        }

        if(count < orders.length)
        {
            orders[count++] = item;
            total_amount += item.getQuantity()*item.getPrice_Per();
        }
        else
        {
            System.out.println("Invoice is full, cannot add more items.");
        }
    }

    public void printInvoice() {
        System.out.println("\n--- INVOICE ---");
        for (int i = 0; i < count; i++) {
            System.out.println(orders[i].toString());
        }
        System.out.printf("Total Amount: %.1f\n", total_amount);
    }
}