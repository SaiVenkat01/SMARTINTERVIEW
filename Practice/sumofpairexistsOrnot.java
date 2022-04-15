package Practice;
import java.util.*;
public class sumofpairexistsOrnot {
    public static void main(String[] args){
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=6;
        int arr[]={3,10,-9,16,21,14};
        int k=19;
        for(int i=0;i<n;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }
            else{
                h.put(arr[i],1);
            }
        }
        System.out.println(usingmap(arr, n, k,h));
        System.out.println(moreoptimizedmap(arr, n, k));
    }
    //n+n,n
    public static boolean usingmap(int arr[],int n,int k,HashMap<Integer,Integer> map){
        for(int i=0;i<n;i++){
            if(map.containsKey(k-arr[i])){
                if(k-arr[i]==arr[i]){
                    if(map.get(arr[i])>1){
                        return true;
                    }
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
    //n,n
    public static boolean moreoptimizedmap(int arr[],int n,int k){
        HashSet<Integer> map=new HashSet<>();
        for(int ele:arr){
            if(map.contains(k-ele)){
                return true;
            }
            map.add(ele);
        }
        return false;
    }
}
