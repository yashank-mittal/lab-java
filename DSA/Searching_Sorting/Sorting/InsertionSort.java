package DSA.Searching_Sorting.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void InsertionSortAlgo(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int j = i;
            System.out.println("Number of Iterations : "+i);
            System.out.print(Arrays.toString(a)+" ");
            System.out.println();
            while(j>0 && a[j]<a[j-1])
        {
            int temp = a[j];
            a[j] = a[j-1];
            a[j-1] = temp;
            j--;
        }
        }
    }
    public static void main(String[] args)
    {
        int a[] = {20,40,11,19,27,45};
        InsertionSortAlgo(a);
    }
}
