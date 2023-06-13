package Io_Operations;
import java.io.*;

public class IO2 {
    public static void main(String[] args)
    {
        // File f = new File("yash.txt");
        // System.out.println(f.exists());
        // try{
        //     f.createNewFile();
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e.getMessage());
        // }
        // System.out.println(f.exists());

     //   File dir = new File("PWJAVA");
      //  dir.mkdir();
        
        // File f = new File(dir, "pw.java");
        // try{
        //     f.createNewFile();
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e.getMessage());
        // }

        int count = 0;
        File f = new File("Map");
        String str[] = f.list();

        for(String name : str)
        {
            System.out.println(name);
            count++;
        }
        System.out.println(count);
    }
}
