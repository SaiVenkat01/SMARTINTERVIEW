package Session12.StacksAndQueue;

public class circularQueue {
    int arr[];
    int front,rear,n;
    circularQueue(){
        n=100;
        arr=new int[n];
        front=-1;
        rear=-1;
    }
    public void enqueue(int x){
        rear=(rear+1)%n;
        arr[rear]=x;
    }
    public int dequeue(){
        front=(front+1)%n;
        return arr[front];
    }
    public int peek(){
        return arr[(front+1)%n];
    }
    public boolean isEmpty(){
        return rear==front;
    }
    public int size(){
        return (rear-front+n)%n;
    }
}
