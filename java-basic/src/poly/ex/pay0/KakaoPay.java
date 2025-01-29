package poly.ex.pay0;

public class KakaoPay implements PayService{

    @Override
    public boolean processPay(String payOption, int amount) {
        if (payOption == "kakao") {
            System.out.println("카카오페이 시스템과 연결합니다.");
            System.out.println(amount + "원 결제를 시도합니다.");
            return true;
        }
        return false;
    }

}
