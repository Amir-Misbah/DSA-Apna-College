import java.util.ArrayList;
import java.util.LinkedList;

// public class HashMapImp {
//     static class HashMap<K, V> {
//         private class Node {
//             K key;
//             V value;
//             public Node(K key, V value) {
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int n; // number of elements
//         private int N; // number of buckets
//         private LinkedList<Node>[] buckets;

//         @SuppressWarnings("unchecked")
//         public HashMap() {
//             this.N = 4;
//             this.buckets = new LinkedList[N];
//             for (int i = 0; i < N; i++) {
//                 this.buckets[i] = new LinkedList<>();
//             }
//         }

//         public void put(K key, V value) {
//             int bi = hashFunction(key);
//             int di = searchInLL(key, bi);
//             if (di != -1) {
//                 Node node = buckets[bi].get(di);
//                 node.value = value;
//             } else {
//                 buckets[bi].add(new Node(key, value));
//                 n++;
//             }

//             double lambda = (double) n / N;
//             if (lambda > 2) {
//                 rehash();
//             }
//         }

//         private int hashFunction(K key) {
//             int hc = key.hashCode();
//             return Math.abs(hc) % N;
//         }

//         private int searchInLL(K key, int bi) {
//             LinkedList<Node> ll = buckets[bi];
//             int di = 0;
//             for (int i = 0; i < ll.size(); i++) {
//                 Node node = ll.get(i);
//                 if (node.key.equals(key)) { // Use equals for key comparison
//                     return di;
//                 }
//                 di++;
//             }
//             return -1;
//         }

//         @SuppressWarnings("unchecked")
//         private void rehash() {
//             LinkedList<Node>[] oldBuckets = buckets;
//             buckets = new LinkedList[N * 2];
//             N = N * 2;
//             for (int i = 0; i < N; i++) {
//                 buckets[i] = new LinkedList<>();
//             }
//             for (LinkedList<Node> bucket : oldBuckets) {
//                 for (Node node : bucket) {
//                     int bi = hashFunction(node.key);
//                     buckets[bi].add(node);
//                 }
//             }
//         }

//         public boolean containsKey(K key) {
//             int bi = hashFunction(key);
//             int di = searchInLL(key, bi);
//             return di != -1;
//         }

//         public V get(K key) {
//             int bi = hashFunction(key);
//             int di = searchInLL(key, bi);
//             if (di != -1) {
//                 Node node = buckets[bi].get(di);
//                 return node.value;
//             } else {
//                 return null;
//             }
//         }

//         public V remove(K key) {
//             int bi = hashFunction(key);
//             int di = searchInLL(key, bi);
//             if (di != -1) {
//                 Node node = buckets[bi].remove(di);
//                 n--;
//                 return node.value;
//             } else {
//                 return null;
//             }
//         }

//         public ArrayList<K> keySet() {
//             ArrayList<K> keys = new ArrayList<>();
//             for (LinkedList<Node> bucket : buckets) {
//                 for (Node node : bucket) {
//                     keys.add(node.key);
//                 }
//             }
//             return keys;
//         }

//         public boolean isEmpty() {
//             return n == 0;
//         }
//     }

//     public static void main(String[] args) {
//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("india", 150);
//         hm.put("china", 250);
//         hm.put("nepal", 350);
//         hm.put("usa", 450);

//         ArrayList<String> keys = hm.keySet();
//         for (String key : keys) {
//             System.out.println(key);
//         }
//     }
// }

public class HashMapImp{
    static class HashMap<K,V>{
        private class Node{
        K key;
        V value;
        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
       @SuppressWarnings("unchecked")
       public HashMap(){
        this.N = 4;
        this.buckets = new LinkedList[4];
        for(int i = 0 ; i < 4 ; i++){
            this.buckets[i] = new LinkedList<>();
        }
       }
       public void put (K key, V value){
        int bi = hashFunction(key);
        int di = SearchInLL(key,bi);
        if(di != -1){
            Node node = buckets[bi].get(di);
            node.value = value;
        }else{
            buckets[bi].add(new Node(key,value));
            n++;
        }
        double lamda = (double)n/N;
        if(lamda > 2 ){
            rehash();
        }
       }
       private int hashFunction(K key){
        int hc = key.hashCode();
        return Math.abs(hc) % N;
       }
       private int SearchInLL(K key,int bi){
        LinkedList<Node> ll = buckets[bi];
        int di = 0;
        for(int i = 0 ; i < ll.size() ; i++){
            Node node = ll.get(i);
            if(node.key.equals(key)){
                return di;
            }
            di++;
        }
        return -1;
       }
        @SuppressWarnings("unchecked")
       private void rehash(){
        LinkedList<Node> oldBucket[] = buckets ;
        buckets = new LinkedList[N*2];
        N = 2*N;
        for(int i = 0 ; i < buckets.length ; i++){
            buckets[i] = new LinkedList<>();
        }
        for(int i = 0 ; i < oldBucket.length ; i++){
            LinkedList<Node> ll = oldBucket[i];
            for(int j = 0 ; j < ll.size() ; j++){
                Node node = ll.remove();
                put(node.key, node.value);
            }
        }
       }
       public boolean containsKey(K key){
        int bi = hashFunction(key);
        int di = SearchInLL(key,bi);
        if(di != -1){
            return true;
        }
        else{
            return false;
        }
       }
       public V get(K key){
         int bi = hashFunction(key);
        int di = SearchInLL(key,bi);
        if(di != -1){
            Node node = buckets[bi].get(di);
            n--;
            return node.value;
        }else{
            return null;
        }
       }
       public V remove( K key){
        int bi = hashFunction(key);
        int di = SearchInLL(key,bi);
        if(di != -1){
            Node node = buckets[bi].remove(di);
            return node.value;
        }else{
            return null;
        }
       }
       public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();
        for(int i = 0 ; i < buckets.length ; i++){
            LinkedList<Node> ll = buckets[i];
            for(Node node : ll){
                keys.add(node.key);
            }
        }
        return keys;
       }
       public boolean isEmpty(){
        return n == 0 ;
       }
    }
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("india",150);
        hm.put("china",250);
        hm.put("nepal",350);
        hm.put("usa",450);
        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }
    }
}