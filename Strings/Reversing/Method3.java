package Strings.Reversing;

public class Method3 {
    public static void main(String[] args)
    {
        String s1 = "Pwskills java";
        String s2 = "";
        String s3[] = s1.split(" ");
        for(String ele : s3)
        {
            for(int i=ele.length()-1;i>=0;i--)
            {
                s2 = s2 + ele.charAt(i);
            }
            s2 = s2 + " ";
        }
        System.out.println(s2);
    }
}
