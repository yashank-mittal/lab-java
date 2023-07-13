package Assignments.Arrays;

import java.util.Scanner;
//Write a program to calculate the maximum element in the array.
//{34,21,54,65,43} , {4,3,6,7,1}
public class MaxEle {
    public static void main(String[] args)
    {
        int n,max=0;
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

        System.out.println("Maximum Element in array is : "+a[max]);
    }
}
