public class MyDateTime {
    MyDate date;
    MyTime time;

    public MyDateTime(MyDate date, MyTime time) {
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return date.toString() + " " + time.toString();
    }

    public void incrementDay() {
        date.incrementDay();
    }

    public void incrementHour() {
        time.incrementHour();
    }

    public void incrementHour(int diff) {
        int dayDiff = time.incrementHour(diff);
        if (dayDiff > 0)
            date.incrementDay(dayDiff);
        else
            date.decrementDay(-dayDiff);
    }

    public void decrementHour(int diff) {
        incrementHour(-diff);
    }

    public void incrementMinute(int diff) {
        int dayDiff = time.incrementMinute(diff);
        if (dayDiff > 0)
            date.incrementDay(dayDiff);
        else
            date.decrementDay(-dayDiff);
    }

    public void decrementMinute(int diff) {
        incrementMinute(-diff);
    }

    public void incrementYear(int diff) {
        date.incrementYear(diff);
    }

    public void decrementDay() {
        date.decrementDay();
    }

    public void decrementYear() {
        date.decrementYear();
    }

    public void decrementMonth() {
        date.decrementMonth();
    }

    public void incrementDay(int diff) {
        date.incrementDay(diff);
    }

    public void decrementMonth(int diff) {
        date.decrementMonth(diff);
    }

    public void decrementDay(int diff) {
        date.decrementDay(diff);
    }

    public void incrementMonth(int diff) {
        date.incrementMonth(diff);
    }

    public void decrementYear(int diff) {
        date.decrementYear(diff);
    }

    public void incrementMonth() {
        date.incrementMonth();
    }

    public void incrementYear() {
        date.incrementYear();
    }

    public boolean isBefore(MyDateTime anotherDateTime) {
        if (date.isBefore(anotherDateTime.date))
            return true;
        else if (date.isAfter(anotherDateTime.date))
            return false;
        if (time.isAfter(anotherDateTime.time))
            return false;
        return true;
    }

    public boolean isAfter(MyDateTime anotherDateTime) {
        return !isBefore(anotherDateTime);
    }

    public String dayTimeDifference(MyDateTime anotherDateTime) {
        int dayDifference = date.dayDifference(anotherDateTime.date);
        int hourDifference = 0;
        int minuteDifference = 0;

        if (this.isBefore(anotherDateTime)) {
            hourDifference = anotherDateTime.time.hour - this.time.hour;
            minuteDifference = anotherDateTime.time.minute - this.time.minute;
        } else {
            hourDifference = this.time.hour - anotherDateTime.time.hour;
            minuteDifference = this.time.minute - anotherDateTime.time.minute;
        }

        if (minuteDifference < 0) {
            hourDifference--;
            minuteDifference += 60;
        }

        if (hourDifference < 0) {
            dayDifference--;
            hourDifference += 24;
        }

        return ((dayDifference == 0 ? "" : dayDifference + " day(s) ") +
                (hourDifference == 0 ? "" : hourDifference + " hour(s) ") +
                (minuteDifference == 0 ? "" : minuteDifference + " minute(s) "));
    }


}