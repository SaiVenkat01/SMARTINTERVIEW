package session11;
//Calculate the amount of water trapped between these buildings.
public class WaterTrappedInBuildings {
    public static void main(String[] args){
        int n=12;
        int arr[]={6,10,6,2,4,14,10,6,6,12,4,6};
        int x=brute(arr, n);
        System.out.println(x);
        int x2=landrArray(arr, n);
        System.out.println(x2);
        int x3=twop(arr, n);
        System.out.println(x3);
    }
    //brute force-n2,1
    public static int brute(int arr[],int n){
        int ans=0;
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j<=0;j--){
                
            }
        }
        return ans;
    }
    //using left max and right max array
    //n+n+n,n+n
    public static int landrArray(int arr[],int n){
        int ans=0;
        //creating l max array
        int lmax=0;
        int rmax=0;
        int larr[]=new int[n];
        int rarr[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>lmax){
                lmax=arr[i];
            }
            larr[i]=lmax;
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>rmax){
                rmax=arr[i];
            }
            rarr[i]=rmax;
        }
        for(int i=0;i<n;i++){
            ans+=Math.min(larr[i],rarr[i])-arr[i];
        }
        return ans;
    }
    //by using two pointer technique
    public static int twop(int arr[],int n){
        int ans=0;
        int p1=0,p2=n-1;
        int lmax=arr[p1],rmax=arr[p2];
        while(p1<p2){
            if(lmax<=rmax){
                p1++;
                lmax=Math.max(lmax,arr[p1]);
                ans+=lmax-arr[p1];
            }
            else{
                p2--;
                rmax=Math.max(rmax,arr[p2]);
                ans+=rmax-arr[p2];
            }
        }
        return ans;
    }
}
