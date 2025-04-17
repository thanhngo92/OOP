import java.util.Scanner;
public class baitap8{
    public static double bt8a(int n){
        double sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    
    public static double bt8b(int n){
        double multiple = 1.0;
        for(int i = 1; i <= n; i++){
            multiple *= i;
        }
        return multiple;
    }
    
    public static double bt8c(int n){
        double sum = 0.0;
        for(int i = 0; i <= n; i++){
            sum += Math.pow(2, i);
        }
        return sum;
    }
    
    public static double bt8d(int n){
        double sum = 0.0;
        for(int i = 1; i <= n; i++){
            sum += 1/(2.0*i);
        }
        return sum;
    }
    
    public static double bt8e(int n){
        double sum = 0.0;
        for(int i = 1; i <= n; i++){
            sum += i*i;
        }
        return sum;
    }
    
    public static void display_Info(double result){
        System.out.println(result);
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        display_Info(bt8a(n));
        display_Info(bt8b(n)); 
        display_Info(bt8c(n));
        display_Info(bt8d(n));
        display_Info(bt8e(n));
    }
}