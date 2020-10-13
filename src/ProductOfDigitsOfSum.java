public class ProductOfDigitsOfSum {

    public static void main(String[] args) {

        System.out.println(sumDigProd(8, 16, 89, 3));

    }

    public static long sumDigProd(Integer... n) {
        long result = 0;

        for(int i = 0; i < n.length; i++) {
            result += n[i];
        }

        if(result < 10) {
            return result;
        }

        long temp;
        String num = "";

        boolean isPossible = true;

        while (isPossible) {
            num = Long.toString(result);
            temp = 1;

            for(int i = 0; i < num.length(); i++) {
                temp *= Character.getNumericValue(num.charAt(i));
            }

            if(temp < 10) {
                result = temp;
                isPossible = false;
            } else {
                result = temp;
            }

        }

        return result;
    }
}
