package Sorting.Problems;

public class SortArraysOf1And0 {
    public static void main(String [] args){
        int n=10;
        int arr[]={0,0,0,0,1,0,1,1,0,1};
        sort0and1(arr, n);
    }
    public static void sort0and1(int arr[],int n){
        int p1=0,p2=n-1;
        while(p1<p2){
            if(arr[p1]==0)  
                p1++;
            else if(arr[p2]==1) 
                p2--;
            if(arr[p1]>arr[p2]) {
                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
