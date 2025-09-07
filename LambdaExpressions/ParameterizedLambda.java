interface MyLambda{
    public void display();
}

class UseLambda{
    public void callLambda (MyLambda m1){
        m1.display();
    }
}


class Demo{
    
    void method1(){
        UseLambda u1 = new UseLambda();
        u1.callLambda(()-> System.out.println("Hello World"));
        
    }
   
}
public class ParameterizedLambda {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
