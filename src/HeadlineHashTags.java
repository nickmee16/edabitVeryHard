import java.util.Arrays;
import java.util.Comparator;

public class HeadlineHashTags {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getHashTags("How the Avocado Became the Fruit of the Global Trade")));
        System.out.println(Arrays.toString(getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year")));

    }

    public static String[] getHashTags(String str) {
        String[] strSplit = str.split(" ");
        Arrays.sort(strSplit, Comparator.comparingInt(String::length).reversed());

        int length = 3;
        if(strSplit.length < 3) {
            length = strSplit.length;
        }

        String[] hasTags = new String[length];

        for(int i = 0; i < hasTags.length; i++) {
            hasTags[i] = "#" + strSplit[i].replaceAll("[^A-Za-z]+", "").toLowerCase();
        }


        return hasTags;
    }
}
