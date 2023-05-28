package Exception_Handling;

class MyException extends Exception
{
    public MyException(){}
    public MyException(String msg)
    {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args)
    {
        int n = 4;
        int n1 = -2;
        try{
            if(n1<0)
            {
                Exception e = new MyException("Negative Number");
                throw e;
            }
            else{
                int res = n/n1;
                System.out.println(res);
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Enter a valid number "+ e);
        }
    }
}
