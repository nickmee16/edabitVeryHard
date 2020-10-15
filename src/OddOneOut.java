import java.util.Arrays;

public class OddOneOut {

    public static void main(String[] args) {

        System.out.println(oddOneOut(new String[]{"silly", "mom", "let", "the"}));
        System.out.println(oddOneOut(new String[]{"swanky", "rhino", "moment"}));
        System.out.println(oddOneOut(new String[]{"the", "them", "theme"}));

    }

    public static boolean oddOneOut(String[] arr) {

        int[] intArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            intArr[i] = arr[i].length();
        }

        Arrays.sort(intArr);

        int temp = intArr[0];
        int count = 1;
        int diffNums = 1;

        for(int i = 1; i < intArr.length; i++) {
            if(intArr[i] == temp) {
                count++;
            }
            if(intArr[i - 1] != intArr[i]) {
                diffNums++;
            }
        }

        if(diffNums > 2) {
            return false;
        }

        if(count == 1 || count == intArr.length - 1) {
            return true;
        }

        return false;
    }
}
