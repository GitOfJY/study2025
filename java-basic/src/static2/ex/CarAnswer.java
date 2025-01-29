package static2.ex;

public class CarAnswer {
    private String name;
    private static int totalCount;

    public CarAnswer(String name){
        this.name = name;
        System.out.println("차량 구입, 이름: "+name);
        totalCount++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: "+totalCount);
    }

}
