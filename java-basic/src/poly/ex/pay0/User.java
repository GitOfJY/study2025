package poly.ex.pay0;

public class User {

    private PayService payService;

    public void setPayOption(PayService payService){
        this.payService = payService;
    }

    public void pay(String payOption, int amount){
        System.out.println("결제를 시작합니다: option="+payOption+" amount="+amount);
        boolean result = false;
        if (payOption == "kakao" || payOption == "naver") {
            result = payService.processPay(payOption, amount);
        }

        if (result == true) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제 수단이 없습니다.");
            System.out.println("결제가 실패했습니다.");
        }

    }

}
