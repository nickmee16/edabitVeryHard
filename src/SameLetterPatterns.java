import java.util.ArrayList;

public class SameLetterPatterns {

    public static void main(String[] args) {

        System.out.println(sameLetterPattern("ABAB", "CDCD"));
        System.out.println(sameLetterPattern("ABCBA", "BCDCB"));
        System.out.println(sameLetterPattern("FFGG", "CDCD"));
        System.out.println(sameLetterPattern("FFFF", "ABCD"));
        System.out.println(sameLetterPattern("ABCBA", "BCDCB"));

    }

    public static boolean sameLetterPattern(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        ArrayList<String> strAL1 = new ArrayList<>();
        ArrayList<String> strAL2 = new ArrayList<>();
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {

            if (!strAL1.contains(String.valueOf(str1.charAt(i)))) {

                strAL1.add(String.valueOf(str1.charAt(i)));
                num1.add(strAL1.indexOf(String.valueOf(str1.charAt(i))));

            } else {
                num1.add(strAL1.indexOf(String.valueOf(str1.charAt(i))));
            }
        }

        for (int i = 0; i < str2.length(); i++) {

            if (!strAL2.contains(String.valueOf(str2.charAt(i)))) {

                strAL2.add(String.valueOf(str2.charAt(i)));
                num2.add(strAL2.indexOf(String.valueOf(str2.charAt(i))));

            } else {
                num2.add(strAL2.indexOf(String.valueOf(str2.charAt(i))));
            }
        }

        boolean isCorrect = true;

        for (int i = 0; i < num1.size(); i++) {
            if (!num1.get(i).equals(num2.get(i))) {
                isCorrect = false;
                break;
            }
        }


        return isCorrect;
    }
}
