package Assignments.Strings;

import java.util.Scanner;

public class Duplicatechar {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String here : ");
        String inputString = sc.nextLine();
         DuplicateStringchar(inputString);
         
    }

    public static void DuplicateStringchar(String inputString){
           
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (c == inputString.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                System.out.print(c + " ");
            }
        }
        }
        
}

