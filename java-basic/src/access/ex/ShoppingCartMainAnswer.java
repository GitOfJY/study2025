package access.ex;

public class ShoppingCartMainAnswer {
    public static void main(String[] args) {
        ShoppingCartAnswer shoppingCart = new ShoppingCartAnswer();

        ItemAnswer item1 = new ItemAnswer("마늘", 2000, 2);
        ItemAnswer item2 = new ItemAnswer("상추", 3000, 4);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.displayItems();

    }
}
