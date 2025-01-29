package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[3];

        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        ProductOrder po1 = createOrder("두부", 2000, 2);
        ProductOrder po2 = createOrder("김치", 5000, 1);
        ProductOrder po3 = createOrder("콜라", 1500, 2);

        orders[0] = po1;
        orders[1] = po2;
        orders[2] = po3;

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(orders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액 : " + totalAmount);

    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder po = new ProductOrder();
        po.productName = productName;
        po.price = price;
        po.quantity = quantity;
        return po;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+" 가격: "+order.price+" 수량: "+order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price;
        }
        return sum;
    }
}
