package Session9;
import java.util.Arrays;
//import java.util.HashMap;
public class CountUniqueElementsInGivenWindow {
    public static int countWindowDistinct(int win[], int k){
        int count=0;
        for (int i=0;i<k;i++) {
            int j;
            for (j=0;j<i;j++)
                if(win[i]==win[j])
                    break;
            if(j==i)
                count++;
        }
        return count;
    }
    //(n-k+1)*k^2,1
    public static void brute(int arr[], int n, int k){
        for (int i=0;i<=n-k;i++){
            System.out.print(countWindowDistinct(Arrays.copyOfRange(arr, i, arr.length),k)+" ");
        }
    }
    public static int[] usingmap(int arr[],int n,int k){
        //HashMap<Integer,Integer> hm=new HashMap<>();

        return arr;
    }
    public static void main(String[] args){
        int n=12;
        int arr[]={4,5,5,4,6,6,6,6,7,12,20,7};
        int k=5;
        brute(arr, n, k);
    }
}
