public class MyDate {
    int day, month, year;
    int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void incrementDay() {
        if (this.day == maxDays[this.month - 1]) {
            this.incrementMonth();
            this.day = 1;
        } else {
            this.day++;
        }
    }

    private void incrementMonth() {
        this.month++;
    }

    private void decrementMonth() {
        this.month--;
    }

    public void incrementYear(int i) {
        while (i > 0) {
            this.year++;
            i--;
        }
    }

    public boolean isLeapYear() {
        return this.year % 4 == 0;
    }

    public void decrementDay() {
        if (this.day == 1 && this.isLeapYear()) {
            this.decrementMonth();
            this.day = 29;
        } else if (this.day == 1) {
            this.decrementMonth();
            this.day = maxDays[this.month - 1];
        } else {
            this.day--;
        }
    }

    @Override
    public String toString() {
        return this.year + "-" + ((this.month % 10) == this.month ? "0" : "") + this.month + "-" + (this.day < 10 ? "0" : "") + this.day;
    }

    public void decrementYear() {
    }
}