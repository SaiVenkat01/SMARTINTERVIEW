package Recursion;
//Give a list of String L and a String S,check if
//the string s can be acculimate such a way that every
//partition is present in the list L.
//l=[s,ya,ax,rtin,sma,smart,ter,v,view]
//s1=smartinterviews
//s2=ssmass
public class arrangeOfsubStrTomakeValidString {
    public static void main(String [] args){
        String st[]={"s","ya","ax","rtin","sma","smart","ter","v","view"};
        String s1="smartinterviews";
        String s2="ssmass";
        System.out.println(f(st,s1,0));
        System.out.println(f(st,s2,0));

    }
    public static boolean f(String[] st,String s,int leng){
        if(leng==s.length()) return true;
        for(int end=leng;end<s.length();end++){
            for(int i=0;i<st.length;i++){
                if((st[i].equals(s.substring(leng,end+1))) &&(f(st, s, end+1))){
                    return true;
                }
            }
        }
        return false;
    }



}
