public class ConsecutiveNumberSeries {

    public static void main(String[] args) {

        System.out.println(isConsecutive("121314151617"));
        System.out.println(isConsecutive("123124125"));
        System.out.println(isConsecutive("32332432536"));
        System.out.println(isConsecutive("326325324323"));
        System.out.println(isConsecutive("667666"));
        System.out.println(isConsecutive("999897959493"));

    }

    public static boolean isConsecutive(String s) {
        boolean isCorrect = true;
        int l = 1;

        while (l <= s.length() / 2) {

            if(s.length() % l == 0) {

                int temp = Integer.parseInt(s.substring(0, l));
                isCorrect = true;

                for (int i = l; i < s.length(); i += l) {

                    if (temp + 1 != Integer.parseInt(s.substring(i, i + l))) {
                        isCorrect = false;
                        break;
                    }

                    temp = Integer.parseInt(s.substring(i, i + l));
                }
            }

            if(isCorrect) {
                break;

            } else {
                l++;
            }
        }

        if(isCorrect) {
            return true;
        }

        l = 1;

        while (l <= s.length() / 2) {

            if(s.length() % l == 0) {

                int temp = Integer.parseInt(s.substring(0, l));
                isCorrect = true;

                for (int i = l; i < s.length(); i += l) {

                    if (temp - 1 != Integer.parseInt(s.substring(i, i + l))) {
                        isCorrect = false;
                        break;
                    }

                    temp = Integer.parseInt(s.substring(i, i + l));
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
