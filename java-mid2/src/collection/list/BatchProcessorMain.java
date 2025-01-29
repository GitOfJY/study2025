package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {

        // MyArrayList<Integer> list = new MyArrayList<>();
        // 크기: 50000, 계산시간: 1898ms

        MyLinkedList<Integer> list = new MyLinkedList<>();
        // 크기: 50000, 계산시간: 4ms

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);

    }

}
