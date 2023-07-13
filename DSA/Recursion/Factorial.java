package DSA.Recursion;

import java.util.Scanner;

class Factorial
{
    public static int fact(int n)
    {
        int result=1;
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            result = n * fact(n-1);
        }
        return result;
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int res = fact(n);
        System.out.println(res);
    }
}

