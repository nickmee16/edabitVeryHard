import java.util.ArrayList;

public class PalindromicAnagrams {

    public static void main(String[] args) {

        System.out.println(isPalindromePossible("rearcac"));
        System.out.println(isPalindromePossible("suhbeusheff"));
        System.out.println(isPalindromePossible("palindrome"));

    }

    public static boolean isPalindromePossible(String str) {
        ArrayList<String> letters = new ArrayList<>();
        int countLetters;
        int countOddLetters = 0;

        for(int i = 0; i < str.length(); i++) {

            if(!letters.contains(String.valueOf(str.charAt(i)))) {

                letters.add(String.valueOf(str.charAt(i)));
                countLetters = 0;

                for(int j = 0; j < str.length(); j++) {

                    if(str.charAt(i) == str.charAt(j)) {
                        countLetters++;
                    }
                }

                if(countLetters % 2 != 0) {
                    countOddLetters++;
                }
            }
        }

        if(str.length() % 2 == 0 && countOddLetters == 0) {
            return true;
        } else if(str.length() % 2 != 0 && countOddLetters == 1) {
            return true;
        }

        return false;
    }
}
