package DSA.Searching_Sorting.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args)
    {
        int a[] = {20,40,10,15,17,25,65};
        int min_idx;
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Steps : "+i);
            System.out.println(Arrays.toString(a));
            System.out.println();
            min_idx = i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j] < a[min_idx])
                {
                    min_idx = j;
                }
            }
            if(min_idx!=i)
            {
                int temp = a[min_idx];
                    a[min_idx] = a[i];
                    a[i] = temp;
            }
        }

        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(a));
    }
}
