public class TruncatablePrimes {

    public static void main(String[] args) {

//        System.out.println(truncatable(9137));
//        System.out.println(truncatable(5));
//        System.out.println(truncatable(6043));
        System.out.println(truncatable(131));

    }

    public static String truncatable(int num) {
        String strNum = Integer.toString(num);

        if(strNum.contains("0")) {
            return "none";
        }

        int temp;
        boolean isPrimeLeft = true;

        for(int i = 0; i < strNum.length(); i++) {

            temp = Integer.parseInt(strNum.substring(i));

            for (int y = 2; y <= temp / 2; y++) {
                if (temp % y == 0) {
                    isPrimeLeft = false;
                    break;
                }
            }

            if(temp == 1) {
                isPrimeLeft = false;
            }

            if (!isPrimeLeft) {
                break;
            }

        }

        boolean isPrimeRight = true;

        for(int i = 0; i < strNum.length(); i++) {

            temp = Integer.parseInt(strNum.substring(0, strNum.length() - i));

            for (int y = 2; y <= temp / 2; y++) {
                if (temp % y == 0) {
                    isPrimeRight = false;
                    break;
                }
            }

            if(temp == 1) {
                isPrimeRight = false;
            }

            if (!isPrimeRight) {
                break;
            }

        }

        if(isPrimeLeft && isPrimeRight) {
            return "both";

        } else if(isPrimeLeft) {
            return "left";

        } else if(isPrimeRight) {
            return "right";

        } else {
            return "none";
        }

    }
}
