import java.util.ArrayList;
import java.util.Collections;

public class KaprekarsConstant {

    public static void main(String[] args) {

        System.out.println(kaprekar(6621));
        System.out.println(kaprekar(6554));
        System.out.println(kaprekar(1234));
        System.out.println(kaprekar(760));

    }

    public static int kaprekar(int num) {
        String theCount = recursiveLogic(num , 0, "");
        return Character.getNumericValue(theCount.charAt(theCount.length() - 1));
    }

    public static String recursiveLogic(int num, int count, String str) {
        count++;
        str += count;

        ArrayList<Integer> digits = new ArrayList<>();
        String strNum = Integer.toString(num);
        if (strNum.length() == 2) {
            strNum += "00";
        }

        if (strNum.length() == 3) {
            strNum += "0";
        }


        for (int i = 0; i < strNum.length(); i++) {
            digits.add(Character.getNumericValue(strNum.charAt(i)));
        }

        Collections.sort(digits);
        StringBuilder strNum1 = new StringBuilder();

        for (int i = 0; i < digits.size(); i++) {
            strNum1.append(digits.get(i));
        }

        digits.sort(Collections.reverseOrder());
        StringBuilder strNum2 = new StringBuilder();

        for (int i = 0; i < digits.size(); i++) {
            strNum2.append(digits.get(i));
        }


        int num1 = Integer.parseInt(strNum1.toString());
        int num2 = Integer.parseInt(strNum2.toString());

        if (num2 - num1 != 6174) {
           str += recursiveLogic(num2 - num1, count, "");
        }
    
        return str;
    }
}
