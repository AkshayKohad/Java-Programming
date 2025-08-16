class Rectangle{
    int length;
    int breadth;

    Rectangle(){
        length=breadth=1;
    }

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle{
    int height;

    Cuboid(){
        height = 1;
    }

    Cuboid(int height){
        this.height = height;
    }

    Cuboid(int height,int length, int breadth){
        super(length,breadth);
        this.height = height;
    }

    int volume(){
        return length*breadth*height;
    }
}


public class RectangleInheritance{
    public static void main(String args[]){

        System.out.println("Cuboid class Initialization with no parameters");
        Cuboid c = new Cuboid();
        System.out.println(c.volume());

        System.out.println("Cuboid class Initialization with height parameters");
        Cuboid c1 = new Cuboid(10);
        System.out.println(c1.volume());
        
        System.out.println("Cuboid class Initialization with length,breadth and height  parameters");
        Cuboid c2 = new Cuboid(10,10,10);
         System.out.println(c2.volume());
    }
}