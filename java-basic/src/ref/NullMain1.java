package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = "+data);
        // 1. data = null

        data = new Data();
        System.out.println("2. data = "+data);
        // 2. data = ref.Data@1d81eb93

        data = null;
        System.out.println("3. data = "+data);
        // 3. data = null

    }
}
