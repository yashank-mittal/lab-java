package Strings;

import java.util.Arrays;



public class Anagram {
    public static void main(String[] args)
    {
        String str1 = "Th Classroom";
        String str2 = "School Master";

        //Remove whiteSpaces
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        System.out.println(str1);
        System.out.println(str2);

        //Convert it to lowercase 
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        System.out.println(str1);
        System.out.println(str2);

        //COnvert it to array
        char ar1[] = str1.toCharArray();
        char ar2[] = str2.toCharArray();
        
        //sort the array
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1, ar2))
        {
            System.out.println("Two strings are Anagram");
        }
        else{
            System.out.println("Two strings are not Anagram");
        }

    }
}
