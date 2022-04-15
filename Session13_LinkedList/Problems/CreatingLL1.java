package Session13_LinkedList.Problems;
//node createLL(int arr[],int n)
//void print(node head)
//void length(node head)
//void printRev(node head)
class Node {
    int data;
    Node prev,next;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class CreatingLL1 {
    public static Node createLL(int arr[],int n){
        Node head=new Node(arr[0]);
        Node curr=head;
        for(int i=1;i<n;i++){
            Node nn=new Node(arr[i]);
            curr.next=nn;
            curr=curr.next;
        }
        return head;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static int length(Node head){
        int cnt=0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }
    public static void printRev(Node head){
        if(head==null){
            return;
        }
        printRev(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String [] args){
        //CreatingLL1 t=new CreatingLL1();
        int n=7;
        int arr[]={8,10,12,14,7,9,1};
        Node head=createLL(arr, n);
        print(head);
        System.out.println(length(head));
        printRev(head);
    }
}

