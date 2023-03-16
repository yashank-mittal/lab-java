package Assignments.Strings;

import java.util.Scanner;

public class Duplicate {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String here : ");
        String inputString = sc.nextLine();
        String outputString = DuplicateString(inputString);
        System.out.println("Resultant String is : "+outputString);
    }

    public static String DuplicateString(String  inputString){
        String s = "";
        for(int i=0;i<inputString.length();i++)
        {
            char c = inputString.charAt(i);
            boolean isDuplicate = false;

            for(int j =0;j<i;j++)
            {
                if(c == inputString.charAt(j))
                {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate)
            {
                s+=c;                
            }
        }
        return s;
    }
}
