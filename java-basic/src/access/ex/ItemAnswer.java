package access.ex;

public class ItemAnswer {
    private String name;
    private int pricce;
    private int qunatity;

    public ItemAnswer(String name, int price, int qunatity){
        this.name = name;
        this.pricce = price;
        this.qunatity = qunatity;
    }

    // 본인의 데이터는 본인이 처리하는 것이 좋다
    public String getName(){
        return name;
    }

    public int getTotalPrice(){
        return pricce*qunatity;
    }

}
