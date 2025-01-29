package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {

        int size = 50_000;
        System.out.println("==MyArrayList 추가==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size); // 찾는데 O(1), 데이터 추가 O(n)
        MyArrayList<Integer> arrayList = new MyArrayList<>(); // 조회용 데이터로 사용
        addLast(arrayList, size); // 찾는데 O(1), 데이터 추가 O(1)

        System.out.println("==MyLinkedList 추가==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size); // 찾는데 O(n), 데이터 추가 O(1)
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(); // 조회용 데이터로 사용
        addLast(linkedList, size); // 찾는데 O(n), 데이터 추가 O(1)

        int loop = 10000;

        System.out.println("==MyArrayList 조회==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size/2);
        getIndex(arrayList, loop, size-1);

        System.out.println("==MyLinkedList 조회==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size/2);
        getIndex(linkedList, loop, size-1);

        System.out.println("==MyArrayList 검색==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size/2);
        search(arrayList, loop, size-1);

        System.out.println("==MyLinkedList 검색==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size/2);
        search(linkedList, loop, size-1);

       /*
       ==MyArrayList 추가==
       앞에 추가 - 크기: 50000, 계산 시간: 1924ms
       평균 추가 - 크기: 50000, 계산 시간: 812ms
       뒤에 추가 - 크기: 50000, 계산 시간: 5ms
       평균 추가 - 크기: 50000, 계산 시간: 5ms

       ==MyLinkedList 추가==
       앞에 추가 - 크기: 50000, 계산 시간: 3ms
       평균 추가 - 크기: 50000, 계산 시간: 1331ms
       뒤에 추가 - 크기: 50000, 계산 시간: 2292ms
       평균 추가 - 크기: 50000, 계산 시간: 2292ms

       ==MyArrayList 조회==
       index: 0, 반복: 10000, 계산 시간: 0ms
       index: 25000, 반복: 10000, 계산 시간: 1ms
       index: 49999, 반복: 10000, 계산 시간: 0ms

       ==MyLinkedList 조회==
       index: 0, 반복: 10000, 계산 시간: 0ms
       index: 25000, 반복: 10000, 계산 시간: 479ms
       index: 49999, 반복: 10000, 계산 시간: 893ms

       ==MyArrayList 검색==
       finalValue: 0, 반복: 10000, 계산 시간: 1ms
       finalValue: 25000, 반복: 10000, 계산 시간: 306ms
       finalValue: 49999, 반복: 10000, 계산 시간: 708ms

       ==MyLinkedList 검색==
       finalValue: 0, 반복: 10000, 계산 시간: 1ms
       finalValue: 25000, 반복: 10000, 계산 시간: 545ms
       finalValue: 49999, 반복: 10000, 계산 시간: 1025ms
       */

    }

    private static void addFirst(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime-startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            list.add(i/2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime-startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime-startTime) + "ms");
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime-startTime) + "ms");


    }

    private static void getIndex(MyList<Integer> list, int loop, int index){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<loop; i++){
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop+ ", 계산 시간: " + (endTime-startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int finalValue){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<loop; i++){
            list.indexOf(finalValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("finalValue: " + finalValue + ", 반복: " + loop+ ", 계산 시간: " + (endTime-startTime) + "ms");
    }

}
