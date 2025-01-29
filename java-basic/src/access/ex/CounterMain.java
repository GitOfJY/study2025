package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCount counter = new MaxCount();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}
