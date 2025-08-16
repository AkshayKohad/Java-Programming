abstract class Shape{
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI*radius*radius;
    }

    @Override
    double perimeter(){
        return 2*Math.PI*radius;
    }


}

class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area(){
        return length*breadth;
    }

    @Override
    double perimeter(){
        return 2*(length+breadth);
    }
}


public class ShapeAbstraction{
    public static void main(String args[]){
        Shape c = new Circle(10);
        Shape r = new Rectangle(10,10);

        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}