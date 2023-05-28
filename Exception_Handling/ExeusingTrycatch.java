package Exception_Handling;


public class ExeusingTrycatch {
    public static void main(String[] args)
    {
        int n = 6;
        int n1 = 0;
        int re = 0;

        try
        {
            re = n/n1;
            System.out.println("try block");
        }
        catch(Exception obj)
        {
            System.out.println("Something out");
        }
        System.out.println(re);
        System.out.println("Bye");
    }
}
