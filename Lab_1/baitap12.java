import java.util.Scanner;

public class baitap12{
    
    public static int digit(int n){
        int digit;
        int count = 0;
        int num = 0;
        while(n != 0){
            digit = n % 10;
            num = num*10 + digit;
            n = n / 10;
            count++;
        }
        if(n == 0)
            count = 1;
        return num;
    }
    
    public static void display_Info(int result){
        System.out.println(result);
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int result = digit(n);
        display_Info(result);
    }
}