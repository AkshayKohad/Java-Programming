// If we are not handling exceptions and we need to print or run something , we do it in finally block

Public class FinallyBlock{
  static void meth1(){
    try{
      System.out.println(10/0);
    }
    finally{
      System.out.println("Final Message");
  }
  public static void main(String args[]){
      meth1();
  }
}
