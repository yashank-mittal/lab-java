package Exception_Handling;

public class ThrowException {
    public static void main(String[] args)
    {
        int n = 4;
        int n1 = 2;
        try
        {
            if(n1<0)
            {
                Exception e = new ArithmeticException("Negative Number");
                throw e;
            }
            int res = n/n1;
            System.out.println(res);
        }
        catch(Exception e)
        {
            System.out.println("Enter a valid number "+e);
        }
    }    
}
