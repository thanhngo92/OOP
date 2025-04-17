import java.util.Scanner;
public class Cau1
{
    public static int maxEven(int[] a)
    {
        int num = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            if(num < a[i] && a[i] % 2 == 0)
            {
                num = a[i];
            }
        }
        return (num == Integer.MIN_VALUE) ? -1 : num;
    }

    public static int minOdd(int[] a)
    {
        int num = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            if(num > a[i] && a[i] % 2 != 0)
            {
                num = a[i];
            }
        }
        return (num == Integer.MAX_VALUE) ? -1 : num;
    }

    public static int sumMEMO(int[] a)
    {
        return maxEven(a) + minOdd(a);
    }

    public static int sumEven(int[] a)
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                sum += a[i];
            }
        
        }
        return sum;
    }

    public static int prodOdd(int[] a)
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 != 0)
            {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int idxFirstEven(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                return i;
            }
        }
        return -1;   
    }
    
    public static int idxLastOdd(int[] a)
    {
        for(int i = a.length - 1; i >= 0; i--)
        {
            if(a[i] % 2 != 0)
            {
                return i;
            }
        }
        return -1;   
    }
    
    public static int[] input(int n)
    {
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    public static void printInfo(int[] a)
    {
        for(int num : a)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        int[] a = {1,7,-9,11,22,55,78};
        System.out.println(maxEven(a));
        System.out.println(minOdd(a));
        System.out.println(sumMEMO(a));
        System.out.println(sumEven(a));
        System.out.println(prodOdd(a));
        System.out.println(idxFirstEven(a));
        System.out.println(idxLastOdd(a));
        int[] result = input(3);
        printInfo(result);
    }
}