public class baitapf2 {
    // 7
    public static int find_Three(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max1 = num;
            }
        }

        for (int num : arr) {
            if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        for (int num : arr) {
            if (num > max3 && num < max2) {
                max3 = num;
            }
        }

        return max3;

    }

    // 8
    public static boolean remove_Array(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        int[] result = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (index != i) {
                result[j++] = arr[i];
            }
        }
        return true;
    }

    // 9

    public static int[] insert_Array(int[] arr, int value, int posi) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i < posi) {
                result[i] = arr[i];
            } else if (posi == i) {
                result[i] = value;
            } else {
                result[i] = arr[i - 1];
            }
        }
        return result;
    }

    public static int[] find_Duplicate(int[] arr)
    {
        int[] mark = new int[1001];
        int[] temp = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(mark[arr[i]] == 1)
            {
                temp[index++] = arr[i];
                mark[arr[i]] = 1;
            }
            mark[arr[i]] = 1;
        }
        int[] result = new int[index];
        for(int i=0;i<index;i++)
        {
            result[i] = temp[i];
        }
        return result;
    }
    
    
    public static int[] remove_Duplicate(int[] arr)
    {
        int[] mark = new int[1001];
        int[] temp = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(mark[arr[i]] == 0)
            {
                temp[index++] = arr[i];
                mark[arr[i]] = 1;
                
            }
        }
        
        int[] result = new int[index];
        for(int i = 0; i < index; i++)
        {
            result[i] = temp[i];
        }
        return result;
    }
    
    public static void print_Info(int[] arr)
    {
        for(int num : arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 22, 33, 11};
        System.out.println(find_Three(arr));
        int[] arr1 = {1, 3, 5, 8, 23, 17};
        if (remove_Array(arr1, 8)) {
            System.out.println("Remove successfully!");
        } else {
            System.out.println("No find value needed remove");
        }

        int[] result = insert_Array(arr, 7, 3);
        print_Info(result);
        
        int[] arr2 = {1, 3, 3, 1, 3, 2, 4, 5, 5};
        int[] result1 = find_Duplicate(arr2);
        print_Info(result1);
        
        int[] arr3 = {1, 3, 1, 2, 4, 5, 5, 5, 3};
        int[] result2 = remove_Duplicate(arr3);
        print_Info(result2);
    }
}
