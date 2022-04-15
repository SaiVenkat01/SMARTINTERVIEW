package Searching.Problems;
//given 2 sorted arrays A & B.find the median.
//easy variant->N+M is odd and no duplicates
public class easyFindMedian {
    public static void main(String []args){
        int n=6;
        int a[]={-4,-2,5,15,21,27};
        int m=5;
        int b[]={-5,1,13,17,22};
        int x=twop(a,n,b,m);
        System.out.println(x);
    }
    //brute force
    //n+m+(n+m)log(N+M),n+m
    //using two pointer technique
    public static int twop(int a[],int n,int b[],int m){
        int c[]=new int[n+m];
        int p1=0,p2=0,k=0;
        while(p1<n && p2<m){
            if(a[p1]>b[p2]){
                c[k++]=b[p2++];
            }
            else{
                c[k++]=a[p1++];
            }
        }
        while(p1!=n){
            c[k++]=a[p1++];
        }
        while(p2!=m){
            c[k++]=b[p2++];
        }
        int mid=(n+m)/2;
        return c[mid];
    }
    //p1,p2 should move (m+n)/2 places
    public static int move(int a[],int n,int b[],int m){
        int p1=0,p2=0;
        while(p1<n && p2<m){
            if((p1+p2)==(n+m)/2){
                
            }
        }
        return 0;
    }
}
