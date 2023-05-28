package Threads;

import java.util.Scanner;

class MyThread extends Thread
{
    public void run()
    {
        String t=Thread.currentThread().getName();
        if(t.equals("Calc"))
        {
            calc();
        }else if(t.equals("Print"))
        {
            message();
        }

    }
    public void calc()
    {
        System.out.println("Cal Task Stated");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First value");
        int n1 = sc.nextInt();
        System.out.println("Enter second value");
        int n2 = sc.nextInt();
        int res = n1+n2;
        System.out.println(res);
    }
    public void message()
    {
        System.out.println("Important Message");
    }
}

public class MulTrhread {
    public static void main(String[] args)
    {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("Calc");
        t2.setName("Print");
        t1.start();
        t2.start();       
    }
}