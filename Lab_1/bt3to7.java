import java.util.Scanner;
public class bt3to7{
    
    public static int bai3(int a, int b){
        int c = a%b;
        return c;
}

    public static double[] bai4(double f, double c){
        double C = (5/9.0)*(f - 32);
        double F = (9/5.0)*c + 32;
        return new double[] {C, F};
    }
    
    public static boolean bai5(int n){
        return ((n % 400 == 0 && n % 100 == 0) || (n % 4 == 0 && n % 100 != 0));
    }
    
    public static int bai6(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;    
    }
    
    public static int bai7(char chr){
        if((chr >= 65 && chr <= 90) || (chr >= 97 && chr <= 122)){
            return 1;
        } else if(chr >= 48 && chr <= 57){
            return 0;
        }
        return -1;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println(bai3(7,4));
        
        System.out.println("-----------------");
        double[] result = bai4(100.0, 72.3);
        System.out.println("F --> C: " +result[0]);
        System.out.println("C --> F: " +result[1]);
        
        System.out.println("-----------------");
        System.out.println("Enter n check in Leap Year: ");
        int n = sc.nextInt();
        boolean isYear = bai5(n);
        if(isYear){
            System.out.println("Is Leap Year!");
        }else{
            System.out.println("Is not Leap Year");
        }
        
        System.out.println("-----------------");
        int[] arr = {4,2,8,9,11,-7};
        int minValue = bai6(arr);
        System.out.println("Value Min: " +minValue);
        
        System.out.println("-----------------");
        char chr = '5';
        int rs = bai7(chr);
        if(rs == 1){
            System.out.println("Is char!");
        } else if(rs == 0){
            System.out.println("Is number");
        } else{
            System.out.println("Is special character!");
        }
    }
    
}