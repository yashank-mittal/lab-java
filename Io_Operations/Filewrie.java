package Io_Operations;

import java.io.*;

public class Filewrie {
    public static void main(String[] args)
    {
        File dir = new File("PWJAVA");
        File f = new File(dir, "witefile");
        try{
            f.createNewFile();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try{
            FileWriter fw  = new FileWriter(f,true);
            fw.write("Yashank");
            fw.write("\n");
            char ch[] = {'j','w','a'};
            fw.write(ch);
            fw.write("extra");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("File write is complete please open it to read");
    }
}
