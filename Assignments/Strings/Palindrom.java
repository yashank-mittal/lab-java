package Assignments.Strings;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.next();
        String s1 = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1 = s1 + s.charAt(i);
        }
        //System.out.println(s1);
        if(s.equals(s1))
        {
            System.out.println("String is Palindrom");
        }
        else{
            System.out.println("String is not palindrom");
        }
    }
}
