package Strings.Reversing;

public class Method2 {
    public static void main(String[] args)
    {
        String s1 = "Pwskill java";
        String s2 = "";
        String s3[] = s1.split(" ");
        for(int i=s3.length -1;i>=0;i--)
        {
            s2 = s2+s3[i]+" ";
        }
        System.out.println(s2);
    }
}
