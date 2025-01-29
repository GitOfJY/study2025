package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {

        int size = 50_000;
        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size);
        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList, size);

        System.out.println("==LinkedList 추가==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);
        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size);

        int loop = 10000;

        System.out.println("==ArrayList 조회==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size/2);
        getIndex(arrayList, loop, size-1);

        System.out.println("==LinkedList 조회==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size/2);
        getIndex(linkedList, loop, size-1);

        System.out.println("==ArrayList 검색==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size/2);
        search(arrayList, loop, size-1);

        System.out.println("==LinkedList 검색==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size/2);
        search(linkedList, loop, size-1);

       /*
       ==ArrayList 추가==
       앞에 추가 - 크기: 50000, 계산 시간: 119ms
       평균 추가 - 크기: 50000, 계산 시간: 57ms
       뒤에 추가 - 크기: 50000, 계산 시간: 4ms
       평균 추가 - 크기: 50000, 계산 시간: 4ms

       ==LinkedList 추가==
       앞에 추가 - 크기: 50000, 계산 시간: 5ms
       평균 추가 - 크기: 50000, 계산 시간: 952ms
       뒤에 추가 - 크기: 50000, 계산 시간: 4ms
       평균 추가 - 크기: 50000, 계산 시간: 4ms

       ==ArrayList 조회==
       index: 0, 반복: 10000, 계산 시간: 0ms
       index: 25000, 반복: 10000, 계산 시간: 0ms
       index: 49999, 반복: 10000, 계산 시간: 1ms

       ==LinkedList 조회==
       index: 0, 반복: 10000, 계산 시간: 0ms
       index: 25000, 반복: 10000, 계산 시간: 329ms
       index: 49999, 반복: 10000, 계산 시간: 0ms

       ==ArrayList 검색==
       finalValue: 0, 반복: 10000, 계산 시간: 1ms
       finalValue: 25000, 반복: 10000, 계산 시간: 115ms
       finalValue: 49999, 반복: 10000, 계산 시간: 220ms

       ==LinkedList 검색==
       finalValue: 0, 반복: 10000, 계산 시간: 0ms
       finalValue: 25000, 반복: 10000, 계산 시간: 401ms
       finalValue: 49999, 반복: 10000, 계산 시간: 890ms
       */

    }

    private static void addFirst(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime-startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            list.add(i/2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime-startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime-startTime) + "ms");
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime-startTime) + "ms");


    }

    private static void getIndex(List<Integer> list, int loop, int index){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<loop; i++){
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop+ ", 계산 시간: " + (endTime-startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int finalValue){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<loop; i++){
            list.indexOf(finalValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("finalValue: " + finalValue + ", 반복: " + loop+ ", 계산 시간: " + (endTime-startTime) + "ms");
    }

}
