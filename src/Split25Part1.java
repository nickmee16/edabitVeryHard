public class Split25Part1 {

    public static void main(String[] args) {

        System.out.println(split(5));
        System.out.println(split(10));
        System.out.println(split(1));
        System.out.println(split(25));
        System.out.println(split(15));
        System.out.println(split(20));

    }

    public static int split(int num) {
        int count = 0;
        int temp;
        int result = 1;
        int resultTemp;

        for(int i = 0; i < num; i++) {
            count++;
            temp = 1;
            resultTemp = 0;

            for(int j = count; j <= num; j += count) {

                if(count + j > num) {
                    temp *= count;

                    if(resultTemp < temp * (num - j)) {
                        resultTemp = temp * (num - j);
                    }
                    break;

                } else {
                    temp *= count;

                    if(resultTemp < temp * (num - j)) {
                        resultTemp = temp * (num - j);
                    }
                }
            }

            if(resultTemp > result) {
                result = resultTemp;
            }
        }

        return result;
    }
}
