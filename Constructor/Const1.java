package Constructor;

class Student{
    private String name;
    private int age;
    
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    // public void setName(String name)
    // {
    //     this.name = name;
    // }

    // public String getName()
    // {
    //     return name;
    // }
    // public void setAge(int age)
    // {
    //     this.age = age;
    // }
    // public int getAge()
    // {
    //     return age;
    // }
    public void display()
    {
        System.out.println("My name is "+name+" and age is"+age);
    }
}

public class Const1 {
   public static void main(String[] args)
   {
        Student s1 = new Student("Yashank",10);
        // s1.setName("Yashank");
        // String name = s1.getName();
        // s1.setAge(22);
        // int age = s1.getAge();
        // System.out.println("My name is "+name+" and age is "+age);
   }


}
