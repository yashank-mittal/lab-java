interface Car
{
    public void Drive();
}

public class AnonymousClass {
    public static void main(String[] args)
    {
        Car c = new Car()
        //Anonymous
        {
            public void Drive()
            {
                System.out.println("Driving...");
            }
        };
        c.Drive();
    }
}
