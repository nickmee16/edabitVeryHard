public class MinimumSwapsToAlternateABinaryString {

    public static void main(String[] args) {

        System.out.println(minSwaps("101010"));
        System.out.println(minSwaps("10001110"));
        System.out.println(minSwaps("11110000"));

        System.out.println(minSwaps("100101"));
        System.out.println(minSwaps("11000000011111"));

    }

    public static int minSwaps(String str) {
        StringBuilder alternatingLeadingOne = new StringBuilder();
        StringBuilder alternatingLeadingZero = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                alternatingLeadingOne.append(1);
            } else {
                alternatingLeadingOne.append(0);
            }
        }

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                alternatingLeadingZero.append(0);
            } else {
                alternatingLeadingZero.append(1);
            }
        }

        int countDiffOne = 0;
        int countDiffZero = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != alternatingLeadingOne.charAt(i)) {
                countDiffOne++;
            }

            if(str.charAt(i) != alternatingLeadingZero.charAt(i)) {
                countDiffZero++;
            }
        }

        countDiffOne /= 2;
        countDiffZero /= 2;

        return (countDiffOne < countDiffZero) ? countDiffOne : countDiffZero;

    }
}
