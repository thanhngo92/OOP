import java.util.Scanner;

public class baitap14{
    public static void display_Info(){
        System.out.println("----Menu----");
        System.out.println("1. Coca");
        System.out.println("2. Pepsi");
        System.out.println("3. Sprite");
        System.out.println("4. Snack");
        System.out.println("5. Shutdown Machine");
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number;
        do
        {
            display_Info();
            System.out.println("Plese enter the number: ");
            number = sc.nextInt();
            if (number < 1 || number > 5) 
            {
            System.out.println("Please enter a valid number.");
            }
        }while(number < 1 || number > 5);
        
        if (number == 5) 
        {
            System.out.println("Machine is shutting down.");
            return;
        }
        
        int price = 0;
        switch(number)
        {
            case 1:
                price = 2;
                System.out.printf("The price of Coca is: %d$\n", price);
                break;
            case 2:
                price = 3;
                System.out.printf("The price of Pepsi is: %d$\n", price);
                break;
            case 3:
                price = 4;
                System.out.printf("The price of Sprite is: %d$\n", price);
                break;
            case 4:
                price = 5;
                System.out.printf("The price of Snack is: %d$\n", price);
                break;
    }   
            System.out.println("Please enter the amount of money: ");
            double amount = sc.nextDouble();
            if(amount >= price)
            {
                double change = amount - price;
                System.out.printf("Your change is %.2f$.", change);
            }
            else
            {
                System.out.println("Not enought money to buy this item. Please select again.");
            }
    }
}