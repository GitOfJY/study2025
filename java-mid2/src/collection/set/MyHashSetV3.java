package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<E>[] buckets;


    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

  public MyHashSetV3(){
        initBuckets();
    }

  public MyHashSetV3(int capacity){
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets(){
        buckets = new LinkedList[capacity];
        for (int i=0; i<capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value){
        int hasIndex = hasIndex(value);
        LinkedList<E> bucket = buckets[hasIndex];
        if (bucket.contains(value)){
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(E searchValue){
        int hasIndex = hasIndex(searchValue);
        LinkedList<E> bucket = buckets[hasIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(E value){
        int hasIndex = hasIndex(value);
        LinkedList<E> bucket = buckets[hasIndex];
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
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

}
