package Searching.Problems;

public class squareroot {
    public static void main(String  []args){
        // n is always a perfect square
        int n=25;
        int x=sqrt(n);
        System.out.println(x);
        int x1=sqrt2(n);
        System.out.println(x1);
    }
    //sqrt(n),1
    public static int sqrt(int n){
        for(int i=0;i<=n;i++){
            if(i*i==n)
                return i;
        }
        return 0;
    }
    //logn,1
    public static int sqrt2(int n){
        int l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(mid*mid==n) return mid;
            else if(mid*mid<n)  l=mid+1;
            else    h=mid-1;
        }
        return 0;
    }
}
