package Session9;
import java.util.HashMap;
public class frequencyofEachCharacter {
    public static void main(String[] args){
        String str="smartinterviews";
        int n=15;
        brute(str, n);
        usingmap(str, n);
        usingcountarray(str, n);
    }
    //n2,1
    public static void brute(String str,int n){
        for(int i=0;i<n;i++){
            int count=0;
            System.out.print(str.charAt(i)+" ");
            for(int j=0;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
        System.out.println();
    }
    //using map
    //n+n,min(n,26)
    public static void usingmap(String s,int n){
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(s.charAt(i))){
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
            }
            else{
                h.put(s.charAt(i),1);
            }
        }
        System.out.println(h);
    }
    //using count array
    //n+n,26
    public static void usingcountarray(String s,int n){
        int cnt[]=new int[26];
        for(int i=0;i<n;i++){
            cnt[s.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(cnt[i]!=0){
                char c=(char)(97+i);
                System.out.print(c+" "+cnt[i]+" ");
            }
        }
    }
}
