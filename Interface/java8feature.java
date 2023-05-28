package Interface;

interface app{
    void show();
    default void config()
    {
        System.out.println("in config");
    }
    static void abc()
    {
        System.out.println("in abc");
    }
}
class B implements app
{
    public void show(){
        System.out.println("in show");
    }
}
public class java8feature {
    public static void main(String[] args)
    {

    }
}
