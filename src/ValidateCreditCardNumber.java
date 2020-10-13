public class ValidateCreditCardNumber {

    public static void main(String[] args) {

        System.out.println(validateCard(1234567890123456L));
        System.out.println(validateCard(1234567890123452L));
        System.out.println(validateCard(709092739800713L));
    }

    public static boolean validateCard(long num) {
        String strNum = Long.toString(num);

        if(strNum.length() < 14 || strNum.length() > 19) {
            return false;
        }

        int checkDigit = Character.getNumericValue(strNum.charAt(strNum.length() - 1));
        int sum = 0;
        int temp;


        for(int i = strNum.length() - 2; i >= 0; i--) {
            temp = Character.getNumericValue(strNum.charAt(i));

            if(strNum.length() % 2 == 0) {

                if(i % 2 == 0) {
                    temp = temp * 2;

                    if(temp < 10) {
                        sum += temp;

                    } else {
                        String strTemp = Integer.toString(temp);
                        temp = Character.getNumericValue(strTemp.charAt(0)) + Character.getNumericValue(strTemp.charAt(1));
                        sum += temp;
                    }

                } else {
                    sum += temp;
                }
            } else {

                if(i % 2 != 0) {
                    temp = temp * 2;

                    if(temp < 10) {
                        sum += temp;

                    } else {
                        String strTemp = Integer.toString(temp);
                        temp = Character.getNumericValue(strTemp.charAt(0)) + Character.getNumericValue(strTemp.charAt(1));
                        sum += temp;
                    }

                } else {
                    sum += temp;
                }
            }

        }

        if(10 - sum % 10 == checkDigit) {
            return true;
        }

        return false;
    }
}
