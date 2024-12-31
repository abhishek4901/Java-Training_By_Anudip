package 
public class abstraction {
    

final int size;
int stack [];
int top;
    int stack[];
    int top;
    public demo1(){
        size = 8;
         stack = new int[size];
        top =-1;
    }
    public abstraction void push (int data);
    public abstract int pop();
    public boolean isEmpty() 
    {
        if(top==-1) return true;
        return false;
    }
    
}
public boolean isFull()