package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {

        // 1, 2, 5, 8, 14, 99
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        System.out.println("buckets = " + Arrays.toString(buckets));
        // buckets = [null, null, null, null, null, null, null, null, null, null]

        for (int i=0; i<CAPACITY; i++){
            buckets[i] = new LinkedList<>();
        }
        System.out.println("buckets = " + Arrays.toString(buckets));
        // buckets = [[], [], [], [], [], [], [], [], [], []]
        // 배열 안에 연결 리스트가 있고 연결 리스트 안에 데이터가 들어가 있는 구조

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 중복
        System.out.println("buckets = " + Arrays.toString(buckets));
        // buckets = [[], [1], [2], [], [14], [5], [], [], [8], [99, 9]]

        // 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains("+searchValue+") = " + contains);
        // buckets.contains(9) = true

    }

    private static void add(LinkedList<Integer>[] buckets, int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (!bucket.contains(value)){ // O(n)
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue){
        int hasIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hasIndex]; // O(1)
        return bucket.contains(searchValue); // O(n)
    }

    static int hashIndex(int value){
        return value%CAPACITY;
    }

}
