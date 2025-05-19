import java.util.Scanner;

public class SortedArray {
    // write code here

    public static int[] getIntegers(int len) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }

        return arr;
    }
}
