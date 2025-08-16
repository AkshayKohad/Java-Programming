class Outer{
    int x=10;

    class Inner{
        int y=20;

        void innerDisplay(){
            System.out.println("The value x(outer class Variable) and y(inner class Variable)  "+ x + " " + y);
        }
    }

    void outerDisplay(){
        Inner in = new Inner();
        in.innerDisplay();
    }
}

public class NestedClass{
    public static void main(String args[]){
       Outer o = new Outer();
       o.outerDisplay();
    
        // Other way to call inner class
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
    }
}
