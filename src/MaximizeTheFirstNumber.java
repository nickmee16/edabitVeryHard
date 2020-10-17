import java.util.ArrayList;
import java.util.Collections;

public class MaximizeTheFirstNumber {

    public static void main(String[] args) {

        System.out.println(maxPossible(523, 76));
        System.out.println(maxPossible(9132, 5564));
        System.out.println(maxPossible(8732, 91255));

    }

    public static int maxPossible(int n1, int n2) {
        ArrayList<Integer> n2Digits = new ArrayList<>();
        String strN2 = Integer.toString(n2);

        for(int i = 0; i < strN2.length(); i++) {
            n2Digits.add((Character.getNumericValue(strN2.charAt(i))));
        }

        Collections.sort(n2Digits, Collections.reverseOrder());

        StringBuilder num = new StringBuilder();
        String strN1 = Integer.toString(n1);
        int temp;

        for(int i = 0; i < strN1.length(); i++) {
            temp = Character.getNumericValue(strN1.charAt(i));

            for(int j = 0; j < n2Digits.size(); j++) {
                if(temp < n2Digits.get(j)) {
                    temp = n2Digits.get(j);
                    n2Digits.remove(j);
                    break;
                }
            }

            num.append(temp);
        }

        return Integer.parseInt(num.toString());
    }
}
