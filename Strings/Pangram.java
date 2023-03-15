package Strings;

public class Pangram {
    public static void main(String[] args)
    {
        String str = "The Quick brown fo jump jumps over lazy dog";
        int flag = 1;
        str = str.replace(" ", "");
        str = str.toUpperCase();

        char ch[] = str.toCharArray();
        int ar[] = new int[26];
        
        for(int i=0;i<=ch.length-1;i++)
        {
            ar[ch[i] - 65]++;
        }

        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]);
        }

        for(int i=0;i<=ar.length-1;i++)
        {
           
            if(ar[i]==0)
            {
                flag = 0;
            }
            
        }
        if(flag == 1)
        {
            System.out.println("String is Pangram");
        }else{
            System.out.println("String is not Pangram");
        }


    }
}
