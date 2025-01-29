package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap);
        // {studentA=50}

        // 학생이 없는 경우에만 추가 - 1
        if (!studentMap.containsKey("studentA")){
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);
        // {studentA=50}

        // 학생이 없는 경우에만 추가 - 2
        studentMap.putIfAbsent("studentA", 100);
        studentMap.putIfAbsent("studentB", 100);
        System.out.println(studentMap);
        // {studentB=100, studentA=50}

    }
}
