class Test{
    static int x=10;
    int y=20;

    //Normal function can access both static and non-static members
    void show(){
        System.out.println(x+" "+y);
    }

    // Static methods can only access static variables
    static void display(){
        System.out.println(x);
    }
}

public class Static{
    public static void main(String args[]){
        Test t1 = new Test();
        t1.show();
        t1.x=30;
        t1.y=50;

        Test t2 = new Test();
        t2.show();
        // Static variables and methods are shared between objects so if we chnage static variable
        //  via one object it gets reflected in other object as well unlike non-static variables
        
    }
}