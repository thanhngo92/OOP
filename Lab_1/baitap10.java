import java.util.Scanner;

public class baitap10{
    
    public static int digit(int n){
        n = Math.abs(n);
        int lastDigit = n % 10;
        
        int firstDigit = n;
        
        while(firstDigit >= 10){
            firstDigit = firstDigit / 10;
        }
        return lastDigit + firstDigit;
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