public class TestMyDateTime {
    public static void main(String[] args) {

        MyTime time = new MyTime(15, 30);

        MyDate date = new MyDate(28, 2, 2017);

        MyDateTime dateTime = new MyDateTime(date, time);
        String strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2017-02-28 15:30

        dateTime.incrementDay();
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2017-03-01 15:30

        dateTime.incrementHour();
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2017-03-01 16:30

        dateTime.incrementHour(32);
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2017-03-03 00:30

        dateTime.decrementHour(49);
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2017-02-28 23:30

        dateTime.incrementMinute(90);
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2017-03-01 01:00

        dateTime.decrementMinute(30);
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2017-03-01 00:30


        dateTime.incrementYear(3);
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2020-03-01 00:30

        dateTime.decrementDay();
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2020-02-29 00:30

        dateTime.decrementYear();
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2019-02-28 00:30

        dateTime.decrementMonth();
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2019-01-28 00:30


        dateTime.incrementDay(3);
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2019-01-31 00:30

        dateTime.decrementMonth(2);
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2018-11-30 00:30

        dateTime.decrementDay(30);
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2018-10-31 00:30

        dateTime.incrementMonth(16);
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2020-02-29 00:30

        dateTime.decrementYear(4);
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2016-02-29 00:30

        dateTime.incrementMonth();
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2016-03-29 00:30

        dateTime.incrementYear();
        strRep = dateTime.toString();
        System.out.println(strRep);
        //Expected output: 2017-03-29 00:30

        MyDateTime anotherDateTime = new MyDateTime(new MyDate(29,3,2017), new MyTime(15,30));

        boolean before = dateTime.isBefore(anotherDateTime);
        System.out.println(dateTime.toString()+ " is before " + anotherDateTime.toString()+ " = " + before);
        //Expected output: 2017-03-29 00:30 is before 2017-03-29 15:30 = true

        boolean after = dateTime.isAfter(anotherDateTime);
        System.out.println(dateTime.toString()+ " is after " + anotherDateTime.toString()+ " = " + after);
        //Expected output: 2017-03-29 00:30 is after 2017-03-29 15:30 = false

        String dayTimeDiff = dateTime.dayTimeDifference(anotherDateTime);
        System.out.println("Day time difference between " + dateTime.toString()+ " and " + anotherDateTime.toString()+ " is " + dayTimeDiff);
        //Expected output: Day difference between 2017-03-29 00:30 and 2017-03-29 15:30 is 15 hour(s)

        anotherDateTime.incrementMinute(4850);
        strRep = anotherDateTime.toString();
        System.out.println(strRep);
        //Expected output: 2017-04-02 00:20

        dayTimeDiff = dateTime.dayTimeDifference(anotherDateTime);
        System.out.print("Day time difference between " + dateTime.toString()+ " and " + anotherDateTime.toString()+ " is " + dayTimeDiff);
        //Expected output: Day difference between 2017-03-29 00:30 and 2017-04-02 00:20 is 3 day(s) 23 hour(s) 50 minute(s)

    }

}
