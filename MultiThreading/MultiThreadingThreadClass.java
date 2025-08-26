// One way using 2 classes
class MyThread extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}

public class MultiThreadingThreadClass {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        
        int i=1;
        while(true){
            System.out.println(i+" World");
            i++;
        }
    }
}

// Other way using only one class
oublic class MultiThreadingThreadClass extends Thread{
    
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
    
    public static void main(String[] args) {
        MultiThreadingThreadClass t = new MultiThreadingThreadClass();
        t.start();
        
        int i=1;
        while(true){
            System.out.println(i+" World");
            i++;
        }
    }
}
