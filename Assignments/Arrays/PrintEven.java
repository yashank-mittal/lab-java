package Assignments.Arrays;

import java.util.Scanner;

//Write a program to traverse over the elements of the array using for each loop and print all evenelements.
//{34,21,54,65,43},{4,3,6,7,1}
public class PrintEven {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter values in arrays : ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int val : a)
        {
            if(val%2==0)
            {
                System.out.print(val+" ");
            }
        }
    }
}
