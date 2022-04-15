package Sorting;

public class InsertionSort {
    public static void main(String [] args){
        int n=5;
        int arr[]={3,10,17,5,-9};
        System.out.println("Before Sorting");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("Insertion Sort started from here");
        simpleinsertionReverse(arr, n);
        System.out.println("Final Array");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static int[] insertion(int arr[],int n){
        for(int i=1;i<n;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
    public static int[] simpleinsertionReverse(int arr[],int n){
        /*
        for(int i=n-2;i>=0;i--){
            int j=i+1;
            int key=arr[i];
            while(j<=n && arr[j]<key){
                arr[j-1]=arr[j];
                j++;
            }
            arr[j-1]=key;
        }
        */
        return arr;
    }
}
