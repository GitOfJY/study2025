package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime futureDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("기준시간 : " + dateTime);
        System.out.println("1년 2개월 3일 4시간 후의 시간 : " + futureDateTime);
        // 기준시간 : 2024-01-01T00:00
        // 1년 2개월 3일 4시간 후의 시간 : 2025-03-04T04:00

    }
}
