public class SherlockAndSquares {

    public static void main(String[] args) {

        System.out.println(squares(3, 9));
        System.out.println(squares(17, 24));
        System.out.println(squares(1, 1000000000));
        System.out.println(squares(50979851, 733216221));

    }

    public static int squares(int a, int b) {
        return (int) Math.sqrt(b) - (int) Math.ceil(Math.sqrt(a)) + 1;
    }
}
