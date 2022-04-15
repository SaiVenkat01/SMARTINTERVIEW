package Practice;
import java.util.*;
public class HashMapDemo {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }
            else{
                h.put(arr[i],1);
            }
        }
        int t=0;
        for(Map.Entry<Integer,Integer> entry:h.entrySet())
        {
            if(entry.getValue()==1){
                t=entry.getKey();
                break;
            }
            //System.out.println("key= "+entry.getKey()+" value="+entry.getValue());
        }
        System.out.println(t);
        sc.close();
    }
}
