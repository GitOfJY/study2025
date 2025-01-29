package access.ex;

public class MaxCountAnswer {
    private int count = 0;
    private int max = 3;

    public MaxCountAnswer(int max){
        this.max = max;
    }

    public void increment(){
        if (count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        } else {
            this.count += 1;
        }
    }

    public int getCount(){
        return count;
    }
}
