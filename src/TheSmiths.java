import java.util.ArrayList;

public class TheSmiths {

    public static void main(String[] args) {

        System.out.println(smithType(22));
        System.out.println(smithType(7));
        System.out.println(smithType(728));
        System.out.println(smithType(6));

    }

    public static String smithType(int number) {

        int nMini = number - 1;
        int nBigi = number + 1;

        if(SmithChecker(number).equals("Trivial Smith")) {
            return "Trivial Smith";

        } else if(SmithChecker(number).equals("Not a Smith")) {
            return "Not a Smith";

        } else if(SmithChecker(number).equals("Smith") && SmithChecker(nMini).equals("Smith")) {
            return "Oldest Smith";

        } else if(SmithChecker(number).equals("Smith") && SmithChecker(nBigi).equals("Smith")) {
            return "Youngest Smith";

        } else {
            return "Single Smith";
        }
    }


    public static String SmithChecker(int number) {

        if(number == 1) {
            return "Not a Smith";
        }

        boolean isNotPrime = false;

        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                isNotPrime = true;
                break;
            }
        }

        if(!isNotPrime) {
            return "Trivial Smith";
        }


        ArrayList<Integer> primeNums = new ArrayList<>();

        boolean isPrime;

        for (int i = 2; i <= number; i++) {
            isPrime = true;

            for (int y = 2; y <= i / 2; y++) {

                if (i % y == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNums.add(i);
            }
        }

        String strTemp = Integer.toString(number);
        int digitalRoot = 0;
        boolean isOneDigit = false;

        while (!isOneDigit) {

            for(int i = 0; i < strTemp.length(); i++) {
                digitalRoot += Character.getNumericValue(strTemp.charAt(i));
            }

            if(digitalRoot < 10) {
                isOneDigit = true;

            } else {
                strTemp = Integer.toString(digitalRoot);
                digitalRoot = 0;
            }
        }

        int sumOfPrimeFactors = 0;
        int intTemp = number;
        boolean isPossible = true;

        while (isPossible) {

            for(int i = 0; i < primeNums.size(); i++) {
                if(intTemp % primeNums.get(i) == 0) {
                    intTemp = intTemp / primeNums.get(i);
                    sumOfPrimeFactors += primeNums.get(i);
                    break;
                }
            }

            if(intTemp == 1) {
                isPossible = false;
            }
        }

        strTemp = Integer.toString(sumOfPrimeFactors);
        int digitalRootOfTemp = 0;
        isOneDigit = false;

        while (!isOneDigit) {

            for(int i = 0; i < strTemp.length(); i++) {
                digitalRootOfTemp += Character.getNumericValue(strTemp.charAt(i));
            }

            if(digitalRootOfTemp < 10) {
                isOneDigit = true;

            } else {
                strTemp = Integer.toString(digitalRootOfTemp);
                digitalRootOfTemp = 0;
            }
        }

        if(digitalRoot == digitalRootOfTemp) {
            return "Smith";

        } else {
            return "Not a Smith";
        }
    }
}
