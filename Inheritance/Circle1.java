class Circle{
    double radius;

    double area(){
        return Math.PI*radius*radius;
    }

    double perimeter(){
        return 2*Math.PI*radius;
    }

    double circumference(){
        return perimeter();
    }


}

class Cylinder extends Circle{
    double height;

    double volume(){
        return area()*height;
    }


}

public class Circle1{
    public static void main(String ... args){
        Cylinder c = new Cylinder();

        c.radius = 10;
        c.height = 10;

        System.out.println(c.area());
        System.out.println(c.volume());
    }
}