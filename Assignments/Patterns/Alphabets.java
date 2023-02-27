package Assignments.Patterns;

public class Alphabets {
    public static void main(String[] args)
    {
        int i,j,n=5;
        
        for(i=0;i<n;i++)
        {
            //A Alphabet
            for(j=0;j<n;j++)
            {
                if((i==0 && j>0 && j<n/2) || (j==0 && i>0) || (i==n/2 && j<n/2) || (j==n/2 && i>0))
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            //B Alphabet
            for(j=0;j<n;j++)
            {
                if(((i==0 && j<n-1) || j==0 || (j==n-1 && i>0) || (i==n-1 && j<n-1) || i==n/2))
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            //c Alphabet
            for(j=0;j<n;j++)
            {
                if((i==0) || j==0 || i==n-1)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            //D Alphabet
            for(j=0;j<n;j++)
            {
                if(j==0 || (i==0 && j<n/2) || (i>0 && j==n/2 && i<n-1) || (i==n-1 && j<n/2))
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
