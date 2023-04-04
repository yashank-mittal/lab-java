package Assignments.Strings.String_assignment1;
import java.util.Arrays;

public class sortAlphabettically {
    public static void main(String[] args)
    {
        String input = "Yashank";
        input = input.toLowerCase();
        char ch[] = input.toCharArray();
        Arrays.sort(ch);
        String result = new String(ch);
        System.out.println(result);
    }
    
}
