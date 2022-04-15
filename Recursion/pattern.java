package Recursion;
import java.util.*;
public class pattern {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String st[]=new String[n];
        par(n, st, 0, 0, 0);
        sc.close();
    }
    //Print all possible valid parathesis of length n in lexicographical order
    public static void par(int n,String st[],int oc,int cc,int idx){
        if(oc<n/2){
            st[idx]="(";
            par(n, st, oc+1, cc, idx+1);
        }
        if(cc<oc){
            st[idx]=")";
            par(n,st,oc,cc+1,idx+1);
        }
        if(idx==n){
            for(int i=0;i<n;i++){
                System.out.print(st[i]);
            }
            System.out.println();
        }
            
    }
                            /*
                            6
                            ((()))
                            (()())
                            (())()
                            ()(())
                            ()()()
                            */
}
