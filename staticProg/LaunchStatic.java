package staticProg;

class Demo1
{
    static int a;
    static int b;

    int m;
    int n;
    {
        m=10;
        n=20;
        System.out.println("COntrol in non static block");
    }
    static{
        a=10;
        b=20;
        System.out.println("Control in static block");
    }

    void disp2()
    {
        System.out.println("Value of instance var "+ m);
        System.out.println("Value of instance var "+ n);
    }
    

    static void disp1()
    {
        System.out.println("Value of static var "+ a);
        System.out.println("Value of static var "+ b);
    }

}

public class LaunchStatic{
    public static void main(String[] args)
    {
        System.out.println("Hello");
        Demo1 d = new Demo1();
        Demo1.disp1();
        d.disp2();
        
    }
}