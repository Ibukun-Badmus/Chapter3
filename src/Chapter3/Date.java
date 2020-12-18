package Chapter3;

public class Date {

    int month;
    int day;
    int year;

    public Date(int monthValue, int dayValue, int yearValue) {
        month = monthValue;
        day = dayValue;
        year = yearValue;

    }

    public static void main(String[] args) {

    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }


    public String displayMonthDayYear() {
        return String.format("%d/%d/%d", month, day, year);
    }
}

