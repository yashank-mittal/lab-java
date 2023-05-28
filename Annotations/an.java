package Annotations;

class Plane
{
    public void PlaneAtHeights()
    {
        System.out.println("Plane at high");
    }
}

class CargoPlane extends Plane
{
    @Override
    public void PlaneAtHeights()
    {
        super.PlaneAtHeights();
        System.out.println("Plane at low");
    }
}

public class an {
    public static void main(String[] args)
    {
        Plane p = new CargoPlane();
        p.PlaneAtHeights();
    }    
}
