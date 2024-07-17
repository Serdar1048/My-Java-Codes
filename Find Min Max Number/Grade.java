public class Grade {
    public static void main(String[] args) {
        int grade = Integer.parseInt(args[0]);
        if (grade <= 100 && grade >= 0) {
            if (grade <= 100 && grade > 90) {
                System.out.println("AA");
            } else if (grade <= 90 && grade > 80) {
                System.out.println("BB");
            } else if (grade <= 80 && grade > 70) {
                System.out.println("CC");
            } else if (grade <= 70 && grade > 60) {
                System.out.println("DD");
            } else {
                System.out.println("FF");
            }
        }
    }
}