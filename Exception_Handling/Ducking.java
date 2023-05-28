package Exception_Handling;

class Demo
{
    public void a() throws ArithmeticException
    {
        b();
    }
    public void b() throws ArithmeticException
    {
        int n = 5;
        int n1 = 0;
        int res = n/n1;
        System.out.println(res);
    }
}

public class Ducking {
    public static void main(String[] args)
    {
        Demo obj = new Demo();
        try{
            obj.a();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.getMessage());
        }
    }    
}
