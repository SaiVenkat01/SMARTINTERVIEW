package Recursion;
public class MagicSquare {
    public static void main(String [] args){
        int sq[]=new int[10];
        boolean visited[]=new boolean[10];
        f(sq, visited, 0);
        
    }
    //incomplete and wrong code
    public static void f(int sq[],boolean visited [],int idx){
        if(idx==10){
            for(int i=1;i<=10;i++){
                System.out.print(sq[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=1;i<=10;i++){
            if(!visited[i]){
                sq[idx]=i;
                visited[i]=true;
                f(sq, visited, idx+1);
                visited[i]=false;
            }
        }
    }
}
