class Parent{
    Parent(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child Class");
    }
} 

class GrandChild extends Child{
    GrandChild(){
        System.out.println("GrandChild Class");
    }
}


public class InheritanceConstructor{
    public static void main(String ... args){
        Parent p = new Parent();
        Child c = new Child();
        GrandChild g = new GrandChild();
    }
}