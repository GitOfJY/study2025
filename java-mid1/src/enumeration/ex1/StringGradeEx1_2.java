package enumeration.ex1;


public class StringGradeEx1_2 {
    public static void main(String[] args) {

        int price = 10000;
        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급 입력
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액 : " + vip);

        // 오타
        int diamond = discountService.discount("diamond", price);
        System.out.println("DIAMOND 등급의 할인 금액 : " + vip);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 : " + gold);

        // 타입 안정성 부족, 데이터 일관성 부족

    }
}
