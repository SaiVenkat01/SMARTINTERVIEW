package Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int n=5;
        int arr[]={3,10,17,5,-9};
        selection(arr,n);
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static int[] selection(int arr[],int n){
        int temp;
        int swap=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swap++;
                }
            }
        }
        System.out.println(swap);
        return arr;
    }
}
