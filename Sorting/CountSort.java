package Sorting;

public class CountSort {
    public static void main(String [] args){
        int n=5;
        int arr[]={3,10,17,-5,9};
        countsorting(arr, n,-10,20);
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static int[] countsorting(int arr[],int n,int a,int b){
        int cnt[]=new int[b-a+1];
        int size=b-a+1;
        for(int i=0;i<size;i++){
            cnt[i]=0;
        }
        for(int ele:arr){
            cnt[ele-a]+=1;
        }
        int k=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<cnt[i];j++){
                arr[k]=i+a;
                k++;
            }
        }
        return arr;
    }    
}
