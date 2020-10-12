public class CompleteTheWord {

    public static void main(String[] args) {

        System.out.println(canComplete("butl", "beautiful"));
        System.out.println(canComplete("butlz", "beautiful"));
        System.out.println(canComplete("tulb", "beautiful"));
        System.out.println(canComplete("bbutl", "beautiful"));

    }

    public static boolean canComplete(String initial, String word) {

        int count = 0;
        int temp = 0;

        for(int i = 0; i < initial.length(); i++) {

            for(int j = temp; j < word.length(); j++) {

                if(initial.charAt(i) == word.charAt(j)) {
                    count++;
                    temp = j + 1;
                    break;
                }
            }
        }

        if(count == initial.length()) {
            return true;
        }

        return false;
    }
}
