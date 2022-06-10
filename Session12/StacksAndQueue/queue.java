package Session12.StacksAndQueue;

public class queue {
    int arr[];
    int front,rear;
    queue(){
        arr=new int[100];
        front=-1;
        rear=-1;
    }
    public void enqueue(int x){
        arr[++rear]=x;
    }
    public int dequeue(){
        return arr[++front];
    }
    public int peak(){
        return arr[front+1];
    }
    public boolean isEmpty(){
        return rear==front;
    }
    public int size(){
        return rear-front;
    }
}
