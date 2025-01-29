package poly.ex.sender.answer;

public class EmailSenderAnswer implements SenderAnswer{
    @Override
    public void sendMessage(String message) {
        System.out.println("이메일을 발송합니다: " + message);
    }
}
