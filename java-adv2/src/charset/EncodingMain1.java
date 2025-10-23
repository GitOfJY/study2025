package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class EncodingMain1 {
    private static final Charset EUC_KR = Charset.forName("EUC-KR");
    private static final Charset MS_949 = Charset.forName("MS949");

    public static void main(String[] args) {
        System.out.println("== ASCII 영문 처리 ==");
        encoding("A", StandardCharsets.US_ASCII);
        // A -> [US-ASCII] 인코딩 -> [65] 1byte

        encoding("A", StandardCharsets.ISO_8859_1);
        // A -> [ISO-8859-1] 인코딩 -> [65] 1byte

        encoding("A", EUC_KR);
        // A -> [EUC-KR] 인코딩 -> [65] 1byte

        encoding("A", StandardCharsets.UTF_16BE);
        // A -> [UTF-16BE] 인코딩 -> [0, 65] 2byte

        encoding("A", StandardCharsets.UTF_8);
        // A -> [UTF-8] 인코딩 -> [65] 1byte

        System.out.println("== 한글 지원==");
        encoding("가", EUC_KR);
        encoding("가", MS_949);
        encoding("가", StandardCharsets.UTF_8);

        /*
        * 가 -> [EUC-KR] 인코딩 -> [-80, -95] 2byte
        * 가 -> [x-windows-949] 인코딩 -> [-80, -95] 2byte
        * 가 -> [UTF-8] 인코딩 -> [-22, -80, -128] 3byte
        * */
    }

    private static void encoding(String text, Charset charset) {
        byte[] bytes = text.getBytes(charset);
        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte\n", text, charset, Arrays.toString(bytes), bytes.length);
    }
}
