package Searching.Problems;


public class everyelementRepeatedTwiceExcept1 {
    public static void main(String args[]){
        int n=13;
        int arr[]={-1,2,2,4,4,6,6,10,10,12,12,21,21};
        int x=iandiplus1(arr, n);
        System.out.println(x);
        int x1=usingbs(arr, n);
        System.out.println(x1);
    }
    //using xor n,1
    //using i and i+1 checking 
    //nlogn+n/2,1
    public static int iandiplus1(int arr[],int n){
        int ans=0;
        for(int i=0;i<n;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return ans;
    } 
    public static int usingbs(int arr[],int n){
        int l=0,h=n-1;
        if(n==1){
            return arr[0];
        }
        while(l<=h){
            int mid=(l+h)/2;
            if((mid&1)==1){
                if(mid>0 && arr[mid]==arr[mid-1] )    
                    l=mid+1;
                else    
                    h=mid-1;
            }
            else{
                if(mid>0 && arr[mid]==arr[mid-1])   
                    h=mid-2;
                else    
                    l=mid+2;
            }
        }
        return arr[h];
    }
}
