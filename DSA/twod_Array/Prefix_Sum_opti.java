package DSA.twod_Array;

import java.util.*;

public class Prefix_Sum_opti {
    public static void prefixSum(int a[][])
    {
        
        int m = a.length;
        int n = a[0].length;

        //Row-wise prefix-sum
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                a[i][j]+=a[i][j-1];
            }
        }
        System.out.println("Row-wise array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        //colown-wise prefix-sum
        for(int j=0;j<n;j++)
        {
            for(int i=1;i<m;i++)
            {
                a[i][j]+=a[i-1][j];
            }
        }
        
        System.out.println("Colwnm-wise array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static int sumRegion(int a[][],int r1,int r2,int c1,int c2)
    {
        int sum=0,up=0,left=0,repeated_region=0,result=0;
        sum = a[r2][c2];
        up=a[r1-1][c2];
        left = a[r2][c1-1];
        repeated_region=a[r1-1][c1-1];
        result = sum - up - left +repeated_region;
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter no of colwns : ");
        int n = sc.nextInt();
        System.out.println("Enter first row : ");
        int r1 = sc.nextInt();
        System.out.println("Enter second row : ");
        int r2 = sc.nextInt();
        System.out.println("Enter first colunm : ");
        int c1 = sc.nextInt();
        System.out.println("Enter second column : ");
        int c2 = sc.nextInt();
        System.out.println("Enter Matrix : ");
        int a[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        prefixSum(a);
        
        int result = sumRegion(a,r1,r2,c1,c2);
        System.out.println("Sum of the region are : "+result);
        sc.close();
    }
}
