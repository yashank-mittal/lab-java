package Patterns;

public class tri {
    public static void main(String[] args)
    {
        int i,j,n=5;
         for(i=0;i<n;i++)
         {
        //     System.out.print(" ");
        //     for(j=0;j<n;j++)
        //     {
        //         if(i>=j)
        //         {
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.print(" ");
        //     for(j=0;j<n;j++)
        //     {
        //         if(i<=j)
        //         {
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.print(" ");
        //     for(j=0;j <= n - i + 1;j++)
        //     {
        //         //if(j <= n - i + 1)
        //         //{
        //             System.out.print("* ");
        //        // }else{
        //            // System.out.print("  ");
        //         //}
        //     }
        //     System.out.print(" ");
        //     for(j=0;j<n;j++)
        //     {
        //         if(i==n-1 || j==n-1 || (j+i>=n*2))
        //         {
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.print(" ");
        //     for(j=0;j<n;j++)
        //     {
        //         if(i<=j)
        //         {
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }System.out.print(" ");
            for(j=0;j<n;j++)
            {
                if(i<=j)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(j=0;j<n;j++)
            {
                if((i+j == n/2) || (j-i == n/2) || (i==n/2))
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
 }
