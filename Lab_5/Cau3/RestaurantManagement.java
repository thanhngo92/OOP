import java.util.Scanner;
public class RestaurantManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        FoodItem[] foodMenu = {
            new FoodItem("Chicken Rice", 50000.0),
            new FoodItem("Beef Noodles", 40000.0)
        };

        DrinkItem[] drinkMenu = {
            new DrinkItem("Coca Cola", 15000.0),
            new DrinkItem("Iced Tea", 5000.0)
        };

        Invoice ivc = new Invoice();
        while (true) {
            System.out.println("1. Order Food");
            System.out.println("2. Print Invoice");
            System.out.println("3. Pay and Exit");
            System.out.print("Select an option: ");
            int op = sc.nextInt();
            
            switch (op) {
                case 1:
                    int totalItems = foodMenu.length + drinkMenu.length;
                    System.out.println("Select item: ");
                    
                    for (int i = 0; i < foodMenu.length; i++) {
                        System.out.println((i + 1) + ". " + foodMenu[i].getName() + " - " + foodMenu[i].getPrice());
                    }

                    for (int i = 0; i < drinkMenu.length; i++) {
                        System.out.println((foodMenu.length + i + 1) + ". " + drinkMenu[i].getName() + " - " + drinkMenu[i].getPrice());
                    }

                    System.out.print("Enter item number: ");
                    int itemIndex = sc.nextInt() - 1;

                    if (itemIndex >= 0 && itemIndex < foodMenu.length) {
                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();
                        ivc.addItem(new OrderItem(foodMenu[itemIndex].getName(), quantity, foodMenu[itemIndex].getPrice()));
                    } else if (itemIndex >= foodMenu.length && itemIndex < totalItems) {
                        int drinkIndex = itemIndex - foodMenu.length;
                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();
                        ivc.addItem(new OrderItem(drinkMenu[drinkIndex].getName(), quantity, drinkMenu[drinkIndex].getPrice()));
                    } else {
                        System.out.println("Invalid choice! Please try again.");
                    }
                    break;

                case 2:
                    ivc.printInvoice();
                    break;

                case 3:
                    sc.close();
                    System.out.println("Payment successful!");
                    return;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
