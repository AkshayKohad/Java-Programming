class Super{
    void meth1(){
        System.out.println("Super Meth1");
    }

    void meth2(){
        System.out.println("Super Meth2");
    }
}

class Sub extends Super{

    @Override
    void meth2(){
        System.out.println("Sub Meth2");
    }
    void meth3(){
        System.out.println("Sub Meth3");
    }
}


public class DynamicDispatch{
    public static void main(String ... args){

        // reference and object are both super
        Super su = new Super();
        su.meth1();
        su.meth2();
        System.out.println();

        // reference and object are both sub
        Sub sb = new Sub();
        sb.meth1();
        sb.meth2();
        sb.meth3();
        System.out.println();

        // reference is super and object is sub
        // since reference is super it cannot access non-overiding methods present in sub like meth3( )
        Super s = new Sub();
        s.meth1();
        s.meth2();
        
    }
}