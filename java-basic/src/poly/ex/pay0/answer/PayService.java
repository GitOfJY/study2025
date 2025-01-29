package poly.ex.pay0.answer;

public class PayService {

    public void processPay(String option, int amount){

        boolean result = false;
        System.out.println("결제를 시작합니다. option="+option+", amount="+amount);

        // 결제 수단 선택
        // 새로운 결제 수단이 추가되어도 변경될 코드가 없다.
        Pay pay = PayStore.findPay(option);
        result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }

    }

}
