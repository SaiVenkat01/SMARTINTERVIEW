package Session9;
//calculate the number of strictly increasing subsequences
public class strictlyincreasingSubsequnces {
    public static void main(String[] args){
        int n=9;
        int arr[]={24,3,19,21,17,6,13,-5,26};
        int x=f(arr, n,0,0);
        System.out.println(x);
        int x2=f2(arr,n);
        System.out.println(x2);
    }
    //2pow(n),1
    public static int f(int arr[],int n,int idx,int count){
        if(idx==n-1)
            return count;
        if(arr[idx]<arr[idx+1])
            return f(arr, n, idx+1,count+1);
        return f(arr,n,idx+1,count);
    }
    //2pow(n)*n,1
    public static int f2(int arr[],int n){
        int cnt=0;
        for(int i=0;i<(1<<n);i++){
            int ans=0;
            int pcnt=0;
            for(int j=0;j<n;j++){
                if(((i>>j)&1)==1){
                    if(arr[j]>ans){
                        ans=arr[j];
                        pcnt++;
                    }
                }
            }
            cnt=Math.max(pcnt,cnt);
        }
        return cnt;
    }
}
