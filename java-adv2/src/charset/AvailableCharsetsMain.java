package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.SortedMap;

public class AvailableCharsetsMain {
    public static void main(String[] args) {
        // 이용 가능한 모든 CharSet 자바 + os
        SortedMap<String, Charset> availableCharsets = Charset.availableCharsets();
        for (String name : availableCharsets.keySet()) {
            System.out.println("charsetName : " + name);
        }

        System.out.println("=====================");
        // 문자로 조회(대소문자 구분x)
        Charset charset = Charset.forName("MS949");
        System.out.println("charsetName : " + charset.name());

        // 별칭 조회
        Set<String> aliases = charset.aliases();
        for (String name : aliases) {
            System.out.println("aliasName : " + name);
        }

        // UTF-8 문자열 조회
        Charset charset1 = Charset.forName("utf-8");
        System.out.println("charsetName : " + charset1.name());

        // UTF-8 상수 조회
        Charset charset2 = StandardCharsets.UTF_8;
        System.out.println("charsetName : " + charset2.name());

        // 시스템의 기본 Charset 조회
        Charset defaultCharset = Charset.defaultCharset();
        System.out.println("defaultCharset : " + defaultCharset.name());
    }
}
