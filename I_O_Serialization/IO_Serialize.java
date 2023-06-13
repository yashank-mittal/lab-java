package I_O_Serialization;

import java.io.*;

class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name,int age,int runs)
    {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void display()
    {
        System.out.println("Name : "+name+" Age : "+age+" Runs : "+runs);
    }
}

public class IO_Serialize {
    public static void main(String[] args)
    {
        // Cricketer c = new Cricketer("Yashak", 22, 30000);
        // c.display();
        // try{
        //     FileOutputStream fos = new FileOutputStream("Serializetest.txt");
        //     BufferedOutputStream bos = new BufferedOutputStream(fos);
        //     ObjectOutputStream oos = new ObjectOutputStream(bos);

        //     oos.writeObject(c);
        //     oos.flush();
        //     oos.close();
        //     System.out.println("Serialization done");
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e.getMessage());
        // }

        try{
            FileInputStream fis = new FileInputStream("Serializetest.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois =new ObjectInputStream(bis);

            Cricketer c = (Cricketer)ois.readObject();
            c.display();

            ois.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }    
}
