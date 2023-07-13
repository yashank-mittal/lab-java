package Assignments.Arrays;

import java.util.Scanner;
/*Write a program to find out the second largest element in a given array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 54
Input 1: arr[] = {4,3,6,7,1}
Output 1: 6 */

public class SecondLargest {
    public static void main(String[] args)
    {
        int n,max=0,sec_max=0;
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
            if(a[i] > a[max])
            {
                max = i;
            }
            
        }
        
        for(int i=1;i<a.length;i++)
        {
            if(a[i] > a[sec_max] && i!=max)
            {
                sec_max = i;
            }
        }

        System.out.println("Second Largest Value in array is : "+a[sec_max]);
    }
}
