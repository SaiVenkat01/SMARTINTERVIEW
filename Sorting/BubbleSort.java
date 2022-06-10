package Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int n=5;
        int arr[]={3,10,17,5,-9};
        bubble(arr, n);
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static int[] bubble(int arr[],int n){
        int temp;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    cnt++;
                }
            }
            if(cnt==0)
                return arr;
        }
        return arr;
    }
}
