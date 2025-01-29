package access.ex;

public class MaxCount {
    private int count;
    private int max = 3;

    public MaxCount(){
        this.count = 0;
    }

    public void increment(){
        if (this.count < max){
            this.count += 1;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public int getCount(){
        return count;
    }
}
