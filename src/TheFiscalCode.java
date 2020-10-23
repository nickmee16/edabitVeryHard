public class TheFiscalCode {

    public static void main(String[] args) {

        System.out.println(fiscalCode("Brendan", "Eich", "M", "1/12/1961"));

    }

    static final String[] months = {"","A","B","C","D","E","H","L","M","P","R","S","T"};

    public static String fiscalCode(String name, String surName, String gender, String dob) {
        name = name.toLowerCase();
        surName = surName.toLowerCase();

        String TFC;

        String tfcSN;
        String tfcSNConsonants = "";
        String tfcSNVowels = "";

        for(int i = 0; i < surName.length(); i++) {
            char chTemp = surName.charAt(i);

            if(chTemp != 'a' && chTemp != 'e' && chTemp != 'u' &&
                    chTemp != 'i' && chTemp != 'o') {
                tfcSNConsonants += String.valueOf(Character.toUpperCase(chTemp));

            } else {
                tfcSNVowels += String.valueOf(Character.toUpperCase(chTemp));
            }
        }

        if(surName.length() < 3) {
            tfcSN = tfcSNConsonants + tfcSNVowels + "X";

        } else if(surName.length() == 3) {
            tfcSN = tfcSNConsonants + tfcSNVowels;

        } else {
            if(tfcSNConsonants.length() < 3) {
                tfcSN = tfcSNConsonants + tfcSNVowels.charAt(0);

            } else if(tfcSNConsonants.length() == 3) {
                tfcSN = tfcSNConsonants;

            } else {
                tfcSN = tfcSNConsonants.substring(0, 3);
            }
        }

        String tfcN;
        String tfcNConsonants = "";
        String tfcNVowels = "";


        for(int i = 0; i < name.length(); i++) {
            char chTemp = name.charAt(i);

            if(chTemp != 'a' && chTemp != 'e' && chTemp != 'u' &&
                    chTemp != 'i' && chTemp != 'o') {
                tfcNConsonants += String.valueOf(Character.toUpperCase(chTemp));

            } else {
                tfcNVowels += String.valueOf(Character.toUpperCase(chTemp));
            }
        }

        if(name.length() < 3) {
            tfcN = tfcNConsonants + tfcNVowels + "X";

        } else if(name.length() == 3) {
            tfcN = tfcNConsonants + tfcNVowels;

        } else {
            if(tfcNConsonants.length() < 3) {
                tfcN = tfcNConsonants + tfcNVowels.charAt(0);

            } else if(tfcNConsonants.length() == 3) {
                tfcN = tfcNConsonants;

            } else {
                tfcN = tfcNConsonants.charAt(0) + tfcNConsonants.substring(2, 4);
            }
        }

        String[] dateBirth = dob.split("/");
        String tfcDOBG = dateBirth[2].substring(2) + months[Integer.parseInt(dateBirth[1])];

        if(gender.equals("M")) {
            if(Integer.parseInt(dateBirth[0]) < 10) {
                tfcDOBG += "0" + dateBirth[0];
            } else {
                tfcDOBG += dateBirth[0];
            }
        } else {
            tfcDOBG += (Integer.parseInt(dateBirth[0]) + 40);
        }

        TFC = tfcSN + tfcN + tfcDOBG;

        return TFC;
    }
}
