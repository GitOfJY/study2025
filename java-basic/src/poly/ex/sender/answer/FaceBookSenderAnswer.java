package poly.ex.sender.answer;

public class FaceBookSenderAnswer implements SenderAnswer {
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북에 발송합니다: " + message);
    }
}
