package Session9;

import java.util.Arrays;

public class RotationArray {
    public static void main(String[] args){
        int arr[]={5,1,10,-3,8,12,-1,3,9,7};
        int arr2[]=Arrays.copyOf(arr, 10);
        int arr3[]=Arrays.copyOf(arr, 10);
        int n=10;
        int d=3;
        int ans[]=brute(arr, n, d);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        int ans2[]=temp(arr2, n, d);
        for(int i=0;i<n;i++){
            System.out.print(ans2[i]+" ");
        }
        System.out.println();
        int ans3[]=reversing(arr3, n, d);
        for(int i=0;i<n;i++){
            System.out.print(ans3[i]+" ");
        }
        
    }
    public static int[] brute(int arr[],int n,int d){
        d=d%n;
        int tmp=0;
        for(int i=0;i<d;i++){
            tmp=arr[n-1];
            for(int j=n-1;j>=1;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=tmp;
        }
        return arr;
    }
    public static int[] temp(int arr[],int n,int d){
        int br[]=new int[n];
        d=d%n;
        for(int i=0;i<n;i++){
            br[(i+d)%n]=arr[i];
        }
        return br;
    }
    public static int[] reversing(int arr3[],int n,int d){
        d=d%n;
        rev(0,n-1,arr3);
        rev(0,d-1,arr3);
        rev(d,n-1,arr3);
        return arr3;
    }
    public static void rev(int start,int end,int[] arr3){
        int p1=start,p2=end;
        while(p1<=p2){
            int temp=arr3[p1];
            arr3[p1]=arr3[p2];
            arr3[p2]=temp;
            p1++;
            p2--;
        }
    }
}
