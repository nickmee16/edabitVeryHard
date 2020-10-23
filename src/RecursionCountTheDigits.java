public class RecursionCountTheDigits {

    public static void main(String[] args) {
        System.out.println(digitsCount(213123123));
    }

    public static int digitsCount(long n) {

        if (n > -10 && n < 10) {
            return 1;
        } else {
            return digitsCount(n / 10) + 1;
        }
    }
}
