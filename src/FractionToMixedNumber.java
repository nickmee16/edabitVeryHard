import java.util.ArrayList;

public class FractionToMixedNumber {

    public static void main(String[] args) {

        System.out.println(mixedNumber("0/32768"));
        System.out.println(mixedNumber("-5/4"));
        System.out.println(mixedNumber("-2037450/204"));
        System.out.println(mixedNumber("-102/204"));

    }

    public static String mixedNumber(String frac) {
        String strN1 = "";
        String strN2 = "";

        for(int i = 0; i < frac.length(); i++) {
            if(frac.charAt(i) == '/') {
                strN1 = strN2;
                strN2 = "";
            } else {
                strN2 += frac.charAt(i);
            }
        }

        int n1 = Integer.parseInt(strN1);
        int n2 = Integer.parseInt(strN2);

        if(n1 == 0) {
            return "0";

        } else if(n1 < 0) {
            int positiveN1 = n1 * -1;

            if(positiveN1 > n2) {
                int left = positiveN1 % n2;

                if(left == 0) {
                    return "" + n1 / n2;

                } else if(left == 1) {
                    return n1 / n2 + " " + left + "/" + n2;

                } else {
                    return n1 / n2 + " " + primeDivide(left, n2);
                }

            } else {
                int left = n2 % positiveN1;

                if(left == 0) {
                    return "-1/" + n2 / positiveN1;
                } else {
                    return primeDivide(n1, n2);
                }
            }
        } else {

            if(n1 > n2) {
                int left = n1 % n2;

                if(left == 0) {
                    return "" + n1 / n2;

                } else if(left == 1) {
                    return n1 / n2 + " " + left + "/" + n2;

                } else {
                    return n1 / n2 + " " + primeDivide(left, n2);
                }
            } else {
                int left = n2 % n1;

                if(left == 0) {
                    return "1/" + n2 / n1;
                } else {
                    return primeDivide(n1, n2);
                }
            }
        }
    }



    public static String primeDivide(int n1, int n2) {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean isNotPrime = false;

        for(int i = 2; i <= n1; i++) {
            isNotPrime = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isNotPrime = true;
                    break;
                }
            }

            if(!isNotPrime) {
                primes.add(i);
            }
        }

        int temp1 = n1;
        int temp2 = n2;
        boolean isPossible = true;

        while (isPossible) {

            for(int i = 0; i < primes.size(); i++) {

                if(temp1 % primes.get(i) == 0 && temp2 % primes.get(i) == 0) {
                    temp1 /= primes.get(i);
                    temp2 /= primes.get(i);
                    break;
                }
            }

            if(n1 != temp1) {
                n1 = temp1;
                n2 = temp2;
            } else {
                isPossible = false;
            }
        }

        return n1 + "/" + n2;
    }
}
