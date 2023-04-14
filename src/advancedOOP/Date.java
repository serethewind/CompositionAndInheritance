package advancedOOP;

import java.time.Year;

public class Date {
    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        validateDay(day);
        if ((month == 2 && validateYear(year)) && day > 28) {
            System.out.println(ErrorMessages.leapYearError);
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) & day > 30) {
            System.out.printf("%d does not have more than 30 days", month);
        }

        validateCurrentYear(year);

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        validateDay(day);
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        validateMonth(month);
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        validateYear(year);
        this.year = year;
    }

    private boolean validateDay(int day) {
        if (day < 1 || day > 31) {
            System.out.println("Ensure the day is within the accepted range");
            return false;
        }
        return true;
    }

    private boolean validateMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Ensure the month is within the accepted rage");
            return false;
        }
        return true;
    }

    private boolean validateYear(int year) {
        return year % 4 == 0;
    }

    private boolean validateCurrentYear(int year) {
        return !(year > Integer.parseInt(String.valueOf(Year.now())));
    }

    @Override
    public String toString() {
        return  getDay() + "-" +
                getMonth() + "-"
                + getYear()
                ;
    }




}


