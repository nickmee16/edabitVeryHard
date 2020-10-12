import java.util.Arrays;

public class VowelFamilies {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sameVowelGroup(new String[]{"hoops", "chuff", "bot", "bottom"})));
        System.out.println(Arrays.toString(sameVowelGroup(new String[]{"semantic", "aimless", "beautiful", "meatless icecream"})));

    }

    public static String[] sameVowelGroup(String[] words) {
        String str = words[0].toLowerCase();
        boolean hasA = str.contains("a");
        boolean hasE = str.contains("e");
        boolean hasU = str.contains("u");
        boolean hasI = str.contains("i");
        boolean hasO = str.contains("o");


        boolean isCorrect;
        boolean isAtEnd;

        for(int i = 1; i < words.length; i++) {

            words[i] = words[i].toLowerCase();
            isAtEnd = true;
            isCorrect = true;

            while (isAtEnd) {

                if(hasA) {
                    if (!words[i].contains("a")) {
                        isCorrect = false;
                    }
                }
                if(hasE) {
                    if (!words[i].contains("e")) {
                        isCorrect = false;
                    }
                }
                if(hasU) {
                    if (!words[i].contains("u")) {
                        isCorrect = false;
                    }
                }
                if(hasI) {
                    if (!words[i].contains("i")) {
                        isCorrect = false;
                    }
                }
                if(hasO) {
                    if (!words[i].contains("o")) {
                        isCorrect = false;
                    }
                }



                if(words[i].contains("a")) {
                    if(!hasA) {
                        isCorrect = false;
                    }
                }

                if(words[i].contains("e")) {
                    if(!hasE) {
                        isCorrect = false;
                    }
                }
                if(words[i].contains("u")) {
                    if(!hasU) {
                        isCorrect = false;
                    }
                }
                if(words[i].contains("i")) {
                    if(!hasI) {
                        isCorrect = false;
                    }
                }
                if(words[i].contains("o")) {
                    if(!hasO) {
                        isCorrect = false;
                    }
                }

                isAtEnd = false;
            }

            if(isCorrect) {
                str += "," + words[i];
            }
        }

        str = str.trim();

        return str.split(",");
    }
}
