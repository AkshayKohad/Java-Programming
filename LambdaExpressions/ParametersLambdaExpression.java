package lamdademo1;

@FunctionalInterface
interface MyLambda
{
    //public void display(String str);
    public int add(int x,int y);
}

public class ParametersLambdaExpression {

    public static void main(String[] args) {
      
        /*MyLambda m=(s)->{System.out.println(s);};
        m.display("Hello World");*/

        // Way1 of writing
        /*MyLambda m=(a,b)->{return a+b;};
        System.out.println(m.add(20,30));*/

        // Way2 of writing -> we can return a+b without using keyword using return
        MyLambda m=(a,b)->a+b;
        int r=m.add(20, 30);
        System.out.println(r);
    }
    
}
