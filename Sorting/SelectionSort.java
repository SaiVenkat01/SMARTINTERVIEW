package Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int n=5;
        int arr[]={3,10,17,5,-9};
        System.out.println("Before Sorting");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("Selection Sort started from here");
        simpleselectionReverse(arr, n);
        System.out.println("Final Array");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
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
                    System.out.print("changed -- "+i+" "+j+"  ");
                    for(int k=0;k<n;k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
                else{
                    System.out.print("Didn't changed -- "+i+" "+j+"   ");
                    for(int k=0;k<n;k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println(swap);
        return arr;
    }
    public static int[] simpleselection(int arr[],int n){
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
    public static int[] simpleselectionReverse(int arr[],int n){
        int temp;
        int swap=0;
        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                if(arr[i]<arr[j]){
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
