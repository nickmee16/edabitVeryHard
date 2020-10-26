public class GameOfThronesCharacterTitles {

    public static void main(String[] args) {

        System.out.println(correctTitle("MANCE RAYDER, KING-BEYOND-THE-WALL."));

    }

    public static String correctTitle(String str) {
        String[] strSplit = str.split("[^A-Za-z]+");
        String newStr = "";

        for(int i = 0; i < strSplit.length; i++) {
            if(strSplit[i].toLowerCase().equals("and")) {
                newStr += "and";

            } else if(strSplit[i].toLowerCase().equals("the")) {
                newStr += "the";

            } else if(strSplit[i].toLowerCase().equals("of")) {
                newStr += "of";

            }else if(strSplit[i].toLowerCase().equals("in")) {
                newStr += "in";

            }else if(strSplit[i].length() == 1) {
                newStr += strSplit[i].toLowerCase();

            } else {
                newStr += Character.toUpperCase(strSplit[i].charAt(0)) + strSplit[i].substring(1).toLowerCase();
            }
        }

        String strCorrect = "";
        int count = 0;

        for(int i =0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i))) {
                strCorrect += str.charAt(i);
                count++;

            } else {
                strCorrect += newStr.charAt(i - count);
            }
        }

        return strCorrect;
    }
}
