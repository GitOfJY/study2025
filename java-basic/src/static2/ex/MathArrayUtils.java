package static2.ex;

public class MathArrayUtils {

    private static int sum = 0;
    private static int average = 0;

    public static int sum(int[] array){
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static int average(int[] array){
        for (int i : array) {
            average += i;
        }
        return average/array.length;
    }

    public static int min(int[] array){
        int min = array[0];

        for (int i : array) {
            if (i <= min) {
                min = i;
            }
        }
        return min;
    }

    public static int max(int[] array){
        int max = array[0];

        for (int i : array) {
            if (i >= max) {
                max = i;
            }
        }
        return max;
    }

}
