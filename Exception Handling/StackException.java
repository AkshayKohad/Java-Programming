class StackOverflow extends Exception{
    public String toString(){
        return "Stack is full";
    }
}

class StackUnderflow extends Exception{
    public String toString(){
        return "Stack is empty";
    }
}

class Stack{
    private int size;
    private int st[];
    private int top = -1;
    
    public Stack(int sz){
        size = sz;
        st = new int[sz];
    }
    
    public void push(int x) throws StackOverflow {
        if(top == size-1)throw new StackOverflow();
        
        top++;
        st[top] = x;
        System.out.println("Successfully added value");
    }
    
    public int pop() throws StackUnderflow {
        int x = -1;
        
        if(top == -1)throw new StackUnderflow();
        
        x = st[top];
        top--;
        System.out.println("Sucessfully removed value");
        return x;
    }
    
    
}

class StackException {
    public static void main(String[] args) {
       Stack st = new Stack(5);
       
       try{
           st.push(5);
           st.push(5);
           st.push(5);
           st.push(5);
           st.push(5);
           st.push(5);
       }
       catch(StackOverflow e){
           System.out.println(e);
       }
       
    }
}
