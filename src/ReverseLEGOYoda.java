public class ReverseLEGOYoda {

    public static void main(String[] args) {

        System.out.println(reverseLegoYoda("Hit you with my stick, I shall."));
        System.out.println(reverseLegoYoda("Rejected me, my crush has. Ketamine, I need."));
        System.out.println(reverseLegoYoda("An alien, I am. Holding me captive in Area 51, the government is."));

    }

    public static String reverseLegoYoda(String text) {
        String[] sentences = text.split("\\.");
        StringBuilder newText = new StringBuilder();

        for(int i = 0; i < sentences.length; i++) {
            String[] splitSentence = sentences[i].split(",");

            for(int j = splitSentence.length - 1; j >= 0; j--) {
                splitSentence[j] = splitSentence[j].trim();

                if(j == splitSentence.length - 1) {
                    newText.append(Character.toUpperCase(splitSentence[j].charAt(0))).append(splitSentence[j].substring(1));
                    newText = new StringBuilder(newText.toString().trim());

                } else {
                    newText.append(" ").append(Character.toLowerCase(splitSentence[j].charAt(0))).append(splitSentence[j].substring(1));
                    newText = new StringBuilder(newText.toString().trim());
                }
            }

            newText.append(". ");
        }

        return newText.toString().trim();
    }
}
