package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<Integer>[] buckets;


    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;


    public MyHashSetV1(){
        initBuckets();
    }


    public MyHashSetV1(int capacity){
        this.capacity = capacity;
        initBuckets();
    }


    private void initBuckets(){
        buckets = new LinkedList[capacity];
        for (int i=0; i<capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }


    public boolean add(int value){
        int hasIndex = hasIndex(value);
        LinkedList<Integer> bucket = buckets[hasIndex];
        if (bucket.contains(value)){
            return false;
        }


        bucket.add(value);
        size++;
        return true;
    }


    public boolean contains(int searchValue){
        int hasIndex = hasIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hasIndex];
        return bucket.contains(searchValue);
    }


    public boolean remove(int value){
        int hasIndex = hasIndex(value);
        LinkedList<Integer> bucket = buckets[hasIndex];
        boolean result = bucket.remove(Integer.valueOf(value));
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }


    private int hasIndex(int value){
        return value % capacity;
    }


    public int getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

}
