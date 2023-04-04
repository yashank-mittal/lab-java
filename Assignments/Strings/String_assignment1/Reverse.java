package Assignments.Strings.String_assignment1;

public class Reverse {
    public static void main(String[] args)
    {
        StringBuilder input = new StringBuilder("PWSKILLS");
        StringBuilder str = new StringBuilder("");
        for(int i=input.length()-1;i>=0;i--)
        {
            str.append(input.charAt(i));
        }
        System.out.println(str);

    }
}
