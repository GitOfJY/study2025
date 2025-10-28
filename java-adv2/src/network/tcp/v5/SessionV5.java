package network.tcp.v5;

import network.tcp.SocketCloseUtil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static util.MyLogger.log;

public class SessionV5 implements Runnable {
    private final Socket socket;

    public SessionV5(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (socket;
             DataInputStream in = new DataInputStream(socket.getInputStream());
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());) {
            while (true) {
                // 클라이언트로부터 문자 받기
                String received = in.readUTF();
                log("client -> server : " + received);

                if (received.equals("exit")) {
                    break;
                }

                // 클라이언트에게 문자 보내기
                String toSend = received + "World";
                out.writeUTF(toSend);
                log("client <- server : " + toSend);
            }
        } catch (IOException e) {
            log(e);
        }

        log("연결 종료 : " + socket + " is closed " + socket.isClosed());
    }
}
