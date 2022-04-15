package session10;
import java.util.Arrays;
import java.util.HashSet;
//maximum length m list of n strings.We are asked to
//count the number of anagram groups
//answer=3,three groups  we are able to find
public class GroupingAnagrams
{
    public static void main(String[] args){
        int n=10;
        String []s={"axyyax","yaxxay","ayxay","ayyax","xayax","xaxyya","axyayx","yaxxa","xayxa","ayaxx"};
        int x=grouping(s, n);
        System.out.println(x);
        int x2=countarray(s, n);
        System.out.println(x2);
        int x3=usingset(s, n);
        System.out.println(x3);
    }
    //by sorting each string and comparing
    //n(mlogm)+m(nlogn),nm+nm
    public static int grouping(String[] s,int n){
        int cnt=1;
        for(int i=0;i<n;i++){
            char []c=s[i].toCharArray();
            Arrays.sort(c);
            String st=new String(c);
            s[i]=st;
        }
        Arrays.sort(s);
        for(int i=0;i<n-1;i++){
            if(!s[i].equals(s[i+1])){
                cnt++;
            }
        }
        return cnt;
    }
    public static int countarray(String[] s,int n){
        int cnt=0;
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(compare(s[i],s[i].length(),s[j],s[j].length())){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                cnt++;
            }
        }
        return cnt;
    }
    public static boolean compare(String s1,int n1,String s2,int n2){
        if(n1!=n2){
            return false;
        }
        int cnt[]=new int[26];
        for(int i=0;i<n1;i++){
            cnt[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<n2;i++){
            cnt[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(cnt[i]!=0){
                return false;
            }
        }
        return true;
    }
    //n(mlogm)+nm,nm
    public static int usingset(String[] s,int n){
        int cnt=0;
        HashSet<String> set=new HashSet<>();
         for(int i=0;i<n;i++){
             String str=new String(s[i]);
             char[] c=str.toCharArray();
             Arrays.sort(c);
             str=new String(c);
             set.add(str);
         }
         cnt=set.size();
        return cnt;
    }
}
