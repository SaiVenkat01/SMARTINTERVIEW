package session10;
//find the longest palindromic substring length
//ans=19
public class longestlengthPalindrome {
    public static void main(String[] args){
        String s="axxayyyaxxbxxayyyaxxbxyxbx";
        int n=26;
        int x=brute(s, n);
        System.out.println(x);
        int x2=twop(s, n);
        System.out.println(x2);
    }
    //n2*n,1
    //creating palindrome and checking them
    public static int brute(String s,int n){
        int len=0;
        String palindrome="";
        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s.substring(i,j+1))){
                    if((j-i+1)>len){
                        len = j-i+1;
                        palindrome=s.substring(i,j+1);
                    }
                }
            }
        }
        System.out.println(palindrome);
        return len;
    }
    public static boolean isPalindrome(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    //using two pointer technique
    //start from the center,it is advantages beacuse,we can expand
    //it as long as we are getting palindrome
    //n2,1
    public static int twop(String s,int n){
        int p1=0,p2=0;
        int ans=0;
        String palindrome="";
        for(int i=0;i<n;i++){
            p1=i;
            p2=i;
            while(p1>=0 && p2<n && (s.charAt(p1)==s.charAt(p2)) ){
                //ans=Math.max(ans,p2-p1+1);
                if(p2-p1+1>ans){
                    ans = p2-p1+1;
                    palindrome=s.substring(p1,p2+1);
                }
                p1--;
                p2++;
            }
            
            //ans=Math.max(ans,p2-p1-1);
            p1=i;
            p2=i+1;
            while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2) ){
                //ans=Math.max(ans,p2-p1+1);
                if(p2-p1+1>ans){
                    ans = p2-p1+1;
                    palindrome=s.substring(p1,p2+1);
                }
                p1--;
                p2++;
            }
            //ans=Math.max(ans,p2-p1-1);
        }
        System.out.println(palindrome);
        return ans;
    }
    
}
