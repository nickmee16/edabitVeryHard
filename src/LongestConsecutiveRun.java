public class LongestConsecutiveRun {

    public static void main(String[] args) {

        System.out.println(longestRun(new int[]{1, 2, 3, 5, 6, 7, 8, 9}));
        System.out.println(longestRun(new int[]{10, 9, 8, 7, 6, 2, 1}));

    }

    public static int longestRun(int[] arr) {
        int countUp = 1;
        int countDown = 1;
        int run = 0;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] == arr[i - 1] + 1) {
                countUp++;
            } else {
                countUp = 1;
            }

            if(arr[i] == arr[i - 1] - 1) {
                countDown++;
            } else {
                countDown = 1;
            }

            if(countUp > run) {
                run = countUp;
            }

            if(countDown > run) {
                run = countDown;
            }
        }

        return run;
    }
}
