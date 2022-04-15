package BitWise;
import java.util.*;
public class powerOf2{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long start1 = System.nanoTime();
        long x1=traditionalPow(a);
        long end1 = System.nanoTime();      
        System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));  
        System.out.println(x1);    
        long start2 = System.currentTimeMillis();
        long x2=usBit(a);
        long end2 = System.currentTimeMillis();      
        System.out.println("Elapsed Time in milli seconds: "+ (end2-start2));
        System.out.println(x2);
        sc.close();
    }
    public static long traditionalPow(int a){
        long x=1;
        for(int i=0;i<a;i++){
            x=x*2;
        }
        return x;
    }
    public static long usBit(int a){
        int x=1<<a;
        return x;
    }
}