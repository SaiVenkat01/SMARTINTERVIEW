package Searching;

public class BinarySearchCeil {
    public static void main(String[] args)
    {
        int n=7;
        int arr[]={-5,-3,4,8,10,17,21};
        int x=BSCeil(arr, n, 12);
        System.out.println(x);
    }
    public static int BSCeil(int arr[],int n,int q){
        int l=0,h=n-1,ans=Integer.MIN_VALUE;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]<q){
                l=mid+1;
            }
            else{
                ans=arr[mid];
                h=mid-1;
            }
        }
        return ans;
    }
}
