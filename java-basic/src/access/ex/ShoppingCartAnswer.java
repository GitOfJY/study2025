package access.ex;

public class ShoppingCartAnswer {

    private ItemAnswer[] items = new ItemAnswer[10];
    private int itemCount;

    public void addItem(ItemAnswer item) {
        if (itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        // 정상로직
        items[itemCount] = item;
        itemCount++;

    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        // 상풍명:마늘, 합계:4000
        for (int i=0; i<itemCount; i++) {
            ItemAnswer item = items[i];
            System.out.println("상품명:"+item.getName()+", 합계:"+item.getTotalPrice());
        }
        System.out.println("전체 가격 합:"+calculateTotalPrice());
    }

    public int calculateTotalPrice(){
        int totalPrice = 0;
        for (int i=0; i<itemCount; i++) {
            ItemAnswer item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

}