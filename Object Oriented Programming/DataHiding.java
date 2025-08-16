class Rectangle{

    // Data is being hidden we cannot access length and breath directly

    private double length;
    private double breadth;

    double CalculateArea(){
        return length*breadth;
    }

    double CalculatePerimeter(){
        return 2*(length+breadth);
    }

    double getLength(){
        return length;
    }

    double getBreadth(){
        return breadth;
    }

    void setLength(double length){
        this.length = length;
    }

    void setBreadth(double breadth){
        this.breadth = breadth;
    }

}


public class DataHiding{
    public static void main(String ... args){
        Rectangle r = new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        r.setLength(10);
        r.setBreadth(10);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        System.out.println(r.CalculateArea());
        System.out.println(r.CalculatePerimeter());

    }
}