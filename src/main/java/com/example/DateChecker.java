package com.example;

enum Month{
    JANUARY,
    FEBUARY,
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

public class DateChecker {
    public boolean has31Days(Month month) {
        return false;
    }
}
