public class WeHaveAHouse {

    public static void main(String[] args) {

        System.out.println(weHaveHouse(8, 30, 32, 8));
        System.out.println(weHaveHouse(9, 14, 20, 9));
        System.out.println(weHaveHouse(9, 38, 36, 9));
        System.out.println(weHaveHouse(10, 31, 30, 11));
        System.out.println(weHaveHouse(8, 45, 42, 8));

    }

    public static String weHaveHouse(int hh, int hw, int hd, int rh) {

        if(hh + rh > 20) {
            return "No permission.";

        } else if(hw < 15 || hd < 11) {
            return "House too small.";

        } else if(hw > 44 || hd > 44) {
            return "House too big.";
        }

        int door = 7 * 3;
        int windows = 8 * 4 * 3;

        int gray = ((2 * hw) + (2 * (hw - 3)) + (2 * 2 * hd));
        int yellow = ((2 * hw * hh) + (2 * hd * hh) + (rh * hw))  - (door + windows + gray);

        return "Yellow: " + yellow + ", Gray: " + gray;
    }
}
