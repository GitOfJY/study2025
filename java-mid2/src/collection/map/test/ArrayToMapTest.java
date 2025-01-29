package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {

        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA" , "30000"}};

        // 주어진 배열로부터 Map 생성
        Map<String, Integer> productMap = new HashMap<>();
//        productMap.put("Java", 10000);
//        productMap.put("Spring", 20000);
//        productMap.put("JPA", 30000);
        for (String[] product : productArr) {
            productMap.put(product[0], Integer.valueOf(product[1]));
        }

        // 주어진 모든 데이터 출력
        for (String key : productMap.keySet()){
            System.out.println("제품: "+key+", 가격: "+productMap.get(key));
        }

    }
}
