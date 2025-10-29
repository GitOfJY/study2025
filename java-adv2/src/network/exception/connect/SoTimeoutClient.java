package network.exception.connect;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SoTimeoutClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        InputStream in = socket.getInputStream();

        try {
            socket.setSoTimeout(1000); // 타임아웃시간설정
            int read = in.read();
            System.out.println("read: " + read);
        } catch (IOException e) {
            e.printStackTrace();
        }
        socket.close();
    }
}
