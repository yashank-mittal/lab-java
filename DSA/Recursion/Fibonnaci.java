package DSA.Recursion;

import java.util.Scanner;

public class Fibonnaci {
    public static int fibo(int n)
    {
        int res;
        if(n==0 || n==1)
        {
            return n;
        }
        else{
            res = fibo(n-1) + fibo(n-2);
        }
        return res;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        n = sc.nextInt();
        int res = fibo(n);
        System.out.println(res);
    }
}
