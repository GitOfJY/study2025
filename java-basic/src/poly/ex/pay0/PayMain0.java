package poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {

        User user = new User();

        // kakao 결제
        KakaoPay kakaoPay = new KakaoPay();
        user.setPayOption(kakaoPay);
        String payOtion1 = "kakao";
        int amount1 = 5000;
        user.pay(payOtion1, amount1);

        // naver 결제
        NaverPay naverPay = new NaverPay();
        user.setPayOption(naverPay);
        String payOtion2 = "naver";
        int amount2 = 10000;
        user.pay(payOtion2, amount2);

        // 잘못된 결제 수단 선택
        user.setPayOption(null);
        String payOption3 = "bad";
        int amount3 = 15000;
        user.pay(payOption3, amount3);

    }
}
