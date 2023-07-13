package DSA.Searching_Sorting;

import java.util.Scanner;

public class BinaryS {
    public static int BinarySearch(int a[],int l,int r,int x)
    {
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(a[mid] == x)
            {
                return mid+1;
            }
            else if(a[mid] < x)
            {
                l = mid+1;
            }
            else if(a[mid] > x)
            {
                r = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int l = 0;
        int n = a.length;
        int r = n-1;
        System.out.println("Enter Searching Element : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = BinarySearch(a, l, r, x);
        if(result == -1)
        {
            System.out.println("Element not found");
        }        
        else
        {
            System.out.println("Element found in position : "+result);
        }
    }
}
