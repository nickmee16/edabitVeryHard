

public class RecursionArraySummation {

    public static void main(String[] args) {

        int[][] numVector = new int[][] {
                {1, 2, 3, 4, 10, 11}, {}, {-3, 4, 11, 10, 21, 32, -9}, {3, 7, -3, -7, 4, 6, -4, -6}, {16},
                {-21, -7, 19, 3, 4, -8}, {600, 20, 20, 20, 6, 4000}, {3, 2, 150, -25, 150, 72, 13, 6, 1}
        };

        System.out.println(recurAdd(numVector[0]));
        System.out.println(recurAdd(numVector[1]));
        System.out.println(recurAdd(numVector[2]));
        System.out.println(recurAdd(numVector[3]));
        System.out.println(recurAdd(numVector[4]));
        System.out.println(recurAdd(numVector[5]));
        System.out.println(recurAdd(numVector[6]));
        System.out.println(recurAdd(numVector[7]));

    }

    public static int recurAdd(int[] r) {
        int num = 0;

        for(int i = 0; i < r.length; i++) {
            num += r[i];
        }

        return num;
    }

}
