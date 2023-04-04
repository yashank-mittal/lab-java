package staticProg;

import java.util.Scanner;

class LaunchFarmer{
    int pa;
    float td;
    static float ri;
    float si;

    static{
        ri= 8.5f;
    }

    void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please mention the amount required");
        pa =scan.nextInt();
        System.out.println("Please mention time duration");
        td = scan.nextFloat();
        
    }

    void compute()
    {
        si = (pa * ri * td)/100f;
    }

    void display()
    {
        System.out.println("SI is : "+si);
    }
}


public class Farmer {
    public static void main(String[] args){
        LaunchFarmer f1 = new LaunchFarmer();
        f1.input();
        f1.compute();
        f1.display();
        LaunchFarmer f2 = new LaunchFarmer();
        f2.input();
        f2.compute();
        f2.display();
    }    
}
