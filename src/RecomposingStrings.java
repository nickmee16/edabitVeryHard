import java.util.ArrayList;

public class RecomposingStrings {

    public static void main(String[] args) {

//        System.out.println(recompose("KiKdaola"));
//        System.out.println(recompose("BaosdrOCfanada"));
        System.out.println(recompose("AhpewTxin"));

    }

    public static String recompose(String str) {
        ArrayList<String> strAL = new ArrayList<>();
        StringBuilder temp;
        char ch = ' ';
        boolean isNotVowel;
        boolean isVowel;

        for (int i = 0; i < str.length(); i++) {
            temp = new StringBuilder();
            ch = Character.toLowerCase(str.charAt(i));

            if (ch != 'a' && ch != 'e' &&
                    ch != 'u' && ch != 'i' &&
                    ch != 'o') {
                isNotVowel = true;

                while (isNotVowel) {
                    ch = Character.toLowerCase(str.charAt(i));

                    if(i == str.length() - 1) {

                        if (ch != 'a' && ch != 'e' &&
                                ch != 'u' && ch != 'i' &&
                                ch != 'o') {
                            temp.append(str.charAt(i));
                            isNotVowel = false;
                        } else {
                            i--;
                            isNotVowel = false;
                        }

                    } else if (ch != 'a' && ch != 'e' &&
                            ch != 'u' && ch != 'i' &&
                            ch != 'o') {
                        temp.append(str.charAt(i));
                        i++;

                    } else {
                        i--;
                        isNotVowel = false;
                    }
                }

                strAL.add(temp.toString());

            } else if(str.charAt(i) != ' ') {
                isVowel = true;

                while (isVowel) {
                    ch = Character.toLowerCase(str.charAt(i));

                    if(i == str.length() - 1) {

                        if (ch == 'a' || ch == 'e' ||
                                ch == 'u' || ch == 'i' ||
                                ch == 'o') {
                            temp.append(str.charAt(i));
                            isVowel = false;
                        } else {
                            i--;
                            isVowel = false;
                        }


                    } else if (ch == 'a' || ch == 'e' ||
                            ch == 'u' || ch == 'i' ||
                            ch == 'o') {
                        temp.append(str.charAt(i));
                        i++;

                    } else {
                        i--;
                        isVowel = false;
                    }
                }

                strAL.add(temp.toString());
            }

        }

        StringBuilder result = new StringBuilder();


        for(int i = 0; i < strAL.size(); i++) {
            temp = new StringBuilder();

            if(strAL.get(i).length() != 1) {
                for(int j = strAL.get(i).length() - 1; j >= 0; j--) {
                    temp.append(strAL.get(i).charAt(j));
                }
            } else {
                temp.append(strAL.get(i));
            }

            result.append(temp);
        }

        String strR = result.toString().replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");

        return strR;
    }
}
