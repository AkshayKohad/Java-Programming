class ATM{
    synchronized public void checkBalance(String name){
        System.out.println(name + " Checking Balance");
        
        try{Thread.sleep(100);}catch(Exception e){}
        
        System.out.println(" Your Balance");
    }
    
    synchronized public void withdraw(String name,int amount){
        System.out.println(name + " Withdrawing Money");
        
        try{Thread.sleep(100);}catch(Exception e){}
        
        System.out.println(amount + " Withdrawn");
    }
}

class Customer extends Thread{
    String name;
    ATM atm;
    int amount;
    
    Customer(String name,ATM atm,int amount){
        this.name = name;
        this.atm = atm;
        this.amount = amount;
    }
    public void useATM(){
            atm.checkBalance(name);
            atm.withdraw(name,amount);
    }
    
    public void run(){
        useATM();
    }
    
}

public class ATMSynchronization {
    public static void main(String[] args) {
        ATM atm = new ATM();
        
        Customer c1 = new Customer("Akshay",atm,1000);
        Customer c2 = new Customer("Akki",atm,500);
        
        c1.start();
        c2.start();
    }
}
