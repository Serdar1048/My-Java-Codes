public class MyDate {
    int day;
    int month; // should be incremented by one before printing
    int year;

    int[] maxDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month - 1; //0 represents January  11 represents December
        this.year = year;
    }

    public void incrementDay() {
        int newDay = day + 1;
        if (newDay > maxDays[month]) {
            day = 1;
            incrementMonth();
        } else if (month == 1 && newDay == 29 && isLeapYear()) {
            day = 1;
            incrementMonth();    //will also handle the change in year
        } else {
            day = newDay;
        }
    }
    public void decrementDay() {
        int newDay = day - 1;
        if (newDay == 0) {
            day = 31;
            decrementMonth(); //will also adjust the day to its max and handle the change in year
        } else {
            day = newDay;
        }
    }
    public void incrementDay(int i) {
        while (i > 0) {
            incrementDay();
            i--;
        }
    }
    public void decrementDay(int i) {
        while (i > 0) {
            decrementDay();
            i--;
        }
    }
    public void incrementMonth(int i) {
        int newMonth = (month + i) % 12;
        int yearChange = 0;

        if (newMonth < 0) {
            newMonth += 12;
            yearChange = -1;
        }
        yearChange += (month + i) / 12;
        month = newMonth;
        year += yearChange;
        if (day > maxDays[month]) {
            day = maxDays[month];
            if (month == 1 && day == 29 && isLeapYear()) {
                day = 28;
            }
        }
    }
    public void incrementMonth() {
        incrementMonth(1);
    }

    public void decrementMonth(int i) {
        incrementMonth(-i);
    }

    public void decrementMonth() {
        incrementMonth(-1);
    }

    public void incrementYear(int i) {
        year += i;
        if (month == 1 && day == 29 && isLeapYear()) {
            day = 28;
        }
    }

    public void incrementYear() {
        incrementYear(1);
    }

    public void decrementYear() {
        incrementYear(-1);
    }

    public void decrementYear(int i) {
        incrementYear(-i);
    }

    public boolean isBefore(MyDate anotherDate) {
        int a = Integer.parseInt(toString().replaceAll("-", ""));
        int b = Integer.parseInt(anotherDate.toString().replaceAll("-", ""));
        return a < b;
    }

    public int dayDifference(MyDate anotherDate) {
        int diff = 0;

        if (this.isBefore(anotherDate)) {
            MyDate date = new MyDate(this.day, this.month + 1, this.year);
            while (date.isBefore(anotherDate)) {
                date.incrementDay();
                ++diff;
            }
        } else if (this.isAfter(anotherDate)) {
            MyDate date = new MyDate(this.day, this.month + 1, this.year);
            while (date.isAfter(anotherDate)) {
                date.decrementDay();
                ++diff;
            }
        }
        return diff ;
    }

    public boolean isAfter(MyDate anotherDate) {
        int a = Integer.parseInt(toString().replaceAll("-", ""));
        int b = Integer.parseInt(anotherDate.toString().replaceAll("-", ""));
        return a > b;
    }

    public String toString() {
        return year + "-" + (month + 1 < 10 ? "0" : "") + (month + 1) + "-" + (day < 10 ? "0" : "") + day;
    }

    public boolean isLeapYear() {
        return year % 4 != 0;
    }
}