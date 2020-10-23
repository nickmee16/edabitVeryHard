public class SentencePrimeness {

    public static void main(String[] args) {

        System.out.println(sentencePrimeness("Help me!"));
        System.out.println(sentencePrimeness("42 is THE aNsWeR..."));
        System.out.println(sentencePrimeness("Did you smoke?"));

    }

    public static String sentencePrimeness(String sentence) {
            String sentenceLC = sentence.toLowerCase();
            int num = 0;

            for(int i = 0; i < sentenceLC.length(); i++) {
                char chTemp = sentenceLC.charAt(i);

                if(Character.isLetter(chTemp)) {
                    num += ((int) chTemp - (int) 'a') + 1;

                } else if(Character.isDigit(chTemp)) {
                    num += Character.getNumericValue(chTemp);
                }
            }

            boolean isNotPrime = false;

            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    isNotPrime = true;
                    break;
                }
            }

            if(!isNotPrime) {
                return "Prime Sentence";
            }

            String[] sentenceSplit = sentence.split(" ");
            String[] sentenceLCSplit = sentenceLC.split(" ");
            String typeSentence = "";
            int temp;

            for(int i = 0; i < sentenceLCSplit.length; i++) {
                temp = 0;

                for(int j = 0; j < sentenceLCSplit[i].length(); j++) {
                    char chTemp = sentenceLCSplit[i].charAt(j);

                    if(Character.isLetter(chTemp)) {
                        temp += ((int) chTemp - (int) 'a') + 1;

                    } else if(Character.isDigit(chTemp)) {
                        temp += Character.getNumericValue(chTemp);
                    }
                }

                temp = num - temp;

                isNotPrime = false;

                for (int y = 2; y <= temp / 2; ++y) {
                    if (temp % y == 0) {
                        isNotPrime = true;
                        break;
                    }
                }

                if(!isNotPrime) {
                    typeSentence = "Almost Prime Sentence" + " (" + sentenceSplit[i].replaceAll("[^a-zA-Z ]", "") + ")";
                    break;
                }
            }

            if(typeSentence.equals("")) {
                return "Composite Sentence";
            } else {
                return typeSentence;
            }
    }
}
