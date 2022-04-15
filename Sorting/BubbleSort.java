package Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int n=5;
        int arr[]={3,10,17,5,-9};
        System.out.println("Before Sorting");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("Bubble Sort started from here");
        bubble(arr, n);
        System.out.println("Final Array");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static int[] bubble(int arr[],int n){
        int temp;
        int swap=0;

        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    cnt++;
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
            if(cnt==0){
                System.out.println(swap);
                return arr;
            }
        }
        System.out.println(swap);
        return arr;
    }

    public static int[] simplebubble(int arr[],int n){
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
