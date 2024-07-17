public class FindMaximum {

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        int the_maximum = (number1 > number2) ? number1: number2;
        System.out.println(the_maximum);
    }

}