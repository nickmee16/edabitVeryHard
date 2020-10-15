import java.util.ArrayList;
import java.util.Collections;

public class BooksAndBookEnds {

    public static void main(String[] args) {

        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
        System.out.println(countUniqueBooks("$AA$BBCATT$C$$B$", '$'));
        System.out.println(countUniqueBooks("ZZABCDEF", 'Z'));

    }

    public static int countUniqueBooks(String str, char bookend) {

        ArrayList<Character> chars = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == bookend) {

                for(int j = i + 1; j < str.length(); j++) {

                    if(str.charAt(j) != bookend) {
                        chars.add(str.charAt(j));

                    } else {
                        i = j;
                        break;
                    }
                }
            }
        }

        if(chars.size() == 0) {
            return 0;
        }

        if(chars.size() == 1) {
            return 1;
        }

        Collections.sort(chars);
        int count = 1;

        for(int i = 1; i < chars.size(); i++) {
            if(chars.get(i) != chars.get(i - 1)) {
                count++;
            }
        }


        return count;
    }
}
