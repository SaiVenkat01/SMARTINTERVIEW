package Session9;

public class maximumsubarraysum {
    public static void main(String []args){
        int n=13;
        int arr[]={3,10,-5,-4,-1,7,12,14,3,-20,-4,5,8};
        int x=brute(arr, n);
        System.out.println(x);
        int x1=carryforward(arr, n);
        System.out.println(x1);
    }
    //brute force
    //n3,1
    public static int brute(int arr[],int n){
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
    //carry forward method
    //we preserve the previous calculated subarray to calculate current value
    public static int carryforward(int arr[],int n){
        int ans=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}
