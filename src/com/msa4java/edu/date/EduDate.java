package com.msa4java.edu.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class EduDate {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();  // 현재 시간 획득
        LocalDateTime targetDate = LocalDateTime.of(2026,5,1,23,10, 59);
        LocalDateTime parsed = LocalDateTime.parse("2026-05-01T23:10:20.123456789");

        // now로부터 1일 뒤
        LocalDateTime addOneDayByNow = now.plusDays(1);
        System.out.println(addOneDayByNow);
        System.out.println(now);

        // 상대적인 날짜이동 (TemporalAdjusters)

        // TemporalAdjuster firstDayOfMonth() : 해당 달의 첫 번째 날
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        // TemporalAdjuster lastDayOfMonth() : 해당 달의 마지막 날
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        // TemporalAdjuster next(DayOfWeek) 돌아오는 특정 요일
        LocalDateTime nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(nextMonday);


        // 날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2024, 9, 12);
        System.out.println(d1.isBefore(d2));
        System.out.println(d1.isAfter(d2));
        System.out.println(d1.isEqual(d2));

        // Period 객체  (LocalDate만 파라미터로 넣을 수 있다)
        Period p1 = Period.between(d1, d2);
        // d1으로부터 d2까지 흐른 시간 (년/개월/일)
        // Math.abs : 절댓값을 취하는 함수
        System.out.println(Math.abs(p1.getYears()));
        System.out.println(Math.abs(p1.getMonths()));
        System.out.println(Math.abs(p1.getDays()));

        // 단위별 차이
        // 기준일로부터 몇 일이 지났는지
        long untilDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(Math.abs(untilDays));

        // 데이트 포맷 (DateTimeFormatter)
        // 날짜 객체 -> 문자열로 포맷 (format)
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String strNow = now.format(format1);
        System.out.println(strNow);

        // 문자열 -> 날짜 객체 (parse)
        String createdAt = "2025-06-20 14:33:20";
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(createdAt, format2);
        System.out.println(ldt);

        // LocalDateTime -> LocalDate 추출  (날짜만 추출)
        LocalDate ldtToLd = ldt.toLocalDate();
        System.out.println(ldtToLd);

    }
}
