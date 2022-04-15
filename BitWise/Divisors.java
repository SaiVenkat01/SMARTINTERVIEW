package BitWise;
import java.util.*;
public class Divisors {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int cnt=0;
        //General
        for(int i=1;i<=a;i++){
            if(a%i==0)
                cnt++;
        }
        System.out.println(cnt);
        //Still more optimizing it
        cnt=2;
        for(int i=2;i<=a/i;i++){
            if(a%i==0 && i!=a/i)
                cnt+=2;
            else if(a%i==0 && i==a/i)   //for perfect square
                cnt++;
        }
        
        System.out.println(cnt);

        sc.close();
    }
}
