public class RecursionPalindromeWord {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String wrd) {
        boolean isCorrect = true;
        int length = wrd.length() / 2;

        for(int i = 0; i < length; i++) {

            if(wrd.charAt(i) != wrd.charAt((wrd.length() - 1) - i)) {
                isCorrect = false;
                break;
            }
        }

        return isCorrect;
    }
}
