package poly.ex.pay0;

public class NaverPay implements PayService{

    @Override
    public boolean processPay(String payOption, int amount) {
        if (payOption == "naver") {
            System.out.println("네이버페이 시스템과 연결합니다.");
            System.out.println(amount + "원 결제를 시도합니다.");
            return true;
        }
        return false;
    }
    
}
