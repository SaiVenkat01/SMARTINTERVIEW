package Session9;
//toggle the case of each character
public class togglecaseofEachCharacter {
    public static void main(String[] args){
        int n=8;
        String str="bRoWNfOx";
        normal(str, n);
        xor(str, n);
    }
    public static void normal(String str,int n){
        StringBuffer s=new StringBuffer();
        for(int i=0;i<n;i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                s.append((char)(str.charAt(i)-32));
            }
            else{
                s.append((char)(str.charAt(i)+32));
            }
        }
        System.out.println(s);
    }
    public static void xor(String str,int n){
        StringBuffer s=new StringBuffer();
        for(int i=0;i<n;i++){
            s.append((char)(str.charAt(i)^32));
        }
        System.out.println(s);
    }
}
