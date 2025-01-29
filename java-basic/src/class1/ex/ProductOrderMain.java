package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        
        // 여러 상품의 주문 정보를 담는 배열 생성
        // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        // 상품 주문 정보와 최종 금액 출력

        // 상품명: 두부, 가격: 2000, 수량: 2
        // 상품명: 김치, 가격: 5000, 수량: 1
        // 상품명: 콜라, 가격: 1500, 수량: 2
        // 총 결제 금액: 12000

        ProductOrder po1 = new ProductOrder();
        po1.productName = "두부";
        po1.price = 2000;
        po1.quantity = 2;

        ProductOrder po2 = new ProductOrder();
        po2.productName = "김치";
        po2.price = 5000;
        po2.quantity = 1;

        ProductOrder po3 = new ProductOrder();
        po3.productName = "콜라";
        po3.price = 1500;
        po3.quantity = 2;

        ProductOrder[] orders = {po1, po2, po3};
        int totPrice = 0;

        for (ProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+", 가격: "+order.price+", 수량: "+order.quantity);
            totPrice += order.price*order.quantity;
        }

        System.out.println("총 결제 금액: "+totPrice);

    }
}
