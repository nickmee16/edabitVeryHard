public class ChessPieces {

    public static void main(String[] args) {

        System.out.println(canMove("Rook", "A8", "H8"));
        System.out.println(canMove("Bishop", "A7", "G1"));
        System.out.println(canMove("Queen", "C4", "D6"));

    }

    public static boolean canMove(String piece, String current, String target) {

        if (piece.equals("Pawn")) {
            if (current.charAt(0) == target.charAt(0)) {

                if (current.charAt(1) == '2' && target.charAt(1) == '4') {
                    return true;
                }

                if (current.charAt(1) == '7' && target.charAt(1) == '5') {
                    return true;
                }

                if (Math.abs((int) current.charAt(1) - (int) target.charAt(1)) == 1) {
                    return true;
                }
            }
        }

        if (piece.equals("Knight")) {

            if (Math.abs((int) current.charAt(0) - (int) target.charAt(0)) == 2
                    && Math.abs((int) current.charAt(1) - (int) target.charAt(1)) == 1) {
                return true;
            }

            if (Math.abs((int) current.charAt(1) - (int) target.charAt(1)) == 2
                    && Math.abs((int) current.charAt(0) - (int) target.charAt(0)) == 1) {
                return true;
            }
        }

        if (piece.equals("Bishop")) {
            if (Math.abs((int) current.charAt(0) - (int) target.charAt(0)) == Math.abs((int) current.charAt(1) - (int) target.charAt(1))) {
                return true;
            }
        }

        if (piece.equals("Rook")) {
            if (current.charAt(0) == target.charAt(0)
                    || current.charAt(1) == target.charAt(1)) {
                return true;
            }
        }

        if (piece.equals("Queen")) {
            if (Math.abs((int) current.charAt(0) - (int) target.charAt(0)) == Math.abs((int) current.charAt(1) - (int) target.charAt(1))) {
                return true;
            }

            if (current.charAt(0) == target.charAt(0)
                    || current.charAt(1) == target.charAt(1)) {
                return true;
            }

        }

        if (piece.equals("King")) {
            if (Math.abs((int) current.charAt(0) - (int) target.charAt(0)) <= 1
                    && Math.abs((int) current.charAt(1) - (int) target.charAt(1)) <= 1) {
                return true;
            }
        }

        return false;
    }
}
