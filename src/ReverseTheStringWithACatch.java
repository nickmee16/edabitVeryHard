public class ReverseTheStringWithACatch {

    public static void main(String[] args) {

        System.out.println(specialReverseString("Edabit"));
        System.out.println(specialReverseString("UPPER lower"));
        System.out.println(specialReverseString("1 23 456"));
        System.out.println(specialReverseString("Where's your dog Daisy?"));

    }

    public static String specialReverseString(String str) {
        String strNew = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            strNew += str.charAt(i);
        }
        strNew = strNew.replaceAll(" ", "");
        String result = "";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ' ') {
                result += " ";
                count++;

            } else if(Character.isUpperCase(str.charAt(i))) {
                result += Character.toUpperCase(strNew.charAt(i - count));

            } else {
                result += Character.toLowerCase(strNew.charAt(i - count));
            }
        }


        return result;
    }
}
