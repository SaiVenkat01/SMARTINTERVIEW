package Recursion;
import java.util.*;
public class subsetExistsOrNot {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        boolean t=subset(arr,n,k,0,0);
        System.out.println(t);
        sc.close();
    }
    public static boolean subset(int arr[],int n,int k,int sum,int idx){
        if(idx==n)
            return sum==k;
        return(subset(arr,n,k,sum+arr[idx],idx+1))||(subset(arr,n,k,sum,idx+1));
        //or
        //return (subset(arr,n,k-arr[idx],idx+1))||(subset(arr,n,k,idx+1));
    }
}
