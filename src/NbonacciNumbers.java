public class NbonacciNumbers {

    public static void main(String[] args) {

        System.out.println(bonacci(1, 10));
        System.out.println(bonacci(2, 10));
        System.out.println(bonacci(3, 10));
        System.out.println(bonacci(4, 10));
        System.out.println(bonacci(5, 10));

    }

    public static long bonacci(int N, int k) {
        if(N == 1) {
            return 1;
        }

        if(N > k) {
            return 0;
        }

        long[] num = new long[k];

        for(int i = 0; i < N - 1; i++) {
            num[i] = 0;
        }

        num[N - 1] = 1;

        for(int i = N; i < k; i++) {
            for(int j = i - 1; j >= i - N; j--) {
                num[i] += num[j];
            }
        }

        return num[k - 1];
    }
}
