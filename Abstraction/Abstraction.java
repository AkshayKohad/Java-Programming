abstract class Super{
    Super(){
        System.out.println("Super class Initiated");
    }

    void meth1(){
        System.out.println("Meth1 is called");
    }

    abstract void meth2();  // if function in class is abstract then that class should be also abstract, but vice versa is not true
  
}

class Sub extends Super{
    Sub(){
        System.out.println("Sub class Initiated");
    }

    @Override
    void meth2(){
        System.out.println("Meth2 method is called due to Inheritance in Sub class");
    }

}

public class Abstraction{
    public static void main(String args[]){
        //Super s = new Super(); // cannot create object of abstract class
        //s.meth1(); // cannot call function of abstract class by creating object of abstract class

        //Super s; // we can only create reference, that is allowed

        Super s = new Sub(); // we can create Inherited class of abstract class
        s.meth1();
        s.meth2();

    }
}