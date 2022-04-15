package Session13_LinkedList.Problems;
//void insert(Node head,int pos,int ele)
//node insertSSLL(node head,int ele)
//node delete(node head,int pos)
//node deleteAll(node head,int ele)
//         itr and rec
public class insertAndDelete2 {
    public static Node insert(Node head,int pos,int ele){
        if(pos<0 || pos>CreatingLL1.length(head)){
            return head;
        }
        Node nn=new Node(ele);
        if(pos==0){
            nn.next=head;
            return nn;
        }
        Node curr=head;
        for(int i=0;i<pos-1;i++){
            curr=curr.next;
        }
        nn.next=curr.next;
        curr.next=nn;
        return head;
    }
    public static Node insertSSLL(Node head,int ele){
        Node nn=new Node(ele);
        if(head==null || ele<head.data){
            nn.next=head;
            return nn;
        }
        Node curr=head;
        while(curr.next!=null && curr.next.data<ele){
            curr=curr.next;
        }
        nn.next=curr.next;
        curr.next=nn;
        return head;
    } 
    public static Node delete (Node head,int pos){
        if(pos<0 || pos>=CreatingLL1.length(head))
            return head;
        if(pos==0)
            return head.next;
        Node curr=head;
        while(--pos>0){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
    public static Node deleteAllRec(Node head,int ele){
        if(head==null)
            return null;
        if(head.data==ele)
            return deleteAllRec(head.next,ele);
        head.next=deleteAllRec(head.next,ele);
        return head;
    }
    public static Node deleteAllItr(Node head,int ele){
        if(head==null)
            return null;
        Node dummy=new Node(-1);
        dummy.next=head;
        Node prev=dummy,curr=head;
        while(curr!=null){
            if(curr.data==ele){
                curr=curr.next;
                prev.next=curr;
            }
            else{
                prev=prev.next;
                curr=curr.next;
            }
        }
        return dummy.next;
    }
    public static void main(String[] args){
        /*
        int n=7;
        int arr[]={8,10,12,14,17,19,21};
        Node head=CreatingLL1.createLL(arr, n);
        CreatingLL1.print(head);
        insert(head, 3, 13);
        insertSSLL(head, 16);
        CreatingLL1.print(head);
        */
        int n2=7;
        int arr2[]={8,8,10,4,4,4,4};
        Node head2=CreatingLL1.createLL(arr2,n2);
        CreatingLL1.print(head2);
        /*
        delete(head2, 6);
        CreatingLL1.print(head2);
        deleteAllRec(head2, 4);
        CreatingLL1.print(head2);
        */
        deleteAllItr(head2, 8);
        CreatingLL1.print(head2);
    }
}
