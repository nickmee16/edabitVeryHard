import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    public static void main(String[] args) {

        System.out.println(strongPassword("Ed1"));
        System.out.println(strongPassword("#Edabit"));
        System.out.println(strongPassword("W1llth!spass?"));

    }

    public static int strongPassword(String password) {
        int count = 0;

        Pattern p = Pattern.compile("[\\p{Alpha}]*[\\p{Punct}][\\p{Alpha}]*");
        Matcher special = p.matcher(password);
        boolean specialB = special.find();

        if(!specialB) {
            count++;
        }


        if(!password.matches(".*[A-Z].*")) {
            count++;
        }

        if(!password.matches(".*[a-z].*")) {
            count++;
        }

        if(!password.matches(".*\\d.*")) {
            count++;
        }


        int temp = 0;

        if(password.length() < 6) {
            temp = 6 - password.length();
        }

        if(temp > count) {
            count = temp;
        }

        return count;
    }
}
