public class BitRotation {

    public static void main(String[] args) {

        System.out.println(bitRotate(8, 1, true));
        System.out.println(bitRotate(16, 1, false));
        System.out.println(bitRotate(17, 2, false));
        System.out.println(bitRotate(125, 10, true));

    }

    public static int bitRotate(int n, int m, boolean d) {
        String strNBinary = Integer.toBinaryString(n);

        if(m > strNBinary.length()) {
            m = m - strNBinary.length();
        }

        strNBinary = (d) ? strNBinary.substring(strNBinary.length() - m) + strNBinary.substring(0, strNBinary.length() - m)
                : strNBinary.substring(m) + strNBinary.substring(0, m);

        return Integer.parseInt(strNBinary, 2);

    }
}
