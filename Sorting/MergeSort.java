package Sorting;

public class MergeSort {
        public static void main(String[] args){
        int n=10;
        int []arr={10,7,17,21,5,9,19,-3,4,1};
        ms(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void ms(int arr[],int l,int h){
        if(l==h)
            return;
        int mid=(l+h)/2;
        ms(arr,l,mid);
        ms(arr,mid+1,h);
        merge(arr,l,h);
    }
    public static void merge(int arr[],int l,int h){
        int temp[]=new int[h-l+1];
        int mid=(l+h)/2;
        int p1=l,p2=mid+1,k=0;
        while(p1<=mid && p2<=h){
            if(arr[p1]<=arr[p2])
                temp[k++]=arr[p1++];
            else
                temp[k++]=arr[p2++];
        }
        while(p1<=mid) 
            temp[k++]=arr[p1++];
        while(p2<=h)
            temp[k++]=arr[p2++];
        for(int i=0;i<h-l+1;i++){
            arr[l+i]=temp[i];
        }
    }
}
