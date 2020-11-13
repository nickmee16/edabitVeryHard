import java.util.ArrayList;
import java.util.Arrays;

public class PoppingBlocks {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(finalResult(new char[]{'B', 'B', 'A', 'C', 'A', 'A', 'C'})));

    }

    public static char[] finalResult(char[] letters) {
        ArrayList<Character> lettersAL = new ArrayList<>();

        for (int i = 0; i < letters.length; i++) {
            lettersAL.add(letters[i]);
        }

        for (int i = 0; i < lettersAL.size() - 1; i++) {
            char ch = lettersAL.get(i);
            
            if (ch == lettersAL.get(i + 1)) {
                for (int j = i; j < lettersAL.size(); j++) {
                    if (lettersAL.get(j) == ch) {
                        lettersAL.remove(j);
                        j--;
                    } else {
                        break;
                    }
                }
                i = -1;
            }

            if (lettersAL.size() == 0) {
                break;
            }
        }

        if (lettersAL.size() == 0) {
            return new char[0];
        }

        char[] finalLetters = new char[lettersAL.size()];

        for (int i = 0; i < lettersAL.size(); i++) {
            finalLetters[i] = lettersAL.get(i);
        }

        return finalLetters;
    }
}
