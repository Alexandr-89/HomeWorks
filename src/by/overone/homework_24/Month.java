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

    private int numberOfDays;

    Month(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public static void zodiacSign(String mounth, int number){
        try {
            switch (valueOf(mounth.toUpperCase())){
                case JANYARY:
                    if (number>=0 && number<=20){
                        System.out.println("Your zodiac sing - CAPRICORN");
                    }else if (number>= 21 && number<= 31){
                        System.out.println("Your zodiac sing - AQUARIUS ");
                    }
                    break;
                case FEBRUARY:
                    if (number>=0 && number<=19){
                        System.out.println("Your zodiac sing - AQUARIUS");
                    }else if (number>= 20 && number<= 29){
                        System.out.println("Your zodiac sing - PISCES");
                    }
                    break;
                case MARCH:
                    if (number>=0 && number<=20){
                        System.out.println("Your zodiac sing - PISCES");
                    }else if (number>= 21 && number<= 31){
                        System.out.println("Your zodiac sing - ARIES");
                    }
                    break;
                case APRIL:
                    if (number>=0 && number<=20){
                        System.out.println("Your zodiac sing - ARIES");
                    }else if (number>= 21 && number<= 30){
                        System.out.println("Your zodiac sing - TAURUS");
                    }
                    break;
                case MAY:
                    if (number>=0 && number<=21){
                        System.out.println("Your zodiac sing - TAURUS");
                    }else if (number>= 22 && number<= 31){
                        System.out.println("Your zodiac sing - GEMINI");
                    }
                    break;
                case JUNE:
                    if (number>=0 && number<=21){
                        System.out.println("Your zodiac sing - GEMINI");
                    }else if (number>= 22 && number<= 30){
                        System.out.println("Your zodiac sing - CANCER");
                    }
                    break;
                case JULY:
                    if (number>=0 && number<=22){
                        System.out.println("Your zodiac sing - CANCER");
                    }else if (number>= 23 && number<= 31){
                        System.out.println("Your zodiac sing - LEO");
                    }
                    break;
                case AUGUST:
                    if (number>=0 && number<=22){
                        System.out.println("Your zodiac sing - LEO");
                    }else if (number>= 23 && number<= 31){
                        System.out.println("Your zodiac sing - VIRGO");
                    }
                    break;
                case SEPTEMBER:
                    if (number>=0 && number<=23){
                        System.out.println("Your zodiac sing - VIRGO");
                    }else if (number>= 24 && number<= 30){
                        System.out.println("Your zodiac sing - LIBRA");
                    }
                    break;
                case OCTOBER:
                    if (number>=0 && number<=23){
                        System.out.println("Your zodiac sing - LIBRA");
                    }else if (number>= 24 && number<= 31){
                        System.out.println("Your zodiac sing - SCORPIO");
                    }
                    break;
                case NOVEMBER:
                    if (number>=0 && number<=22){
                        System.out.println("Your zodiac sing - SCORPIO");
                    }else if (number>= 23 && number<= 30){
                        System.out.println("Your zodiac sing - SAGITTARIUS");
                    }
                    break;
                case DESEMBER:
                    if (number>=0 && number<=21){
                        System.out.println("Your zodiac sing - SAGITTARIUS");
                    }else if (number>= 22 && number<= 31){
                        System.out.println("Your zodiac sing - CAPRICORN");
                    }
                    break;
            }
        }catch (IllegalArgumentException e){
            System.out.println("There is no such month");
        }

    }
}
