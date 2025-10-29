package network.exception.close.normal;

import java.io.*;
import java.net.Socket;

import static util.MyLogger.log;

public class NormalCloseClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        InputStream in = socket.getInputStream();

        readByInputStream(in, socket);
        readByBufferedReader(in, socket);
        readByDataInputStream(in, socket);
    }

    private static void readByInputStream(InputStream in, Socket socket) throws IOException {
        int read = in.read();
        log("read : " + read);
        if (read == -1) {
            in.close();
            socket.close();
        }
    }

    private static void readByBufferedReader(InputStream in, Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String readString = reader.readLine();
        log("read : " + readString);
        if (readString == null) {
            reader.close();
            socket.close();
        }
    }

    private static void readByDataInputStream(InputStream in, Socket socket) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(in);
        try {
            dataInputStream.readUTF();
        } catch (EOFException e) {
            log(e);
        } finally {
            dataInputStream.close();
            socket.close();
        }
    }
}
