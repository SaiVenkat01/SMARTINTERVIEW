package Session12.StacksAndQueue;

public class stack {
    int top;
    int arr[];
    stack(){
        arr=new int[10000];
        top=-1;
    }
    public void push(int x){
        arr[++top]=x;
    } 
    public int pop(){
        return arr[top--];
    }
    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int size(){
        return top+1;
    }
}
