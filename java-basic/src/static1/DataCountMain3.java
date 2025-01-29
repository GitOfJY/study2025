package static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count="+Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count="+Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count="+Data3.count);

        // Data3.count
        // count라는 정적변수에 접근하는 방법이 조금 특이한데 클래스명에 .(dot)을 사용한다.

        // 인스턴스를 통한 정적변수 접근
        // count를 인스턴스 변수로 오해할 수 있기 때문에 권장하지 않는다.
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스를 통한 정적변수 접근
        System.out.println(Data3.count);

    }
}
