import java.util.Scanner;
public class baitap9{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 1){
        if(n % 2 == 0){
            n = n / 2;
            System.out.printf("%d is Even, so we take n/2: %d\n", n, n);
        }else{
            n = 3*n + 1;
            System.out.printf("%d is Odd, so we take 3*n + 1: %d\n", n, n);
        }
        }
    }
}