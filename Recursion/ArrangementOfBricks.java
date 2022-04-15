package Recursion;
//Print all possible arrangement of placing the bricks in the arrray
//n->size
//arr[] ->is  the array in which we will arrange
//br[]->sizes of different bricks
//k is the minimum distance between bricks
public class ArrangementOfBricks {
    public static void main(String [] args){
        int n=16;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=0;
        }
        int br[]={3,2,4};
        f(arr,n,br,3,1,0,0);
    }
    public static void f(int arr[],int n,int br[],int m,int k,int idxA,int idxB){
        if(idxB==m){
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        if(idxA>=n)
            return;
        for(int i=idxA;i+br[idxB]<=n;i++){
            for(int j=0;j<br[idxB];j++){
                arr[i+j]=idxB;
            }
            f(arr,n,br,m,k,i+br[idxB]+k,idxB+1);
            for(int j=0;j<br[idxB];j++){
                arr[i+j]=-1;
            }
        }
        
    }
}
