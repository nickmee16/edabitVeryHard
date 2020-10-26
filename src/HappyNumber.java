import java.util.ArrayList;

public class HappyNumber {

    public static void main(String[] args) {

        System.out.println(isHappy(67));
        System.out.println(isHappy(89));
        System.out.println(isHappy(139));
        System.out.println(isHappy(1327));
        System.out.println(isHappy(2871));
        System.out.println(isHappy(3970));

    }

    public static boolean isHappy(int n) {
        ArrayList<Integer> allNums = new ArrayList<>();
        int temp = n;
        int sum;
        String strN;
        boolean isCorrect = false;
        boolean isPossible = true;

        while (isPossible) {
            strN = Integer.toString(temp);
            allNums.add(temp);
            sum = 0;

            for(int i = 0; i < strN.length(); i++) {
                sum += Math.pow(Character.getNumericValue(strN.charAt(i)), 2);
            }

            if(sum == 1) {
                isCorrect = true;
                isPossible = false;

            } else if(allNums.contains(sum)) {
                isPossible = false;

            } else {
                temp = sum;
            }
        }

        return isCorrect;
    }
}
