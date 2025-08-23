// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class CallbackException {
    
    static int fun(){
        return 10/0;
    }
    
    static void fun2(){
        fun();
    } 
    
    static void fun3(){
        fun2();
    }
    public static void main(String[] args) {
        try{
            fun3();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
