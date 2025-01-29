package access.ex;

public class CounterMainAnswer {
    public static void main(String[] args) {
        MaxCountAnswer counter = new MaxCountAnswer(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}
