package BitWise;
import java.util.*;
public class TwoNumRepeatTwice {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // 1<=arr[i]<=n-2
        //Every Element appears once Except 2 elements.Which appears twice
        int ans=0;
        for(int i=0;i<n;i++){
            ans^=arr[i];
        }
        for(int i=1;i<n-1;i++){
            ans^=i;
        }
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(((arr[i]>>i)&1)==1)
                a^=arr[i];
            else    
                b^=arr[i];
        }
        for(int i=0;i<n;i++){
        
        }
        System.out.println(ans+" "+a+" "+b);
        sc.close();
    }
}
