package DSA.Array;


public class PalindromeA {
    public static void main(String[] args)
    {
        //Approach - 1

        /*int a[] = {1,2,3,3,1};
        int n = a.length;
        int copy[] = new int[n];
        int flag =1;

        for(int i=n-1;i>=0;i--)
        {
            copy[n-i-1] = a[i];
        }

        for(int j=0;j<copy.length;j++)
        {
            if(copy[j]!=a[j])
            {
                flag = 0;
            }
        }
        
        if(flag == 0)
        {
            System.out.println("Not a Palindromic Array");
        }
        else if(flag == 1)
        {
            System.out.println("Palindromic Array");
        }*/

        // Approach - 2

        int a[] = {1,2,1,1};
        int n = a.length;
        int flag = 1;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=a[n-i-1])
            {
                flag = 0;
            }
        }

        if(flag == 1)
        {
            System.out.println("Palindromic Array");
        }else if(flag == 0)
        {
            System.out.println("Not a Palindromic Array");
        }
    }
    
}
