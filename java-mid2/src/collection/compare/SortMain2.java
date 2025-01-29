package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {

        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));

        System.out.println("Comparator 비교");
        Arrays.sort(array, new AscComparator());
        System.out.println("AscComparator : " + Arrays.toString(array));
        /*
          Comparator 비교
          o1 = 2, o2 = 3
          o1 = 1, o2 = 2
          AscComparator : [1, 2, 3]
        */

        Arrays.sort(array, new DescComparator());
        System.out.println("DescComparator : " + Arrays.toString(array));
        /*
          o1 = 2, o2 = 1
          o1 = 3, o2 = 2
          DescComparator : [3, 2, 1]
        */

        Arrays.sort(array, new AscComparator().reversed());
        System.out.println("AscComparator().reversed() : " + Arrays.toString(array));
        // AscComparator().reversed() : [3, 2, 1]
        // DescComparator와 같다

    }

    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + ", o2 = " + o2);
            return (o1 < o2) ? -1 : ((o1==o2) ? 0 : 1);
        }
    }

    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + ", o2 = " + o2);
            return (o1 < o2) ? -1 : ((o1==o2) ? 0 : 1) * -1;
        }
    }

}
