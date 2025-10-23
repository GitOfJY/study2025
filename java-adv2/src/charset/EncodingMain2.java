package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class EncodingMain2 {
    private static final Charset EUC_KR = Charset.forName("EUC-KR");
    private static final Charset MS_949 = Charset.forName("MS949");

    public static void main(String[] args) {
        System.out.println("==영문 ASCII 인코딩==");
        test("A", StandardCharsets.US_ASCII, StandardCharsets.US_ASCII);
        test("A", StandardCharsets.US_ASCII, StandardCharsets.ISO_8859_1);
        test("A", StandardCharsets.US_ASCII, EUC_KR);
        test("A", StandardCharsets.US_ASCII, MS_949);
        test("A", StandardCharsets.US_ASCII, StandardCharsets.UTF_8);
        test("A", StandardCharsets.US_ASCII, StandardCharsets.UTF_16BE);
        /*
        * A -> [US-ASCII] 인코딩 -> [65] 1byte -> [US-ASCII] 디코딩 -> A
        * A -> [US-ASCII] 인코딩 -> [65] 1byte -> [ISO-8859-1] 디코딩 -> A
        * A -> [US-ASCII] 인코딩 -> [65] 1byte -> [EUC-KR] 디코딩 -> A
        * A -> [US-ASCII] 인코딩 -> [65] 1byte -> [x-windows-949] 디코딩 -> A
        * A -> [US-ASCII] 인코딩 -> [65] 1byte -> [UTF-8] 디코딩 -> A
        * A -> [US-ASCII] 인코딩 -> [65] 1byte -> [UTF-16BE] 디코딩 -> �
        * */

        System.out.println("==한글 인코딩 - 기본==");
        test("가", StandardCharsets.US_ASCII, StandardCharsets.US_ASCII);
        test("가", StandardCharsets.ISO_8859_1, StandardCharsets.ISO_8859_1);
        test("가", EUC_KR, EUC_KR);
        test("가", MS_949, MS_949);
        test("가", StandardCharsets.UTF_8, StandardCharsets.UTF_8);
        test("가", StandardCharsets.UTF_16BE, StandardCharsets.UTF_16BE);
        /*
        * 가 -> [US-ASCII] 인코딩 -> [63] 1byte -> [US-ASCII] 디코딩 -> ?
        * 가 -> [ISO-8859-1] 인코딩 -> [63] 1byte -> [ISO-8859-1] 디코딩 -> ?
        * 가 -> [EUC-KR] 인코딩 -> [-80, -95] 2byte -> [EUC-KR] 디코딩 -> 가
        * 가 -> [x-windows-949] 인코딩 -> [-80, -95] 2byte -> [x-windows-949] 디코딩 -> 가
        * 가 -> [UTF-8] 인코딩 -> [-22, -80, -128] 3byte -> [UTF-8] 디코딩 -> 가
        * 가 -> [UTF-16BE] 인코딩 -> [-84, 0] 2byte -> [UTF-16BE] 디코딩 -> 가
        * */

        System.out.println("==한글 인코딩 - 복잡한 문자==");
        test("뷁", StandardCharsets.US_ASCII, StandardCharsets.US_ASCII);
        test("뷁", StandardCharsets.ISO_8859_1, StandardCharsets.ISO_8859_1);
        test("뷁", EUC_KR, EUC_KR);
        test("뷁", MS_949, MS_949);
        test("뷁", StandardCharsets.UTF_8, StandardCharsets.UTF_8);
        test("뷁", StandardCharsets.UTF_16BE, StandardCharsets.UTF_16BE);
        /*
        * 뷁 -> [US-ASCII] 인코딩 -> [63] 1byte -> [US-ASCII] 디코딩 -> ?
        * 뷁 -> [ISO-8859-1] 인코딩 -> [63] 1byte -> [ISO-8859-1] 디코딩 -> ?
        * 뷁 -> [EUC-KR] 인코딩 -> [63] 1byte -> [EUC-KR] 디코딩 -> ?
        * 뷁 -> [x-windows-949] 인코딩 -> [-108, -18] 2byte -> [x-windows-949] 디코딩 -> 뷁
        * 뷁 -> [UTF-8] 인코딩 -> [-21, -73, -127] 3byte -> [UTF-8] 디코딩 -> 뷁
        * 뷁 -> [UTF-16BE] 인코딩 -> [-67, -63] 2byte -> [UTF-16BE] 디코딩 -> 뷁
        * */

        System.out.println("==한글 인코딩 - 디코딩이 다른 경우==");
        test("가", EUC_KR, MS_949);
        test("뷁", MS_949, EUC_KR);
        test("가", EUC_KR, StandardCharsets.UTF_8);
        test("가", MS_949, StandardCharsets.UTF_8);
        test("가", StandardCharsets.UTF_8, MS_949);
        /*
        * 가 -> [EUC-KR] 인코딩 -> [-80, -95] 2byte -> [x-windows-949] 디코딩 -> 가
        * 뷁 -> [x-windows-949] 인코딩 -> [-108, -18] 2byte -> [EUC-KR] 디코딩 -> ��
        * 가 -> [EUC-KR] 인코딩 -> [-80, -95] 2byte -> [UTF-8] 디코딩 -> ��
        * 가 -> [x-windows-949] 인코딩 -> [-80, -95] 2byte -> [UTF-8] 디코딩 -> ��
        * 가 -> [UTF-8] 인코딩 -> [-22, -80, -128] 3byte -> [x-windows-949] 디코딩 -> 媛�
        * */

        System.out.println("==영문 인코딩 - 디코딩이 다른 경우==");
        test("A", EUC_KR, StandardCharsets.UTF_8);
        test("A", MS_949, StandardCharsets.UTF_8);
        test("A", StandardCharsets.UTF_8, MS_949);
        test("A", StandardCharsets.UTF_8, StandardCharsets.UTF_16BE);
        /*
        * A -> [EUC-KR] 인코딩 -> [65] 1byte -> [UTF-8] 디코딩 -> A
        * A -> [x-windows-949] 인코딩 -> [65] 1byte -> [UTF-8] 디코딩 -> A
        * A -> [UTF-8] 인코딩 -> [65] 1byte -> [x-windows-949] 디코딩 -> A
        * A -> [UTF-8] 인코딩 -> [65] 1byte -> [UTF-16BE] 디코딩 -> �
        * */
    }

    private static void test(String text, Charset encodingCharset, Charset decodingCharset) {
        byte[] encoded = text.getBytes(encodingCharset);
        String decoded = new String(encoded, decodingCharset);
        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte -> [%s] 디코딩 -> %s\n",
                text, encodingCharset, Arrays.toString(encoded), encoded.length
                , decodingCharset, decoded);
    }
}
