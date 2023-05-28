package Interface;

interface Computer{
     void compileCode();
    
}
class Laptop implements Computer{
    public void compileCode()
    {
        System.out.println("you got 5 errors");
    }
}

class Developer{
    
    public void buildApp(Computer lp)
    {
        System.out.println("Builiding app");
        lp.compileCode();;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Computer cp = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(cp);
    }
}
