public class NumbersToEnglish {

    public static void main(String[] args) {

        System.out.println(numToEng(0));
        System.out.println(numToEng(18));
        System.out.println(numToEng(126));
        System.out.println(numToEng(909));

    }

    public static String numToEng(int n) {
        if(n == 0) {
            return "zero";
        }
        if(n <= 20) {
            return oneDigitToString(Integer.toString(n));
        }

        String strN = Integer.toString(n);
        String nWithWords = "";

       if(strN.length() == 3) {
           nWithWords += oneDigitToString(String.valueOf(strN.charAt(0))) + " hundred";
           nWithWords = nWithWords.toLowerCase();

           if(strN.charAt(1) == '1') {

               nWithWords += " " + oneDigitToString(strN.substring(1));
               nWithWords = nWithWords.trim();

           } else {

               nWithWords += " " + oneDigitToString(String.valueOf(strN.charAt(1)) + 0);
               nWithWords = nWithWords.trim();

               nWithWords += " " + oneDigitToString(String.valueOf(strN.charAt(2)));
               nWithWords = nWithWords.trim();
           }


       } else if(strN.length() == 2) {
           nWithWords = oneDigitToString(String.valueOf(strN.charAt(0)) + 0);
           nWithWords = nWithWords.trim();

           nWithWords += " " + oneDigitToString(String.valueOf(strN.charAt(1)));
           nWithWords = nWithWords.trim();
       }

       return nWithWords;

    }

    public static String oneDigitToString(String num) {
        switch (num) {
            case "1":
                return "one";
            case "2":
                return "two";
            case "3":
                return "three";
            case "4:":
                return "four";
            case "5":
                return "five";
            case "6":
                return "six";
            case "7":
                return "seven";
            case "8":
                return "eight";
            case "9":
                return "nine";
            case "10:":
                return "ten";
            case "11":
                return "eleven";
            case "12":
                return "twelve";
            case "13":
                return "thirteen";
            case "14":
                return "fourteen";
            case "15":
                return "fifteen";
            case "16:":
                return "sixteen";
            case "17":
                return "seventeen";
            case "18":
                return "eighteen";
            case "19":
                return "nineteen";
            case "20":
                return "twenty";
            case "30":
                return "thirty";
            case "40":
                return "forty";
            case "50":
                return "fifty";
            case "60:":
                return "sixty";
            case "70":
                return "seventy";
            case "80":
                return "eighty";
            case "90":
                return "ninety";
            default:
                return "";
        }
    }
}
