package BitWise;
import java.util.*;
public class subsetExistsOrNot {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        //Given an array of the size n and sum k,check if there exists a subset
        //such that sum=k
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        boolean b=subset(arr, n, k);
        System.out.println(b);
        sc.close();
    }
    public static boolean subset(int arr[],int n,int k){
        for(int i=0;(1<<n)>i;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(((i>>j)&1)==1)
                    sum+=arr[j];
            }
            if(sum==k)  return true;
        }
        return false;
    }
}
