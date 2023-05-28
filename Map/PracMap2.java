package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.*;

class Student
{
    private String name;
    private int  age;
    private String city;

    Student(){};
    Student(String name,int age,String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String toString()
    {
        return name + " "+ age + " " + city;
    }

}

public class PracMap2 {
    public static void main(String[] args)
    {
        Student s = new Student("Yashank",20,"Jaipur");
        Student s1 = new Student("Mittal",21,"Jodhpur");

        Map m = new HashMap();
        m.put(1,  s);
        m.put(2,s1);
        //System.out.println(m);

        Set data = m.entrySet();
        Iterator itr = data.iterator();
        while(itr.hasNext())
        {
            Map.Entry d = (Entry)itr.next();
            System.out.println(d.getKey() + " : " + d.getValue());
        }
    }
}
