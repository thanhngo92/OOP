public class Main 
{
    //1
    public static int findMax(int[] arr)
    {
        if(arr.length == 0)
            return 0;
        int value_Max = arr[0];
        for(int i = 0; i < arr.length; i ++)
        {
            if(arr[i] > value_Max)
            {
                value_Max = arr[i];
            }
        }
        
        return value_Max;
    }
    //2
    public static int total_Even(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
                sum += arr[i];
        }
        return sum;
    }
    
    //3
    public static int count_Prime(int[] arr)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= 2 && arr[i] % 2 != 0)
            {
                count++;
            }
        }
        return count;
    }
    
    //4
    public static int find(int[] arr, int k)
    {
        int f_Index = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(k == arr[i])
            {
                f_Index = i;
            }
        }
        return f_Index;
    }
    
    //5
    public static void square(int[] arr)
    {
        for(int i = 0; i < arr.length;i ++)
        {
            arr[i] *= arr[i];
        }
    }
    
    public static int[] divisibleNumbers(int[] arr, int k)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % k == 0)
            {
                count++;
            }
        }
        int[] result = new int[count];
        for(int i = 0, j = 0; i < arr.length; i++)
        {
            if(arr[i] % k == 0)
            {
                result[j++] = arr[i]; 
            }
        }
        return result;
        
    }
    
    public static void print_Info(int[] arr2)
    {
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] +" ");  
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {   
        //1,2
        int[] arr = {1,3,4,5,6,7};
        System.out.println(findMax(arr));
        System.out.println(total_Even(arr));
        //3
        int[] arr1 = {1,17,23,44,52,59};
        System.out.println(count_Prime(arr1));
        //4
        System.out.println(find(new int[] {1,4,99,7,8,11}, 5));
        System.out.println(find(new int[] {1,4,5,7,8,11}, 5));
        //5
        int[] arr2 = {1,2,3,5,6,7,9};
        square(arr2);
        print_Info(arr2);
        //6
        int[] arr3 = {1,2,3,4,5,6,7,8};
        int[] result = divisibleNumbers(arr3,2);
        print_Info(result);
        
    }
}