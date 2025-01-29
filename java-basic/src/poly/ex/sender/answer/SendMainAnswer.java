package poly.ex.sender.answer;

public class SendMainAnswer {
    public static void main(String[] args) {

        SenderAnswer[] senders = {new EmailSenderAnswer(), new SmsSenderAnswer(), new FaceBookSenderAnswer()};

        for (SenderAnswer sender : senders) {
            sender.sendMessage("환영합니다.");
        }

    }
}
