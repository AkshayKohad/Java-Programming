class MyRun implements Runnable{
    public void run(){
        
    }
}

class MyThread extends Thread{
    MyThread(String name){
        // To give name to thread which will be given by original thread class that's why use super
        super(name);
        // SET PRIORITY AS MAX i.e 10
        setPriority(Thread.MAX_PRIORITY);
        
        // SET PRIORITY AS MIN i.e 1
        setPriority(Thread.MIN_PRIORITY);
        
        // SET PRIORITY BETWEEN MIN AND MAX
        setPriority(Thread.MIN_PRIORITY + 2);
    }
}
public class ThreadFunctionality {
    public static void main(String[] args) {
       Thread t = new Thread("My name");
       
       Thread th = new Thread(new MyRun());
       
       MyThread th1 = new MyThread("My Thread name Th1");
       System.out.println("ID : " + th1.getId());
       System.out.println("Name : " + th1.getName());
       System.out.println("Priority : " + th1.getPriority());
       System.out.println("State : " + th1.getState()); // New
       System.out.println("Alive : " + th1.isAlive());  // false
       
       th1.start();
       
       System.out.println("State : " + th1.getState()); // RUNNABLE
       System.out.println("Alive : " + th1.isAlive()); // false
       
    }
}
