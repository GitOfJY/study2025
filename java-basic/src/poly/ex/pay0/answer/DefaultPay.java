package poly.ex.pay0.answer;

public class DefaultPay implements Pay{

    // null 일 경우 처리, nullObject
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }

}
