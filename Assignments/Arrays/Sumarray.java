package Assignments.Arrays;

import java.util.Scanner;

//Write a program to print the sum of all the elements present on even indices in the given array.
public class Sumarray {
    public static void main(String[] args)
    {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter values in arrays : ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int j=0;j<a.length;j++)
        {
            if(j%2==0)
            {
                sum +=a[j];
            }
        }

        System.out.println("Sum of even indices of array is : "+sum);
    }
}
