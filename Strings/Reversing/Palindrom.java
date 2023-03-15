package Strings.Reversing;

import java.util.Scanner;

import Strings.str;

public class Palindrom {
    public static void main(String[] args)
    {
        String str1,str2="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A String : ");
        str1 = scan.next();
        
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2 = str2 + str1.charAt(i);
        }
        
        if(str2.equals(str1))
        {
            System.out.println(str1 + " is palindrom");
        }
        else{
            System.out.println(str1 + " is not palindrom");
        }
    }
}
