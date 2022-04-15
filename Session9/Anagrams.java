package Session9;
import java.util.Arrays;
import java.util.HashMap;
public class Anagrams {
    public static void main(String[] args){
        int n=4;
        String str1="post";
        String str2="stop";
        System.out.println(sort(str1, str2, n));
        System.out.println(count(str1,str2,n));
        System.out.println(optimizedcount(str1,str2,n));
    }
    
    public static boolean brute(String str1,String str2,int n){
        char s1[]=str1.toCharArray();
        char s2[]=str2.toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s1[i]==s2[j]){

                }
            }
        }
        return false;
    }
    // nlogn+nlogn+n
    public static boolean sort(String str1,String str2,int n){
        char s1[]=str1.toCharArray();
        char s2[]=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        int p1=0,p2=0;
        while(p1<n && p2<n){
            if(s1[p1]!=s2[p2]){
                return false;
            }
            p1++;
            p2++;
        }
        return true;
    }
    //using count array
    //N+N+26,26;
    public static boolean count(String str1,String str2,int n){
        int cnt1[]=new int[26];
        int cnt2[]=new int[26];
        for(int i=0;i<n;i++){
            cnt1[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            cnt2[str2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(cnt1[i]!=cnt2[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean hashm(String str1,String str2,int n){
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put('a',3);
        }
        return true;
    }
    public static boolean optimizedcount(String str1,String str2,int n){
        int cnt[]=new int[26];
        for(int i=0;i<n;i++){
            cnt[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            cnt[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(cnt[i]!=0){
                return false;
            }
        }
        return true;
    }
}
