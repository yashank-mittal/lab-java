package Assignments.Strings.String_assignment1;

public class ReverseinPosition {
    public static void main(String[] args)
    {
        String input = "Think Twice";
        String str = "";
        String[] ar = input.split(" ");
        for(String ele : ar)
        {
            for(int i=ele.length()-1;i>=0;i--)
            {
                str = str + ele.charAt(i);
            }
            str+=" ";
        }
        System.out.println(str);
    }
}
