import java.util.Scanner;

public class baitap13{
    
    public static boolean isPalindrome(int n){
        int original = n;
        int num = 0;
        int digit;
        while(n != 0){
            digit = n % 10;
            num = num*10 + digit;
            n = n / 10;
        }
        return original == num;
    }
    
    public static void display_Info(int result){
        System.out.println(result);
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        boolean result = isPalindrome(n);
        if(result){
            System.out.println("isPalindrome");
        }else{
            System.out.println("is Not Palindrome");
        }
    }
}