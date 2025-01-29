package enumeration.ex3;

public class ClassGradeEx3_2 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();
        // 문제 발생, Enum types cannot be instantiated
        // Grade grade = new Grade();
        // int result = discountService.discount(grade, price);

    }
}
