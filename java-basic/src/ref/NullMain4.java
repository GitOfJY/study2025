package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();

        System.out.println("BigData.count = "+bigData.count);
        System.out.println("BigData.data = "+bigData.data);
        System.out.println("BigData.data.value = "+bigData.data.value);
        // BigData.count = 0
        // BigData.data = ref.Data@312b1dae
        // BigData.data.value = 0

    }
}
