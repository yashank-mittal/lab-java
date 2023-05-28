package Inheritance;

class Human{
    private String name;
    
    Human()
    {
        System.out.println("Human class Constructor");
    }
    int age;
    void sleep()
    {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human
{
    void disp()
    {
        System.out.println("The age is : "+age);
        //System.out.println("The name is : "+name);
    }
}
public class Inheritance1 {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.sleep();
    }
}
