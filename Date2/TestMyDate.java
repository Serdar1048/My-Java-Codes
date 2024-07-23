public class TestMyDate {

    public static void main(String[] args) {
        MyDate date = new MyDate(28,2,2017);

        String strRep = date.toString();
        System.out.println(strRep);
        //Expected output: 2017-02-28

        date.incrementDay();
        System.out.println(date.toString());
        //Expected output: 2017-03-01

        date.incrementYear(3);
        System.out.println(date.toString());
        //Expected output: 2020-03-01

        date.decrementDay();
        System.out.println(date.toString());
        //Expected output: 2020-02-29

        date.decrementYear();
        System.out.println(date.toString());
        //Expected output: 2019-02-28

        date.decrementMonth();
        System.out.println(date.toString());
        //Expected output: 2019-01-28


        date.incrementDay(3);
        System.out.println(date.toString());
        //Expected output: 2019-01-31

        date.decrementMonth(2);
        System.out.println(date.toString());
        //Expected output: 2018-11-30

        date.decrementDay(30);
        System.out.println(date.toString());
        //Expected output: 2018-10-31

        date.incrementMonth(16);
        System.out.println(date.toString());
        //Expected output: 2020-02-29

        date.decrementYear(4);
        System.out.println(date.toString());
        //Expected output: 2016-02-29

        date.incrementMonth();
        System.out.println(date.toString());
        //Expected output: 2016-03-29

        date.incrementYear();
        System.out.println(date.toString());
        //Expected output: 2017-03-29

        MyDate anotherDate = new MyDate(28,2,2017);

        boolean before = date.isBefore(anotherDate);
        System.out.println(date.toString()+ " is before " + anotherDate.toString()+ " : " + before);
        //Expected output: 2017-03-29 is before 2017-02-28 : false

        boolean after = date.isAfter(anotherDate);
        System.out.println(date.toString()+ " is after " + anotherDate.toString()+ " : " + after);
        //Expected output: 2017-03-29 is after 2017-02-28 : true

        int dayDiff = date.dayDifference(anotherDate);
        System.out.println("Day difference between " + date.toString()+ " and " + anotherDate.toString()+ " is " + dayDiff);
        //Expected output: Day difference between 2017-03-29 and 2017-02-28 is 29


    }

}