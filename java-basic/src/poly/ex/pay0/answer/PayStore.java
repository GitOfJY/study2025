package poly.ex.pay0.answer;

public abstract class PayStore {
    
    // 결제 수단 선택
    // 결제 수단 추가 시 변하는 부분
    public static Pay findPay(String option){
        if (option.equals("kakao")){
            return new KakaoPay();
        } else if (option.equals("naver")){
            return new NaverPay();
        } else {
            // System.out.println("결제 수단이 없습니다.");
            // return null;
            return new DefaultPay();
        }
    }

}
