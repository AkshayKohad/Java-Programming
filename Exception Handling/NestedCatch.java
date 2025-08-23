class NestedCatch {
    public static void main(String[] args) {
       
       int A[] = {10,20,30,40,50,0};
       
       try{
           int c = A[1]/A[5];
           
           System.out.println("Division of Number is "+c);
           
           try{
                System.out.println(A[6]);
           }
           catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Index is invalid");
           }
       }
       catch(ArithmeticException e){
           System.out.println("System should not be divided by 0");
       }
       
       System.out.println("Bye");
    }
}
