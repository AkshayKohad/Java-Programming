class CalculateCylinder{

    double radius;
    double height;


    double lidArea(){
        return Math.PI*radius*radius;
    }
    double TotalSurfaceArea(){
        return 2*lidArea() + Circumference()*height;
    }

    double Circumference(){
        return 2*Math.PI*radius;
    }

    double Volume(){
        return lidArea()*height;
    }
}

public class Cylinder{
    public static void main(String ...args){
        CalculateCylinder c = new CalculateCylinder();
        c.radius = 10;
        c.height = 10;

        System.out.println(c.lidArea());
        System.out.println(c.TotalSurfaceArea());
        System.out.println(c.Circumference());
        System.out.println(c.Volume());
    }
}