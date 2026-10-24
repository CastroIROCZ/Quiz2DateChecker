
package com.example;

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

    private Month[] monthsWith31Days = {
        Month.JANUARY,
        Month.MARCH,
        Month.MAY,
        Month.JULY,
        Month.AUGUST,
        Month.OCTOBER,
        Month.DECEMBER
    };

    public boolean has31Days(Month month) {

        for (Month currentMonth : monthsWith31Days) {
            if (currentMonth == month) {
                return true;
            }
        }

        return false;
    }
}
