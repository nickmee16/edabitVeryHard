import java.util.ArrayList;

public class TextTwist {

    public static void main(String[] args) {

        System.out.println(totalPoints(new String[]{"dote", "dotes", "toes", "set", "dot", "dots", "sted"},"tossed"));
        System.out.println(totalPoints(new String[]{"trance", "recant"}, "recant"));
        System.out.println();

    }

    public static int totalPoints(String[] guesses, String word) {
        ArrayList<String> letters = new ArrayList<>();

        for(int i = 0; i < word.length(); i++) {
            letters.add(String.valueOf(word.charAt(i)));
        }

        int score = 0;
        boolean isCorrect;

        for(int i = 0; i < guesses.length; i++) {

            ArrayList lettersNew = new ArrayList<>(letters);
            isCorrect = true;

            for(int j = 0; j < guesses[i].length(); j++) {
                if(lettersNew.contains(String.valueOf(guesses[i].charAt(j)))) {
                    lettersNew.remove(String.valueOf(guesses[i].charAt(j)));
                } else {
                    isCorrect = false;
                    break;
                }
            }

            if(isCorrect) {
                if(guesses[i].length() == 3) {
                    score += 1;
                } else if(guesses[i].length() == 4) {
                    score += 2;
                } else if(guesses[i].length() == 5) {
                    score += 3;
                } else {
                    score += 54;
                }
            }
        }

        return score;
    }
}
