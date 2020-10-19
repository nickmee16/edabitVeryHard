public class SlopeToAngleConversion {

    public static void main(String[] args) {

        System.out.println(convert(1));
        System.out.println(convert(0));
        System.out.println(convert(-1));
        System.out.println(convert(3));
        System.out.println(convert(100));
        System.out.println(convert(-20));

    }

    public static int convert(int slope) {

        return 90 - (int) Math.round(Math.toDegrees(Math.atan(slope)));
    }
}
