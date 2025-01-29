package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemcount;

    public void addItem(Item item) {
        if (items.length<=10){
            itemcount += 1;

        } else {

        }

    }

    public void displayItems() {

    }

}

/*
*
* ShoppingCart cart = new ShoppingCat();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
*
* */