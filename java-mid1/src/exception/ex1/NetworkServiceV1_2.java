package exception.ex1;
public class NetworkServiceV1_2 {

    public void sendMessage(String data) {

        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        
        // 결과가 성공이 아니다 > 오류다
        // ctrl + art + shift + t > method 검색
        // method로 헷갈리지 않게 빼버리기
        if (isError(connectResult)){
            System.out.println("[네트워크 오류발생] 오류 코드 : " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)){
            System.out.println("[네트워크 오류발생] 오류 코드 : " + sendResult);
            return;
        }

        client.disconnect();

    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }

}
