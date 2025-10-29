package codingtest;

public class Test3 {
    public static void main(String[] args) {
        /*
        n = 5 result = 2    > 1 5
        n = 6 result = 2    > 1 2 3 6
        n = 5000 result = 5
        * */
        int n = 6;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;

        // k = 6;
        // k 만큼 이동하면 k 만큼 건전지 소비
        // 순간 이동은 지금 거리 2배, 건전시 소비 0
        // 최소의 건전지 소비
        // 1 2 4 8 16 32 64 128 256 512 1024 2048 4096
        // 1 2 3 6 9 18 36 72 144 288 576
        // 1 2 3 6

        return answer;
    }
}
