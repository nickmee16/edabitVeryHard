import java.util.ArrayList;

public class LongestSubstringWithNonRepeatingCharacters {

    public static void main(String[] args) {

        System.out.println(longestNonrepeatingSubstring("abcabcbb"));
        System.out.println(longestNonrepeatingSubstring("aaaaaa"));
        System.out.println(longestNonrepeatingSubstring("abcde"));
        System.out.println(longestNonrepeatingSubstring("abcda"));
        System.out.println(longestNonrepeatingSubstring("kjlmjsdeee"));
        System.out.println(longestNonrepeatingSubstring("kjlmjsdfew"));
        System.out.println(longestNonrepeatingSubstring("kjlmjsdfewii"));

    }

    public static String longestNonrepeatingSubstring(String str) {
        String theSubstr = "";
        StringBuilder temp = new StringBuilder();
        ArrayList<String> letters = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            if(!letters.contains(String.valueOf(str.charAt(i)))) {
                letters.add(String.valueOf(str.charAt(i)));
                temp.append(str.charAt(i));
            } else {
                i = i - (letters.size() - letters.indexOf(i) - 1);
                letters.clear();

                if(temp.length() > theSubstr.length()) {
                    theSubstr = temp.toString();
                }
                temp = new StringBuilder("");
            }

            if(i == str.length() - 1 && temp.length() > theSubstr.length()) {
                theSubstr = temp.toString();
            }
        }

        return theSubstr;
    }
}
