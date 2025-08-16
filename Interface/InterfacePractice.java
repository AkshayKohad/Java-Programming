interface Test{
    public void meth1();
    public void meth2();
}

class Test1 implements Test{
    @Override
    public void meth1(){
        System.out.println("Meth1 is called in test1 class");
    }
    @Override
    public void meth2(){
        System.out.println("Meth2 is called in test1 class");
    }

    void meth3(){
        System.out.println("Meth3 is called");
    }
}



public class InterfacePractice{
    public static void main(String ...args){
        Test t = new Test1();
        t.meth1();
        t.meth2();
        //t.meth3(); // Reference of Interfaces cannot call methods which are not defined within them
    }
}