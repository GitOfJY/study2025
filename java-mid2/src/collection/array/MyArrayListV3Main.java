package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {

        MyArrayListV3 numberList = new MyArrayListV3();

        // 숫자만 입력 하기 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자"); // 문자 입력 가능
        System.out.println(numberList);

        // Object 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        // java.lang.ClassCastException
        // 문자를 Integer로 캐스팅
        Integer num3 = (Integer) numberList.get(2);

    }
}
