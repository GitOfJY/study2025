package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> items = new HashMap<>();

    public void add(Product product, int addQty){

        // if (items.containsKey(product)){
            // 장바구니에 이미 있는 경우 수량 +1
        //     items.remove(product);
        //     items.put(product, items.get(product) + 1);
        // } else {
        //     items.put(product, 1);
        // }

        Integer existingQty = items.getOrDefault(product, 0);
        items.put(product, existingQty + addQty);

    }

    public void printAll(){
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : items.entrySet()){
            System.out.println("상품 : " + entry.getKey() + " 수량 : " + entry.getValue());
        }
    }

    public void minus(Product product, int minusQty){

        int existingQty = items.getOrDefault(product, 0);
        int newQty = existingQty - minusQty;

        if (newQty <=0 ) {
            items.remove(product);
        } else {
            items.put(product, newQty);
        }

    }


}
