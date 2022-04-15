package Session13_LinkedList.Problems;
//void distinct(Node head)
//node unique(Node head)
//node reverse(node head)
public class unqiueAndReverse3 {
    public static Node distinct(Node head){
        if(head==null) return head;
        Node prev=head,curr=head.next;
        while(curr!=null){
            if(prev.data==curr.data){
                curr=curr.next;
            }
            else{
                prev.next=curr;
                curr=curr.next;
                prev=prev.next;
            }
        }
        prev.next=curr;
        return head;
    }
    public static Node unique(Node head){
        if(head==null)
            return null;
        Node dummy=new Node(-1);
        dummy.next=head;
        Node prev=dummy,curr=head;
        while(curr!=null){
            if(curr.next!=null && curr.data==curr.next.data){
                while(prev.next.data==curr.data){
                    curr=curr.next;
                }
            }
            else{
                prev=prev.next;
                curr=curr.next;
            }
        }
        return dummy.next;
    }
    public static Node reverseItr(Node head){
        if(head==null || head.next==null)
            return head;
        Node prev=null;
        while(head!=null){
            Node temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
    public static Node reverseRec(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node revh=reverseRec(head.next);
        head.next.next=head;
        head.next=null;
        return revh;
    }
    public static void main(String [] args){
        int n=12;
        int arr[]={2,2,3,4,5,5,5,6,7,7,7,8};
        Node head1=CreatingLL1.createLL(arr, n);
        Node head2=CreatingLL1.createLL(arr, n);
        Node head3=CreatingLL1.createLL(arr, n);
        Node head4=CreatingLL1.createLL(arr, n);
        distinct(head1);
        CreatingLL1.print(head1);
        unique(head2);
        CreatingLL1.print(head2);
        reverseItr(head3);
        CreatingLL1.print(head3);
        reverseRec(head4);
        CreatingLL1.print(head4);
    }
}
    
