@FunctionalInterface
interface MyLambda{
    public void display();
}

// class My implements MyLambda{
//     public void display(){
//         System.out.println("Hello World");
//     }
// }


public class LambdaIntro {
    public static void main(String[] args) {
        
        // Direct way of writing instead of implementing class from interface
        
        //   MyLambda m = new MyLambda(){
        //       public void display(){
        //           System.out.println("Hello World");
        //       }
        //   };
        
        //   m.display();
        
        
        // Way of writing Lambda Function
       MyLambda m=()->{System.out.println("Hello world");};
        
        m.display();
           
    }
}
