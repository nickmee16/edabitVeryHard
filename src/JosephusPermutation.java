import java.util.ArrayList;

public class JosephusPermutation {

    public static void main(String[] args) {

        System.out.println(whoGoesFree(9, 2));
        System.out.println(whoGoesFree(9, 3));
        System.out.println(whoGoesFree(7, 3));
        System.out.println(whoGoesFree(15, 4));
        System.out.println(whoGoesFree(53, 7));

    }

    public static int whoGoesFree(int n, int k) {
        ArrayList<Integer> prisoners = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            prisoners.add(i);
        }

        int count = 0;

        for (int i = 0; i < prisoners.size(); i++) {
            count++;
            if (count % k == 0) {

                prisoners.remove(i);
                i--;
            } else {
                prisoners.add(prisoners.get(i));
                prisoners.remove(i);
                i--;
            }


            if (prisoners.size() == 1) {
                break;
            }
        }

        return prisoners.get(0);
    }
}
