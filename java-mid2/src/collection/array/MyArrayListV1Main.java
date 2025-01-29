package collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {

        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("== 데이터 추가 ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("== 기능 사용 ==");
        System.out.println("list.size() = " + list.size());
        System.out.println("List.get(1) = " + list.get(1));
        System.out.println("list.indexof('c') = " + list.indexOf("c"));
        System.out.println("list.set(2, 'z'), oldValue = " + list.set(2, "z"));

        System.out.println("== 범위 초과 ==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        // 범위 초과, capacity가 늘어나지 않으면 예외 발생
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        list.add("f");
        System.out.println(list);

    }
}
