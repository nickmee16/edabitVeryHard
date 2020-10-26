import java.util.Arrays;

public class QuadSequence {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(quadSequence(new int[]{48,65,84})));
        System.out.println(Arrays.toString(quadSequence(new int[]{9,20,33,48})));
        System.out.println(Arrays.toString(quadSequence(new int[]{0,1,6,15,28})));
        System.out.println(Arrays.toString(quadSequence(new int[]{-3, 8, 23, 42, 65})));

    }

    public static int[] quadSequence(int[] args) {
        int diff1 = args[args.length - 1] - args[args.length - 2];
        int diff2 = args[args.length - 2] - args[args.length - 3];
        int n = diff1 - diff2;
        int element = args[args.length - 1];

        int[] contSequence = new int[args.length];

        for(int i = 0; i < contSequence.length; i++) {
            contSequence[i] = element + diff1 + n;
            diff1 = contSequence[i] - element;
            element = contSequence[i];
        }

        return contSequence;
    }
}
