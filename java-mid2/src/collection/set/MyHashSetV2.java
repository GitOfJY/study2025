package collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashSetV2 {

    // 자바의 hashCode 사용해 타입과 관계 없이 해시코드 구현

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<Object>[] buckets;


    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;


    public MyHashSetV2(){
        initBuckets();
    }


    public MyHashSetV2(int capacity){
        this.capacity = capacity;
        initBuckets();
    }


    private void initBuckets(){
        buckets = new LinkedList[capacity];
        for (int i=0; i<capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }


    public boolean add(Object value){
        int hasIndex = hasIndex(value);
        LinkedList<Object> bucket = buckets[hasIndex];
        if (bucket.contains(value)){
            return false;
        }


        bucket.add(value);
        size++;
        return true;
    }


    public boolean contains(Object searchValue){
        int hasIndex = hasIndex(searchValue);
        LinkedList<Object> bucket = buckets[hasIndex];
        return bucket.contains(searchValue);
    }


    public boolean remove(Object value){
        int hasIndex = hasIndex(value);
        LinkedList<Object> bucket = buckets[hasIndex];
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }


    private int hasIndex(Object value){
        return Math.abs(value.hashCode()) % capacity;
    }


    public int getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

}
