public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Coding Exercise: Leap Year Calculator");

        System.out.println("-1600 " + isLeapYear(-1600) + " not in range");
        System.out.println("1600 " + isLeapYear(1600));
        System.out.println("1700 " + isLeapYear(1700));
        System.out.println("1800 " + isLeapYear(1800));
        System.out.println("1900 " + isLeapYear(1900));
        System.out.println("1924 " + isLeapYear(1924));
        System.out.println("2017 " + isLeapYear(2017));
        System.out.println("2000 " + isLeapYear(2000));
        System.out.println("2100 " + isLeapYear(2100));
        System.out.println("2200 " + isLeapYear(2200));
        System.out.println("2300 " + isLeapYear(2300));
        System.out.println("2400 " + isLeapYear(2400));
        System.out.println("2500 " + isLeapYear(2500));
        System.out.println("2600 " + isLeapYear(2600));
        System.out.println("22000 " + isLeapYear(22000) + " not in range");

    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            //System.out.println("Not in range");
            return false;
        }
        //int divisible = year / 4;

        boolean leapOfTheYear = false;
        int remainderYear = 0;

        int leapYear =  (year / 4) * 4; // divisible * 4;
        if (leapYear == year){
            leapYear =  (year / 100) * 100;
            if (leapYear == year){
                leapYear = (year / 400) * 400;
                if (leapYear == year){
                    leapOfTheYear = true;
                }
            } else {
                remainderYear = year % 100;
                if (remainderYear == ((remainderYear / 4) * 4)){
                    leapOfTheYear =true;
                }
            }

        }else {
            leapOfTheYear = false;
        }

        return leapOfTheYear;
    }

}