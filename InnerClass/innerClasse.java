//Memers , static , anonymous class are the three types of inner class 

class A{
    public void show()
    {
        System.out.println("In Show");
    }
   static class B 
    {
        public void display()
        {
            System.out.println("Indisplau");
        }
    }
}

public class innerClasse
{
    public static void main(String[] args)
    {
        A a = new A();
        a.show();
        //Member
        //A.B b = a.new B();
        //b.display();
        //In static 
        A.B b = new A.B();
        b.display();
    }
}