import java.util.Scanner;

public class codechef {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        System.out.println(pow(t));
        sc.close();
    }
    public static boolean pow(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            double y=(Math.log10(n)/Math.log10(i));
            int t=(int)y;
            double gg=y-t;
            if(gg==0){
                return true;
            }
        }
        return false;
    }
}