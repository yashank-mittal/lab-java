package Patterns;

public class diagonal {
    public static void main(String[] args)
    {
        int i,j,n=11;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if((i+j==n-1) || (i==j) || (i==0 || j==0 || j==n-1 || i==n-1) || (i+j==n/2) || (i-j==n/2) || (j-i == n/2) || (i+j ==(n-1)+(n/2)))
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(j=0;j<n;j++)
            {
                if((i+j==n/2) || (i-j==n/2) || (j-i == n/2) || (i+j ==(n-1)+(n/2)) || (i==0 || j==0 || i==n-1 || j==n-1))
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(j=0;j<n;j++)
            {
                if((i==0) || (j==0) || (i+j<=n/2) || (j==n-1) || (j-i>=n/2) || (i==n-1) || (i-j>=n/2)
                || (i+j>=(n-1)+(n/2)))
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(j=0;j<n;j++)
            {
                if(i>=j)
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
