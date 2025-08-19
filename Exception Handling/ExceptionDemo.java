// Online Java Compiler
// Use this editor to write, compile and run your Java code online



public class ExceptionDemo {
    public static void main(String[] args) {
        int a=10,b=0,c;
        
        try{
            c = a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number cannot be divided by Zero"); 
        }
        
        System.out.println("Bye");
    }
}
