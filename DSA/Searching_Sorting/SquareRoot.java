package DSA.Searching_Sorting;

import java.util.Scanner;

public class SquareRoot {
    public static int SquareRootAlgo(int a[],int n)
    {
        int l = 0,r=n,result = -1;
        while(l<=r)
        {
            int mid = l + (r - l)/2;
            int val=mid * mid;
            if(val == n)
            {
                return mid;
            }
            else if(val > n)
            {
                r = mid - 1;
            }
            else if(val < n)
            {
                result = mid;
                l = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to find squareRoot : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" Numners : ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        int result = SquareRootAlgo(a,n);
        System.out.println("Square Root of "+n+" is = "+result);
    }
}
