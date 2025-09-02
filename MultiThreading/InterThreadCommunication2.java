class WhiteBoard{
    String text;
    int numberOfStudents = 0;
    int count = 0;
    
    public void attendance(){
        numberOfStudents++;
    }
    
    synchronized public void write(String t){
        System.out.println("Teacher is writing : " + t);
        
        while(count!=0){
            try{wait();}catch(Exception e){}
        }
        text = t;
        count=numberOfStudents;
        notifyAll();
    }
    
    synchronized public String read(){
       while(count==0){
           try{wait();}catch(Exception e){}
       }
       
       String t = text;
       count--;
       
       if(count==0)notify();
       
       return t;
    }
}

class Teacher extends Thread{
    
    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
    
    WhiteBoard board;
    
    Teacher(WhiteBoard board){
        this.board = board;
    }
    
    public void run(){
        for(int i=0;i<notes.length;i++) this.board.write(notes[i]);
    }
}


class Students extends Thread{
    String name;
    WhiteBoard board;
    
    Students(String name,WhiteBoard board){
        this.name = name;
        this.board = board;
    }
    
    public void run(){
        String text;
        this.board.attendance();
        
        do
        {
            text = this.board.read();
            System.out.println("Student " + this.name + " is Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
        
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        WhiteBoard board = new WhiteBoard();
        
        Teacher t = new Teacher(board);
        
        Students s1 = new Students("Akshay",board);
        Students s2 = new Students("Akki", board);
        
        t.start();
        s1.start();
        s2.start();
    }
}
