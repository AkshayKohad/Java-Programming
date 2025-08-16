class Parent{
    Parent(){
        System.out.println("Non-Param of Parent");
    }
    Parent(int x){
        System.out.println("Param of Parent " + x);
    }
}

class Child extends Parent{
    Child(){
        System.out.println();
    }

    Child(int y){
        System.out.println("Param of Child");
    }

    Child(int x,int y){
        super(x); // call parent class contructor which has Constructor with parameter x -> Parent(int x)
        System.out.println("2 Param of Child " + y);

    }
}




public class ParameterizedConstructor{
    public static void main(String args[]){

        System.out.println("Child class Initialization with no parameters");
        Child c = new Child();

        System.out.println("Child class Initialization with one parameter");
        Child c1 = new Child(10);

        System.out.println("Child class Initialization with two parameters");
        Child c2 = new Child(10,20);
    }
}