package com.example;

import java.util.EnumSet;

public class DateChecker {

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    private static final EnumSet<Month> MONTHS_WITH_31_DAYS = EnumSet.of(
        Month.JANUARY,
        Month.MARCH,
        Month.MAY,
        Month.JULY,
        Month.AUGUST,
        Month.OCTOBER,
        Month.DECEMBER
    );

    public boolean has31Days(Month month) {

        if (month == null) {
            throw new IllegalArgumentException("Month cannot be null");
        }

        return MONTHS_WITH_31_DAYS.contains(month);
    }
}
