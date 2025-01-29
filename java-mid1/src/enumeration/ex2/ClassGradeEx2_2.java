package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();
        // 문제 발생 > private으로 기본 생성자 막기
        // ClassGrade classGrade = new ClassGrade();
        // int result = discountService.discount(classGrade, price);

        // System.out.println("NewClassGrade 등급의 할인 금액 : " + result);
        // 할인 x
        // NewClassGrade 등급의 할인 금액 : 0

    }
}
