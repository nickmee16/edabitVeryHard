import java.util.ArrayList;
import java.util.Arrays;

public class RemoveTheWord {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeLetters(new String[]{"s", "t", "r", "i", "n", "g", "w"}, "string")));
        System.out.println(Arrays.toString(removeLetters(new String[]{"b", "b", "l", "l", "g", "n", "o", "a", "w"}, "balloon")));
        System.out.println(Arrays.toString(removeLetters(new String[]{"d", "b", "t", "e", "a", "i"}, "edabit")));

    }

    public static String[] removeLetters(String[] letters, String word) {

        ArrayList<String> lettersAL = new ArrayList<>();

        for(int i = 0; i < word.length(); i++) {
            lettersAL.add(String.valueOf(word.charAt(i)));
        }

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < letters.length; i++) {
            if(lettersAL.contains(letters[i])) {
                lettersAL.remove(letters[i]);
            } else {
                str.append(letters[i]);
            }
        }

        if (str.toString().equals("")) {
            String arr[] = {};
            return arr;
        }


        return str.toString().split("");
    }
}
