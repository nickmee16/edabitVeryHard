public class RomanNumeralConverter {

    public static void main(String[] args) {

        System.out.println(convertToRoman(2));
        System.out.println(convertToRoman(12));
        System.out.println(convertToRoman(16));
        System.out.println(convertToRoman(798));
        System.out.println(convertToRoman(649));
        System.out.println(convertToRoman(68));
        System.out.println(convertToRoman(1000));


    }

    public static String convertToRoman(int num) {
        StringBuilder romanNum = new StringBuilder();

        if (num >= 1000) {
            while (num > 999) {
                num -= 1000;
                romanNum.append("M");
            }
        }

        if (num >= 900) {
            num -= 900;
            romanNum.append("CM");

        } else if (num >= 600) {
            romanNum.append("D");
            while (num > 600) {
                num -= 100;
                romanNum.append("C");
            }
            num -= 500;

        } else if (num >= 500) {
            num -= 100;
            romanNum.append("C");

        } else if (num >= 400) {
            num -= 400;
            romanNum.append("CD");

        } else if (num >= 100) {
            while (num > 100) {
                num -= 100;
                romanNum.append("C");
            }
        }


        if (num >= 90) {
            num -= 90;
            romanNum.append("XC");

        } else if (num >= 60) {
            romanNum.append("L");
            while (num > 60) {
                num -= 10;
                romanNum.append("X");
            }
            num -= 50;

        } else if (num >= 50) {
            while (num > 50) {
                num -= 50;
                romanNum.append("L");
            }
        } else if (num >= 40) {
            num -= 40;
            romanNum.append("XL");
        }

        if (num >= 10) {
            while (num > 10) {
                num -= 10;
                romanNum.append("X");
            }
        }


        if (num >= 9) {
            num -= 9;
            romanNum.append("IX");

        } else if (num >= 6) {

            romanNum.append("V");
            while (num > 6) {
                num -= 1;
                romanNum.append("I");
            }
            num -= 5;

        } else if (num == 5) {
            num -= 5;
            romanNum.append("V");

        } else if (num == 4) {
            num -= 4;
            romanNum.append("IV");
        }

        if (num >= 1) {
            while (num > 0) {
                num -= 1;
                romanNum.append("I");
            }
        }


        return romanNum.toString();
    }
}
