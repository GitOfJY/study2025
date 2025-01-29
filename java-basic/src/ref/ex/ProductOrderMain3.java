package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        // 주문 수량을 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요.");
        int n = sc.nextInt();

        ProductOrder[] orders = new ProductOrder[n];

        // 가격, 수량, 상품명을 입력 받기
        for (int i=0; i<n; i++){

            Scanner scanner = new Scanner(System.in);

            int orderNum = i+1;
            System.out.println(orderNum+"번째 주문 정보를 입력하세요.");

            System.out.print("주문의 상품명을 입력하세요.");
            String name = scanner.nextLine();
            System.out.print("주문의 가격을 입력하세요.");
            int price = scanner.nextInt();
            System.out.print("주문의 수량을 입력하세요.");
            int quantity = scanner.nextInt();

            orders[i] = createOrder(name, price, quantity);
        }
        
        // 입력이 끝나면 등록한 상품과 총 결제 금액을 출력
        printOrders(orders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액 : " + getTotalAmount(orders));

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
