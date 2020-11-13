public class ConsecutiveAscendingNumbers {

    public static void main(String[] args) {

    }

    public static boolean ascending(String str) {
        boolean isCorrect = true;
        int l = 1;

        while (l <= str.length() / 2) {

            if(str.length() % l == 0) {

                int temp = Integer.parseInt(str.substring(0, l));
                isCorrect = true;

                for (int i = l; i < str.length(); i += l) {

                    if (temp + 1 != Integer.parseInt(str.substring(i, i + l))) {
                        isCorrect = false;
                        break;
                    }

                    temp = Integer.parseInt(str.substring(i, i + l));
                }
            }

            if(isCorrect) {
                break;

            } else {
                l++;
            }
        }

        return isCorrect;
    }
}
