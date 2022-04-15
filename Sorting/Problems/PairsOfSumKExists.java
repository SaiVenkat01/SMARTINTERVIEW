package Sorting.Problems;

import java.util.*;

//Given an array of size n and a number k,check if there exists
//any pair of elements whose sum is k
public class PairsOfSumKExists {
    public static void main(String[] args){
        int n=6;
        int arr[]={10,9,-4,7,17,21};
        int k=16;
        System.out.println(brute(arr, n, k));
        Arrays.sort(arr);
        System.out.println(twop(arr, n, k));
    }
    public static boolean brute(int arr[],int n,int k){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k)
                    return true;
            }
        }
        return false;
    }
    //To implement two pointer technique we need to sort it
    //after sorting we can use this things like
    //NlogN+N,N
    //mergesort algorithm is used to sort data
    public static boolean twop(int arr[],int n,int k){
        int p1=0,p2=n-1;
        while(p1<p2){
            if(arr[p1]+arr[p2]>k)   p2--;
            else if(arr[p1]+arr[p2]<k)  p1++;
            else if(arr[p1]+arr[p2]==k) return true;
        }
        return false;
    }
}
