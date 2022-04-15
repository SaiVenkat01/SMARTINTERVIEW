package Recursion;
import java.io.*;
public class power {
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        long a1=pow1(a,b);
        long a2=pow2(a,b);
        long a3=pow3(a,b);
        long a4=pow4(a,b);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(a1+" "+a2+" "+a3+" "+a4+"\n");
        bw.flush();
    }
    public static long pow1(int a,int b){
        if(b==0) return 1;
        return a*pow1(a,b-1);
    }
    public static long pow2(int a,int b){
        if(b==0) return 1;
        if((b&1)==1) return pow2(a,b/2)*pow2(a,b/2)*a;
        return pow2(a,b/2)*pow2(a,b/2);
    }
    public static long pow3(int a,int b){
        if(b==0) return 1;
        long p=pow3(a,b/2);
        if((b&1)==1) return p*p*a;
        return p*p;
    }
    public static long pow4(int a,int b){
        if(b==0) return 1;
        long p=pow4(a*a,b/2);
        if((b&1)==1) return p*a;
        return p;
    }
    
}
