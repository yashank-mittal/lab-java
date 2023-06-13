package Io_Operations;

class student
{
    public String name;
    public int age;
    public String city;

    public student(){}
    public student(String name,int age,String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString(){
        return "Name :"+name+" age : "+age+" city : "+city;
    }
}

public class IO_op {
    public static void main(String[] args)
    {
        student s1 = new student("Yashank",22,"Jaipur");
        System.out.println(s1);
    }    
}
