package Searching;

public class BinarySearch {
    public static void main(String [] args){
        int n=10;
        int arr[]={-5,3,5,9,10,21,34,46,78,129};
        int k=10;
        System.out.println(BSI(arr, k, 0, n-1));
        System.out.println(BSR(arr,k,0,n-1));
    }
    public static boolean BSI(int arr[],int k,int l,int h){
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]<k)
                l=mid+1;
            else if(arr[mid]>k)
                h=mid-1;
            else if(arr[mid]==k)
                return true;
        }
        return false;
    }
    public static boolean BSR(int arr[],int k,int l,int h){
        if(l>h){
            return false;
        }
        int mid=(l+h)/2;
        if(arr[mid]<k)
        {
            return BSR(arr, k, mid+1, h);
        }
        else if(arr[mid]>k){
            return BSR(arr, k, l, mid-1);
        }
        else if(arr[mid]==k){
            return true;
        }
        return false;
    } 
}
