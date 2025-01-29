package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();

        System.out.println("BigData.count = "+bigData.count);
        System.out.println("BigData.data = "+bigData.data);
        System.out.println("BigData.data.value = "+bigData.data.value);
        // BigData.count = 0
        // BigData.data = null
        //  java.lang.NullPointerException

    }
}
