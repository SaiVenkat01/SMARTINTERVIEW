package Searching.Problems;
import java.util.*;
public class sumofpairs {
    public static void main(String[] args){
        int n=6;
        int arr[]={8,12,20,-4,7,17};
        int k=14;
        boolean x=brute(arr, n, k);
        System.out.println(x);
        Arrays.sort(arr);
        boolean x1=twop(arr, n, k);
        System.out.println(x1);
        boolean x2=bstechnique(arr, n, k);
        System.out.println(x2);
    }
    //brute force
    //n2,1
    public static boolean brute(int arr[],int n,int k){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]==k-arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
    //sorted two pointer technique
    //nlogn+n,1
    public static boolean twop(int arr[],int n,int k){
        int p1=0,p2=n-1;
        while(p1<p2){
            if(arr[p2]+arr[p1]==k){
                return true;
            }
            else if(arr[p2]+arr[p1]>k){
                p2--;
            }
            else{
                p1++;
            }
        }
        return false;
    }
    //using binary search algo
    //nlogn+nlogn,1
    //sorting+n*search
    public static boolean bstechnique(int arr[],int n,int k){
        for(int i=0;i<n;i++){
            if(bs(arr,k-arr[i],i+1,n-1)){
                return true;
            }
        }
        return false;
    }
    public static boolean bs(int[] arr,int n,int l,int h){
        while(l<h){
            int mid=(l+h)/2;
            if(arr[mid]<n){
                l=mid+1;
            }
            else if (arr[mid]>n){
                h=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
