interface MyLambda{
    public void display();
}

class Demo{
    int temp = 10; // This variable assigned in this scope can be accessed by lambda function as well as we can update it
    
    void method1(){
        int count = 0; // This variable assigned here, can only be used in lambda function if it is defined as final or it is not changed in the scope of the function
        
         MyLambda m = () -> 
         {
            int x = 0; // This variable as be used as well as updated in Lambda function
            
            System.out.println("Hi");
            System.out.println("Bye");
         };
         
         m.display();
    }
   
}
public class VariablesScope {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
