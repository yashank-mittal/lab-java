package Io_Operations;

import java.io.*;

public class Filereads {
    public static void main(String[] args)
    {
        File dir = new File("PWJAVA");
        File f = new File(dir, "witefile");
        try
        {
            FileReader fd = new FileReader(f);
            char ch[] = new char[(int)f.length()];
            fd.read(ch);
            for(char data : ch)
            {
                System.out.print(data);
            }
            System.out.println();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
