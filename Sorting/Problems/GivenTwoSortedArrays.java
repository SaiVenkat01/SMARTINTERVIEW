package Sorting.Problems;
//Given 2 sorted arrays A & B ,print their
    //data in merge data in sorted way
public class GivenTwoSortedArrays {
    public static void main(String [] args){
        int A[]={1,4,5,7,18};
        int B[]={2,3,6,19};
        int N=5;
        int M=4;
        twopointer(A, N, B, M);
        
    }
    
    //Using Two pointer technique
    
    public static void twopointer(int A[],int N,int B[],int M){
        int C[]=new int[M+N];
        int i=0,j=0,k=0;
        while(i<N && j<M){
            if(A[i]>B[j]){
                C[k]=B[j];
                k++;j++;
            }
            else{
                C[k]=A[i];
                k++;i++;
            }
        }
        while(i!=N){
            C[k]=A[i];
            k++;i++;
        }
        while(j!=M){
            C[k]=B[j];
            k++;j++;
        }
        for(int t=0;t<N+M;t++){
            System.out.print(C[t]+" ");
        }
        System.out.println();
    }
}
