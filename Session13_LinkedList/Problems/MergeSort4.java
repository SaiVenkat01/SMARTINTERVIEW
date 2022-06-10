package Session13_LinkedList.Problems;

public class MergeSort4 {
    Node findMid(Node head,boolean lower){
        if(head==null || head.next==null){
            return head;
        }
        Node prev=null,s=head,f=head;
        while(f!=null && f.next!=null){
            prev=s;
            s=s.next;
            f=f.next.next;
        }
        if(f==null && lower){
            return prev;
        }
        return s;
    }
    Node mergeRec(Node h1,Node h2){
        if(h1==null)
            return h2;
        if(h2==null)
            return h1;
        if(h1.data<h2.data){
            h1.next=mergeRec(h1.next,h2);
            return h1;
        }
        h2.next=mergeRec(h1,h2.next);
        return h2;
    }
    Node mergeItr(Node h1,Node h2){
        if(h1==null)
            return h2;
        if(h2==null)
            return h1;
        Node dummy =new Node(-1);
        Node prev=dummy;
        while(h1!=null && h2!=null){
            if(h1.data<h2.data){
                prev.next=h1;
                h1=h1.next;
            }
            else{
                prev.next=h2;
                h2=h2.next;
            }
            prev=prev.next;
        }
        if(h1!=null)
            prev.next=h1;
        if(h2!=null)
            prev.next=h2;
        return dummy.next;
    }
    Node MS(Node head){
        if(head==null || head.next==null)
            return head;
        Node mid=findMid(head, true);
        Node rh=mid.next;
        mid.next=null;
        return mergeItr(MS(head),MS(rh));
    }
    public static void main(String[] args){
        int n=7;
        int arr[]={9,2,3,4,1,6,7};
        Node head=CreatingLL1.createLL(arr, n);
        MergeSort4 a=new MergeSort4();
        head=a.MS(head);
        CreatingLL1.print(head);
    }
}
