// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CoffeeMachine{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    private static CoffeeMachine my = null;
    
    private CoffeeMachine(){
        coffeeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }
    
    public void fillWater(float qty){
        waterQty = qty;
    }
    
    public void fillSugar(float qty){
        sugarQty = qty;
    }
    
    public float getCoffee(){
        return 0.23f;
    }
    
    static CoffeeMachine MakeInstance(){
        if(my == null){
            my = new CoffeeMachine();
            return my;
        }else{
            return my;
        }
    }
    
    
}

public class Singleton {
    public static void main(String[] args) {
        CoffeeMachine m = CoffeeMachine.MakeInstance();
        CoffeeMachine m1 = CoffeeMachine.MakeInstance();
        
        
        if(m == m1)System.out.println("Singleton Class is Acheived");
    }
}
