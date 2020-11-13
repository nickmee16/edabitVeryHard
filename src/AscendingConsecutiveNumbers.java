public class AscendingConsecutiveNumbers {

    public static void main(String[] args) {

        System.out.println(ascending("232425"));
        System.out.println(ascending("2324256"));
        System.out.println(ascending("444445"));
        System.out.println(ascending("1234567"));
        System.out.println(ascending("1235"));
        System.out.println(ascending("1234567"));

    }

    public static boolean ascending(String str) {
        int temp;
        int count;
        boolean isCorrect = true;

        for (int i = 0; i < str.length() - 1; i++) {

            if (Character.getNumericValue(str.charAt(i)) != Character.getNumericValue(str.charAt(i + 1)) - 1) {
                isCorrect = false;
            }
        }

        if (isCorrect) {
            return true;
        }


        for (int i = 2; i <= str.length() / 2; i++) {
            isCorrect = true;
            temp = Integer.parseInt(str.substring(0, i));
            count = i;

            if (str.length() % i != 0) {
                isCorrect = false;
            } else {

                for (int j = i + i; j <= str.length(); j += i) {

                    if (count + i >= str.length() && Integer.parseInt(str.substring(count)) != temp + 1) {

                        isCorrect = false;
                        break;
                    }

                    if (Integer.parseInt(str.substring(count, j)) != temp + 1) {

                        isCorrect = false;
                        break;
                    }

                    temp = Integer.parseInt(str.substring(count, j));
                    count += i;
                }

                if (isCorrect) {
                    break;
                }
            }
        }

        return isCorrect;
    }
}
