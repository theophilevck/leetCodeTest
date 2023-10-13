package arrays;

import java.util.ArrayList;
import java.util.List;

public class DesignHashMap {

    //706. Design HashMap
    //Easy
    //Design a HashMap without using any built-in hash table libraries.
    //
    //Implement the MyHashMap class:
    //
    //    MyHashMap() initializes the object with an empty map.
    //    void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
    //    int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
    //    void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.

    //Related Topics
    //Array
    //Hash Table
    //Linked List
    //Design
    //Hash Function

    class MyHashMap {

        private static final int SIZE = 1000;
        private List<int[]>[] map;

        public MyHashMap() {
            map = new ArrayList[SIZE];
            for (int i = 0; i < SIZE; i++) {
                map[i] = new ArrayList<>();
            }
        }

        public void put(int key, int value) {
            int index = key % SIZE;
            List<int[]> bucket = map[index];
            for (int[] pair : bucket) {
                if (pair[0] == key) {
                    pair[1] = value;
                    return;
                }
            }
            bucket.add(new int[]{key, value});
        }

        public int get(int key) {
            int index = key % SIZE;
            List<int[]> bucket = map[index];
            for (int[] pair : bucket) {
                if (pair[0] == key) {
                    return pair[1];
                }
            }
            return -1;
        }

        public void remove(int key) {
            int index = key % SIZE;
            List<int[]> bucket = map[index];
            for (int i = 0; i < bucket.size(); i++) {
                int[] pair = bucket.get(i);
                if (pair[0] == key) {
                    bucket.remove(i);
                    return;
                }
            }
        }

        /*
         * Your MyHashMap object will be instantiated and called as such:
         * MyHashMap obj = new MyHashMap();
         * obj.put(key,value);
         * int param_2 = obj.get(key);
         * obj.remove(key);
         */

    }
}
