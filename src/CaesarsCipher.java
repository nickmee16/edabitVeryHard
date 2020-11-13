public class CaesarsCipher {

    public static void main(String[] args) {

        System.out.println(caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
        System.out.println(caesarCipher("middle-Outz",2));

    }

    public static String caesarCipher(String s, int k) {
        StringBuilder str = new StringBuilder();
        if(k > 26) {
            k = k % 26;
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isLetter(ch)) {
                if(Character.isLowerCase(ch)) {
                    if((int) ch + k > 122) {
                        str.append((char) ((int) ch + k - 26));
                    } else {
                        str.append((char) ((int) ch + k));
                    }

                } else {
                    if((int) ch + k > 97) {
                        str.append((char) ((int) ch + k - 26));
                    } else {
                        str.append((char) ((int) ch + k));
                    }
                }

            } else {
                str.append(ch);
            }
        }

        return str.toString();
    }
}
