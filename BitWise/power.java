package BitWise;
import java.util.*;
public class power {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x1=1;
        int m=1000007;
        for(int i=0;i<b;i++){
            x1*=a%m;
        }
        System.out.println(x1);
        long ans=1,x2=a;
        for(int i=0;(1<<i)<=b;i++){
            if(((b>>i)%2)==1){
                ans=(ans*x2)%m;
            }
            x2=(x2*x2)%m;
        }
        System.out.println(ans);
        sc.close();
    }
}
