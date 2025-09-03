import java.lang.*;

class MyObject{
    
    //This all are in built functions of Object class which are overided, every class is by default inherits Object class
    public String toString(){ 
    return "My Object";
        
    }
    

    public int hashCode(){
        return 100;
    }
    
    public boolean equals(Object o){
        return this.hashCode() == o.hashCode();
    }
    
    // Note : Some functions like wait() and notify() cannot be overrided
}
class Main {
    public static void main(String[] args) {
           MyObject o1 = new MyObject();
           MyObject o2 = new MyObject();
           
           System.out.println(o1.equals(o2));
    }
}
