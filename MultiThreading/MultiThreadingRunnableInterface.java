//With 2 classes

class MyThread implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class MultiThreadingRunnableInterface {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        
        t.start();
        
        int i=1;
        while(true){
            System.out.println(i+" World");
            i++;
        }
    }
}

// with one class
public class MultiThreadingRunnableInterface implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        MultiThreadingRunnableInterface m = new MultiThreadingRunnableInterface();
        Thread t = new Thread(m);
        
        t.start();
        
        int i=1;
        while(true){
            System.out.println(i+" World");
            i++;
        }
    }
}
