enum Dept{
    CS("John", "Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");
    
    String head;
    String location;
    
    private Dept(String head,String location){
        this.head = head;
        this.location = location;
    }
    
    public String getHeadName(){
        return this.head;
    }
    
    public String getLocation(){
        return this.location;
    }
    
}
public 
class EnumPractice {
    public static void main(String[] args) {
        Dept d = Dept.CS;
        
        System.out.println("Head Name for " + d + " : " + d.getHeadName());
        System.out.println("Location for " + d + " : " + d.getLocation());
    }
}
