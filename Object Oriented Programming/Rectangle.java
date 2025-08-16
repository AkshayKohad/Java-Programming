class CalculateRectangle{

    float length;
    float breadth;

    CalculateRectangle(float length,float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    float CalculateArea(){
        return length*breadth;
    }

    float CalculatePerimeter(){
        return 2*(length+breadth);
    }

    boolean isSquare(){
        return length == breadth;
    }

}


public class Rectangle{
    public static void main(String args[]){
        CalculateRectangle r = new CalculateRectangle(10,20);
        System.out.println(r.CalculateArea());
        System.out.println(r.CalculatePerimeter());
        System.out.println(r.isSquare());
    }
}