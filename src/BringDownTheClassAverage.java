public class BringDownTheClassAverage {

    public static void main(String[] args) {

        System.out.println(takeDownAverage(new String[]{"95%", "83%", "90%", "87%", "88%", "93%"}));
    }

    public static String takeDownAverage(String[] scores) {
        int sum = 0;

        for(int i = 0; i < scores.length; i++) {
            sum += Integer.parseInt(scores[i].replaceAll("%", ""));
        }

        double nums = scores.length;

        double result = sum / nums;

        int x = (int) Math.round((result - 5) * (nums + 1)) - sum;

        return x + "%";
    }
}
