public class OneTimePadTrainingProgramPt1 {

    public static void main(String[] args) {

        System.out.println(encrypt("24955184247696969", "637197877682780836504704874690100607768768"));
        System.out.println(decrypt("6371956289367449331922", "637197877682780836504704874690100607768768"));
        System.out.println(decrypt("6371956289367449331922", "442878365779404250678127528855846163827272"));

    }

    public static String encrypt(String plncode, String pad) {
        String id = pad.substring(0, 5);
        pad = pad.substring(5);
        String code = "";
        int num1;
        int num2;

        for(int i = 0; i < plncode.length(); i++) {
            num1 = Character.getNumericValue(plncode.charAt(i));
            num2 = Character.getNumericValue(pad.charAt(i));
            if(num1 < num2) {
                num1 = num1 + 10;
            }

            code += (num1 - num2);
        }

        return id + code;
    }

    public static String decrypt(String cypcode, String pad) {
        if(!cypcode.substring(0, 5).equals(pad.substring(0, 5))) {
            return "Error: Key IDs don't match.";
        }
        cypcode = cypcode.substring(5);
        pad = pad.substring(5);

        String code = "";
        int num1;
        int num2;
        int sum;

        for(int i = 0; i < cypcode.length(); i++) {
            num1 = Character.getNumericValue(cypcode.charAt(i));
            num2 = Character.getNumericValue(pad.charAt(i));
            sum = num1 + num2;

            if(sum >= 10) {
                sum = sum % 10;
            }

            code += sum;
        }

        return code;
    }
}
