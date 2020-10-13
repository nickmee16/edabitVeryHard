import java.math.BigInteger;

public class AddTwoStringNumbers {

    public static void main(String[] args) {

        System.out.println(addStrNums("4", "5"));
        System.out.println(addStrNums("abcdefg", "3"));
        System.out.println(addStrNums("1", ""));
        System.out.println(addStrNums("1874682736267235927359283579235789257", "32652983572985729"));

        // 9223372036854775807

    }

    public static String addStrNums(String num1, String num2) {
        boolean isNotDigit = false;

        for(int i = 0; i < num1.length(); i++) {
            if(!Character.isDigit(num1.charAt(i))) {
                isNotDigit = true;
                break;
            }
        }

        for(int i = 0; i < num2.length(); i++) {
            if(!Character.isDigit(num2.charAt(i))) {
                isNotDigit = true;
                break;
            }
        }

        if(isNotDigit) {
            return "-1";
        }

        if(num1.length() > 18 || num2.length() > 18) {
            BigInteger n1 = new BigInteger(num1);
            BigInteger n2 = new BigInteger(num2);

            return n1.add(n2).toString();
        }

        long n1;
        long n2;

        if (num1.length() == 0) {
            n1 = 0;
        } else {
            n1 = Long.parseLong(num1);
        }

        if (num2.length() == 0) {
            n2 = 0;
        } else {
            n2 = Long.parseLong(num2);
        }


        return Long.toString(n1 + n2);

    }
}
