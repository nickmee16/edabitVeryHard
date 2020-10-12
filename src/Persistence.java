public class Persistence {

    public static void main(String[] args) {

        System.out.println(additivePersistence(1679583));
        System.out.println(additivePersistence(123456)  );
        System.out.println(multiplicativePersistence(77));
        System.out.println(multiplicativePersistence(123456));
        System.out.println(multiplicativePersistence(277777788888899L));
        System.out.println((long) 2 * 7* 7* 7* 7* 7* 7* 8 *8 *8 *8 * 8* 8* 9 *9);

    }

    public static int additivePersistence(int n) {

        if(n < 10) {
            return 0;
        }

        String strN = Integer.toString(n);
        int newN;
        int count = 0;

        boolean isPossible = true;

        while (isPossible) {
            newN = 0;

            for(int i = 0; i < strN.length(); i++) {
                newN += Integer.parseInt(String.valueOf(strN.charAt(i)));
            }

            if(newN < 10) {
                count++;
                isPossible = false;

            } else {
                count++;
                strN = Integer.toString(newN);
            }
        }

        return count;
    }

    public static int multiplicativePersistence(long n) {

        if(n < 10) {
            return 0;
        }

        String strN = Long.toString(n);
        long newN;
        int count = 0;

        boolean isPossible = true;

        while (isPossible) {
            newN = 1;

            for(int i = 0; i < strN.length(); i++) {
                newN *= Long.parseLong(String.valueOf(strN.charAt(i)));
            }

            if(newN < 10) {
                count++;
                isPossible = false;

            } else {
                count++;
                strN = Long.toString(newN);
            }
        }

        return count;
    }
}
