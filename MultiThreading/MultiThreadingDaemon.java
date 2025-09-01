class MyThread extends Thread{
    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++);
        }
    }
}



public class MultiThreadingDaemon {
    public static void main(String[] args) throws Exception
    {
      MyThread t = new MyThread();
      t.setDaemon(true); // If we set it as true then as soon as main thread gets close it will close this thread as well
      t.start();
      
      //try{Thread.sleep(100);}catch(Exception e){}
      // To check that threads is running or not we are delaying the termination of main thread, so that Daemon thread will get some time to execute and after main thread wakes up, it will get terminated along with main Thread
      
      
      // We can join the main thread with other threads so that main thread will wait for other threads to complete it's execution eventhough it is daemon thread
      
      Thread MainThread = Thread.currentThread(); // It reference the Main thread using currentThread functionality
      MainThread.join(); // It joins other threads
      
      // By default it joins all threads except daemon thread
      // To expliclitly join daemon thread we do join with main thread
      
      
      
    }
}
