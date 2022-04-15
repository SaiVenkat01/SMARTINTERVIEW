package Searching.Problems;
import java.util.*;
//Given that for every query q,we need to print
//the number of occurances of a in arr[]
public class printnumberofOccurs {
    public static void main(String [] args){
        int n=17;
        int arr[]={-3,4,1,2,2,5,10,10,5,5,7,2,2,-3,5,5,2};
        int x=bruteOccur(arr, n, 10);
        System.out.println(x);
        System.out.println("till brute");
        //to implement by binary search we need to sort array
        Arrays.sort(arr);
        //nlogn time
        int queries[]={4,2,5,2,9,-3};
        for(int i:queries){
            int x1=bs(arr, n, i);
            System.out.println(x1);
        }
        System.out.println("using floor and ceil");
        for(int i:queries){
            int x2=compress(arr, n, i);
            System.out.println(x2);
        }
        System.out.println("compress");
    }
    //Q*n,1
    public static int bruteOccur(int arr[],int n,int a){
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                cnt++;
            }
        }
        return cnt;
    }
    //-3 -3 1 2 2 2 2 2 2 2 4 5 5 5 5 5 5 7 10 10
    //      BSCeil      BSFloor
    //to find the extreme indexes of 2
    public static int BSFloor(int arr[],int n,int q){
        int l=0,h=n-1,ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==q){
                ans=mid;
                l=mid+1;
            }
            else if(arr[mid]<q){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
    public static int BSCeil(int arr[],int n,int q){
        int l=0,h=n-1,ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==q){
                ans=mid;
                h=mid-1;
            }
            else if(arr[mid]<q)
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
    //nlogn+Q*(logn+logn),1
    //for sorting+Q*(BSCeil+BSFloor)
    public static int bs(int arr[],int n,int q){
        int p1=BSCeil(arr, n, q);
        int p2=BSFloor(arr, n, q);
        if(p1==-1)
            return 0;
        return (p2-p1+1);
    }
    //
    public static int compress(int arr[],int n,int q){
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans=0;
        for(int i=0;i<n;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }
            else{
                h.put(arr[i],1);
            }
        }
        if(h.containsKey(q)){
            ans=h.get(q);
        }
        return ans;
    }
}
