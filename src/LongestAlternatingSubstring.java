public class LongestAlternatingSubstring {

    public static void main(String[] args) {

        System.out.println(longestSubstring("225424272163254474441338664823"));
        System.out.println(longestSubstring("594127169973391692147228678476"));
        System.out.println(longestSubstring("721449827599186159274227324466"));
        System.out.println(longestSubstring("736237766362158694825822899262"));
        System.out.println(longestSubstring("754388489999793138912431545258"));


    }

    public static String longestSubstring(String digits) {
        StringBuilder strTemp = new StringBuilder();
        String theSubstring = "";

        boolean isEven = Character.getNumericValue(digits.charAt(0)) % 2 == 0;


        for (int i = 0; i < digits.length(); i++) {
            int temp = Character.getNumericValue(digits.charAt(i));

            if (isEven) {

                if(i == digits.length() - 1) {

                    if (temp % 2 == 0) {
                        strTemp.append(temp);
                    }
                    if (strTemp.length() > theSubstring.length()) {
                        theSubstring = strTemp.toString();
                    }
                    break;
                }

                if (temp % 2 == 0) {
                    strTemp.append(temp);

                } else {

                    if (strTemp.length() > theSubstring.length()) {
                        theSubstring = strTemp.toString();
                    }
                    strTemp = new StringBuilder();
                    i--;
                }
                isEven = false;

            } else {

                if(i == digits.length() - 1) {

                    if (temp % 2 != 0) {
                        strTemp.append(temp);
                    }
                    if (strTemp.length() > theSubstring.length()) {
                        theSubstring = strTemp.toString();
                    }

                    break;

                }
                if (temp % 2 != 0) {
                    strTemp.append(temp);

                } else {

                    if (strTemp.length() > theSubstring.length()) {
                        theSubstring = strTemp.toString();
                    }
                    strTemp = new StringBuilder();
                    i--;
                }
                isEven = true;
            }
        }


        return theSubstring;

    }
}
