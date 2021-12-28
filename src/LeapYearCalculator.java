public class LeapYearCalculator {

    public static boolean isLeapYear (int year) {
        if((year < 1) || (year > 9999)) {
            System.out.println("This is not a leap year");
            return false;
                } else {
            if((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                System.out.println("This is a leap year");
                return true;
            }
            System.out.println("This is not a leap year");
            return false;
        }
    }
}
