public class RecursiveGCD {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int greater = number1 > number2 ? number1 : number2;
        int smaller = number1 < number2 ? number1 : number2;

        int result = gcd(greater, smaller);
        System.out.println("GCD " + result);
    }

    public static int gcd(int greater, int smaller) {
        if (smaller == 0) {
            return greater;
        }

        return gcd(smaller, greater%smaller);
    }
}
