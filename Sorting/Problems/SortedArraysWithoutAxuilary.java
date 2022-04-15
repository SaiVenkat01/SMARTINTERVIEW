package Sorting.Problems;
//Given two arrays A and B ,both are sorted.A is
//size of M+N,where N is empty in it.B has size
//of N.we need to sort them.Merge elements of B into A in sorted order

public class SortedArraysWithoutAxuilary {
    public static void main(String[] args){
        int A[]={1,4,5,7,18,0,0,0,0};
        int B[]={2,3,6,19};
        int N=9;
        int M=4;
        f(A,N,B,M);
    }
    public static void f(int A[],int N,int B[],int M){
        int i=0,j=0;
        while(i<N && j<M){
            if(A[i]>B[j]){
                for (int k=N-1;k>=i;k--)
                    A[k]=A[k-1];
                A[i]=B[j];
                j++;
            } 
            else if(A[i]==0)
            {
                A[i]=B[j];
                j++;
            }
            i++;
        }
        for(int t=0;t<N;t++){
            System.out.print(A[t]+" ");
        }
        System.out.println();

    }
}
