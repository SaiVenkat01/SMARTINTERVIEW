package Recursion;
import java.io.*;
public class TowerOfHanoi {
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        TOH(n,'A','C','B');
    }
    public static void TOH(int n,char src,char det,char temp){
        if(n==0) 
            return;
        TOH(n-1,src,temp,det);
        System.out.println(n+" "+src+"->"+det);
        TOH(n-1,temp,det,src);
        
    }


}
