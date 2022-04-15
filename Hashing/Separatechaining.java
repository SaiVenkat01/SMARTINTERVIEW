package Hashing;
//hari karthik
import java.util.ArrayList;
public class Separatechaining {
    public static void main(String[] args) {
        HashMap hm = new HashMap(10);
        hm.put(1, 1);
        hm.put(1, 2);
        hm.put(2, 1);
        hm.display();
    }
}
class HashMap {
    class Pair {
        int key, value;
 
        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
 
    int key, value;
    ArrayList<ArrayList<Pair>> a = new ArrayList<>();
    int n;
 
    HashMap(int n) {
        this.n = n;
        for (int i = 0; i < n; i++) {
            a.add(i, null);
        }
    }
 
    public void put(int key, int value) {
        int pos = key % n;
        Pair ob = new Pair(key, value);
        if (a.get(pos) == null) {
            ArrayList<Pair> temp = new ArrayList<>();
            temp.add(ob);
            a.add(pos, temp);
        } else a.get(pos).add(0, ob);
    }
 
    public Pair get(int key) {
        int pos = key % n;
        if (a.get(pos) == null) return null;
        else {
            ArrayList<Pair> temp = a.get(pos);
            for (Pair p : temp) {
                if (p.key == key)
                    return p;
            }
        }
        return null;
    }
 
    public void display() {
        for (int i = 0; i < n; i++) {
            if (a.get(i) != null) {
                System.out.println("Index " + i + " ");
                for (Pair p : a.get(i)) {
                    System.out.println(p.key + " " + p.value);
                }
            }
        }
    }
 
}