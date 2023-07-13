package Assignments.Arrays;

import java.util.Scanner;

/**Given an array. Find the first peak element in the array. A peak element is an element that is greater than
its just left and just right neighbor.
Input 1: arr[] = {1,3,2,6,5}
Output 1: 6
Input 2: arr[] = {1, 4,7,3,2,6,5}
Output 1: 7 */
public class Peakele {
    public static void main(String[] args)
    {
        int n,peak=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter values in arrays : ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=1;i<a.length;i++)
        {
            if(a[i-1] < a[i] && a[i] > a[i+1])
            {
                  if(a[peak] < a[i])
                  {
                    peak = i;
                  }  
            }
        }

        System.out.println("Peak Element is : "+a[peak]);

    }
}
