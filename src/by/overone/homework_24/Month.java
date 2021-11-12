package by.overone.homework_24;

public enum Month {
    JANYARY(31),
    FEBRUARY(29),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DESEMBER(31);

    int numberOfDays;

    Month(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
