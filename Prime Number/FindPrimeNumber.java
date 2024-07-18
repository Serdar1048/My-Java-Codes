public class FindPrimeNumber {
    public static void main(String[] args) {
        int given = 30;
        for (int number = 2; number <= given; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor < number; divisor++) {
                if(number%divisor == 0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number);
            }
        }
    }
}
