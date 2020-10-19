public class NewNumbers {

    public static void main(String[] args) {

//        System.out.println(isNew(3));
//        System.out.println(isNew(30));
//        System.out.println(isNew(321));
//        System.out.println(isNew(123));
//        System.out.println(isNew(125609));
        System.out.println(isNew(40003));

    }

    public static boolean isNew(int num) {
        String strNum = Integer.toString(num);

        if(strNum.length() == 1 || (strNum.length() == 2 && strNum.contains("0"))) {
            return true;
        }

        boolean isCorrect = true;
        int count;

        for(int i = 0; i < strNum.length() - 1; i++) {
            count = 1;

            if(i + count == 1 && strNum.charAt(i + count) == '0') {

                boolean isZero = true;
                while (isZero) {

                    if(strNum.charAt(i + count) != '0') {
                        isZero = false;
                    } else {
                        count++;
                    }
                }
            }

            if(strNum.charAt(i) > strNum.charAt(i + count)) {
                isCorrect = false;
                break;
            }

            i += count - 1;
        }

        return isCorrect;
    }
}
