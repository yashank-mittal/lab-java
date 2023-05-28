interface Car{
    void Drive(int age);
}

public class LambdaClass {
    public static void main(String[] args)
    {
        Car c = (age) -> {System.out.println("Driving at this "+age);};
        c.Drive(16);
    }
}
