package poly.ex.sender.answer;

public class SmsSenderAnswer implements SenderAnswer {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 발송합니다: " + message);
    }
}
