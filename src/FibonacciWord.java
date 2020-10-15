public class FibonacciWord {

    public static void main(String[] args) {

        System.out.println(generate(7));

    }

    public static String generate(int n) {

        if(n < 2) {
            return "invalid";
        }

        String[] strArr = new String[n];
        strArr[0] = "b";
        strArr[1] = "a";

        for(int i = 2; i < n; i++) {
            strArr[i] = strArr[i - 1] + strArr[i - 2];
        }

        String str = "";

        for (int i = 0; i < strArr.length; i++) {
            if(i == strArr.length - 1) {
                str += strArr[i];
            } else {
                str += strArr[i] + ", ";
            }
        }

        return str;
    }
}
