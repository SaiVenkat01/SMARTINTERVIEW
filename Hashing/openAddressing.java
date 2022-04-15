package Hashing;
//anirudh
//linear probing
//quadratic probing
//double hashing
//rehashing
/*
class openAddressing {
    public static void main(String []args){
        HashMap<Integer,Integer> hash=new HashMap<>();
        hash.put(1,2);
        hash.put(2,3);
        hash.put(1,3);
        hash.put(5,4);
        hash.display();
    }
}
class Element<K extends Comparable<K>, V>{
    K key;
    V value;
    Element(K key, V value){
        this.key=key;
        this.value=value;
    }
    public K getKey(){
        return this.key;
    }
    public V getValue(){
        return this.value;
    }
}
 
class HashMap<K extends Comparable<K>, V> {
   int capacity;
    int size;
    Element<K,V>[] table;
    HashMap(){
        this.table=new Element[10];
        this.size=0;
        this.capacity=10;
    }
    HashMap(int N){
        this.table=new Element[N];
        this.size=0;
        this.capacity=N;
    }
    public int hash(K key, int i){
        String s=key.toString();
        long sum=0;
        for(int x=0;x<s.length();x++) sum+=((int)s.charAt(x))*Math.pow(13,i+1);
        return (int)(sum%capacity);
    }
    public int quadratic(K key,int i){
        String s=key.toString();
        long sum=0;
        for(int x=0;x<s.length();x++)
            sum+=((int)s.charAt(x))*((int)s.charAt(x))*Math.pow(13,i+1);
        return (int)(sum%capacity);
    }
    public int doublehash(K key,int i){
        String s=key.toString();
        long sum=0;
        for(int x=0;x<s.length();x++)
            sum+=(((int)s.charAt(x))*Math.pow(7,i+1))+(((int)s.charAt(x))*Math.pow(13,i+1));
        return (int)(sum%capacity);
    }
    public boolean containsKey(K key){
        int temp=this.size, i=0;
        while(temp>0){
            int index=hash(key,i++);
            if(table[index]!=null){
                if(table[index].getKey().compareTo(key)==0) return true;
                temp--;
            }
        }
        return false;
    }
    public void put(K key, V value){
        int i=0, index=0;
        if(containsKey(key)){
            do{
                index=quadratic(key,i++);
                if(table[index]==null) continue;
                if(table[index].getKey().compareTo(key)==0) break;
            }while(true);
        }
        else{
            size++;
            do{
                index=hash(key,i++);
            }while(table[index]!=null);
        }
        
        table[index]=new Element<K,V>(key, value);
        
 
        if(  loadFactor() >= 0.75) rehash(true);
    }
    
    public V get(K key){
        int i=0, index=0;
        do{
            index=hash(key,i++);
        }while(table[index].getKey().compareTo(key)!=0);
        
        return table[index].getValue();
    }
 
    public double loadFactor(){
        return (double)size/(double)capacity;
    }
    public int size(){
        return this.size;
    }
    public void rehash(boolean flag){
        Element<K,V> newTable[];
        if(flag){
            this.capacity=2*capacity;
            newTable=new Element[capacity];
        }
        else{
            this.capacity=capacity/2;
            if(capacity<10) this.capacity=10;
            newTable=new Element[capacity];
        }    
        int index=0, k=0;
        for(int i=0;i<table.length;i++){
            if(table[i]==null) continue;
            k=0;
            do{
                index=hash(table[i].getKey(), k++);
            }while(newTable[index]!=null);
            newTable[index]=table[i];
        }
        this.table=newTable;
    }
 
    public V remove(K key){
        if(!containsKey(key)) return null;
        int i=0, index=0;
        do{
            index=hash(key,i++);
            if(table[index]==null) continue;
            if(table[index].getKey().compareTo(key)==0) break;
        }while(true);
        V del=table[index].getValue();
        table[index]=null;
        size--;
 
        if(loadFactor()<0.25) rehash(false);
 
        return del;
    }
    
    public void display(){
        System.out.println("\nHash Table:\nKey --> Value");
        for(Element<K,V> ele : table){
           if(ele!=null) System.out.println(ele.getKey()+" --> "+ele.getValue());
        }
        System.out.println();
    }
}

*/