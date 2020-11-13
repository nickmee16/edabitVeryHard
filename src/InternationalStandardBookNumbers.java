public class InternationalStandardBookNumbers {

    public static void main(String[] args) {

//        System.out.println(isbn13("9780316066525"));
//        System.out.println(isbn13("0330301824"));
//        System.out.println(isbn13("0316066524"));
        System.out.println(isbn13("817450494X"));

    }

    public static String isbn13(String str) {
        if (str.length() != 10 && str.length() != 13) {
            return "Invalid";
        }

        int num = 0;

        if (str.length() == 10) {
            for (int i = 0; i < str.length(); i++) {
                if (i == str.length() - 1 && str.charAt(i) == 'X') {
                    System.out.println(i);
                    num += 10;
                } else {
                    System.out.println(i);
                    num += Character.getNumericValue(str.charAt(i)) * (10 - i);
                }

            }

            if (num % 11 != 0) {
                return "Invalid";
            }

            str = 978 + str;
            num = 0;

            for (int i = 0; i < str.length(); i++) {

                if (i % 2 == 0) {
                    num += Character.getNumericValue(str.charAt(i));

                } else {
                    num += Character.getNumericValue(str.charAt(i)) * 3;
                }
            }

            System.out.println(num);

            if (num % 10 == 0) {
                return str;
            } else {
                int left = num % 10;
                    System.out.println(left);
                System.out.println(Character.getNumericValue(str.charAt(str.length() - 1)));

                return str.substring(0, str.length() - 1) + ((10 - left) + Character.getNumericValue(str.charAt(str.length() - 1))) % 10;

            }
        }

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                num += Character.getNumericValue(str.charAt(i));

            } else {
                num += Character.getNumericValue(str.charAt(i)) * 3;
            }
        }

        if (num % 10 == 0) {
            return "Valid";
        }

        return "Invalid";
    }
}
