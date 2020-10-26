public class ValidName {

    public static void main(String[] args) {

        System.out.println(validName("H. Wells"));
        System.out.println(validName("H. G. Wells"));
        System.out.println(validName("Herbert G. Wells"));
        System.out.println(validName("Herbert"));
        System.out.println(validName("h. Wells"));
        System.out.println(validName("H Wells"));
        System.out.println(validName("H. George Wells"));
        System.out.println(validName("H. George W."));
        System.out.println(validName("Herb. George Wells"));

    }

    public static boolean validName(String str) {
        String[] nameSplit = str.split(" ");

        if (nameSplit.length == 1 || nameSplit.length > 3) {
            return false;
        }

        if (nameSplit[nameSplit.length - 1].length() == 1
                || nameSplit[nameSplit.length - 1].contains(".")
                || Character.isLowerCase(nameSplit[nameSplit.length - 1].charAt(0))) {
            return false;
        }


        if (nameSplit[0].length() == 1
                || Character.isLowerCase(nameSplit[0].charAt(0))
                || (nameSplit[0].length() > 2 && nameSplit[0].contains("."))) {
            return false;
        }

        if (nameSplit.length == 3) {
            if (nameSplit[1].length() == 1
                    || Character.isLowerCase(nameSplit[0].charAt(0))
                    || (nameSplit[0].length() > 2 && nameSplit[0].contains("."))
                    || (nameSplit[0].contains(".") && nameSplit[1].length() > 1 && !nameSplit[1].contains("."))) {
                return false;
            }
        }

        return true;
    }
}
