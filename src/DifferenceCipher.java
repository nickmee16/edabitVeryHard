import java.util.Arrays;

public class DifferenceCipher {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(encrypt("Hello")));
        System.out.println(Arrays.toString(encrypt("Sunshine")));
        System.out.println(decrypt(new int[]{84, 27,  -2,  2,  3,  0,  -3,  8,  -75,  -12,  19,  -19,  80,  -3,  -77,  73,  5,  -78,  84,  -12,  -3,  -69,  71,  -6,  17,  -14,  1,  9,  -64 }));

    }

    public static int[] encrypt(String str) {

        int[] arr = new int[str.length()];
        arr[0] = (int) str.charAt(0);

        for(int i = 1; i < arr.length; i++) {
            arr[i] = (int) str.charAt(i) - str.charAt(i - 1);
        }

        return arr;
    }

    public static String decrypt(int[] arr) {

        String str = String.valueOf((char) arr[0]);
        char ch = (char) arr[0];

        for(int i = 1; i < arr.length; i++) {

            str += String.valueOf((char) ((int) ch + arr[i]));
            ch = (char) ((int) ch + arr[i]);
        }

        return str;
    }
}
