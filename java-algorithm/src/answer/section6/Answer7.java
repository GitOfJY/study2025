package answer.section6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Answer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }
        // 정렬, 정렬의 기준이 compareTo
        Collections.sort(arr);

        for (Point o : arr) {
            System.out.print(o.x + " " + o.y);
        }
    }
}

class Point implements Comparable<Point> {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        // 오름차순으로 정렬하고 싶으면 음수가 return
        // 내림차순으로 정렬하고 싶으면 양수가 return
        if (this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}
