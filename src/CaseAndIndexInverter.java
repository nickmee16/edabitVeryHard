public class CaseAndIndexInverter {

    public static void main(String[] args) {

        System.out.println(invert("ytInIUgAsnOc"));
        System.out.println(invert("step on NO PETS"));
        System.out.println(invert("XeLPMoC YTiReTXeD"));

    }

    public static String invert(String s) {
        StringBuilder str = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--) {
            char chTemp = s.charAt(i);

            if(Character.isLetter(chTemp)) {
                if(Character.isLowerCase(chTemp)) {
                    str.append(Character.toUpperCase(chTemp));

                } else {
                    str.append(Character.toLowerCase(chTemp));
                }

            } else {
                str.append(chTemp);
            }
        }

        return str.toString();
    }
}
