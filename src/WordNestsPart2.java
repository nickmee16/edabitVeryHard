public class WordNestsPart2 {

    public static void main(String[] args) {

        System.out.println(validWordNest("deep", "deep"));
        System.out.println(validWordNest("novel", "nonnonovnovnovelelelvelovelvel"));
        System.out.println(validWordNest("painter", "ppaintppapaipainterinternteraintererainter"));
        System.out.println(validWordNest("shape", "sssshapeshapehahapehpeape"));
        System.out.println(validWordNest("broadcast", "broadc broadcast broadcast ast"));

    }

    public static boolean validWordNest(String word, String nest) {
        boolean isCorrect = false;

        boolean hasWord;
        int count = 0;

        for(int i = 0; i < nest.length(); i++) {
            hasWord = true;
            if(nest.charAt(i) == word.charAt(0) && nest.length() - i > word.length()) {

                for(int j = 0; j < word.length(); j++) {

                    if(nest.charAt(i + j) != word.charAt(j)) {
                        hasWord = false;
                        break;
                    }
                }

                if(hasWord) {
                    count++;
                }
            }


        }

        if(count != 1) {
            return false;
        }

        boolean isPossible = true;

        while (isPossible) {



            if(nest.contains(word)) {
                nest = nest.replaceAll(word, "");

            } else {

                if(nest.equals("")) {
                    isCorrect = true;
                    isPossible = false;

                } else {
                    isPossible = false;
                }
            }
        }

        return isCorrect;
    }
}
