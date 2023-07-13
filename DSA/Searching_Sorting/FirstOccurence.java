package DSA.Searching_Sorting;

import java.util.Scanner;

public class FirstOccurence {
    public static int FirstOccureceB(int a[],int l,int r,int x)
    {
        int result = -1;
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(a[mid] == x)
            {
                result = mid;
                r = mid - 1;
            }
            else if(a[mid] < x)
            {
                l = mid +1;
            }
            else if(a[mid] > x)
            {
                r = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int a[] = {2,2,3,4,5,7,7,7,7,8,8,9,9};
        int l = 0;
        int n = a.length;
        int r = n-1;
        System.out.println("Enter Searching Element : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int FirstOccur = FirstOccureceB(a,l,r,x);
        if(FirstOccur == -1)
        {
            System.out.println("Element not Present");
        }
        else{
            System.out.println("First occurence of "+x+" is in position : "+FirstOccur);
        }
        
    }
}
