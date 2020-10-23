public class IsItAValidRGBAColor {

    public static void main(String[] args) {

        System.out.println(validColor("rgb(0,0,0)"));
        System.out.println(validColor("rgb(0,,0)"));
        System.out.println(validColor("rgb(255,256,255)"));
        System.out.println(validColor("rgba(0,0,0,0.123456789)"));
        System.out.println(validColor("rgb(100%,100%,101%)"));
        System.out.println(validColor("rgba(	0 , 127	, 255 , 0.1	)"));
        System.out.println(validColor("rgba(0,0,0,-1)"));


    }

    public static boolean validColor(String color) {
        boolean isCorrect = true;

        if(color.substring(0,5).equals("rgba(")) {
            String[] colorsSplit = color.substring(5, color.length() - 1).split(",");

            if(colorsSplit.length != 4) {
                return false;
            }

            for(int i = 0; i < colorsSplit.length - 1; i++) {

                if(colorsSplit[i].equals("")) {
                    isCorrect = false;
                    break;
                }

                if(Integer.parseInt(colorsSplit[i].trim()) < 0 ||  Integer.parseInt(colorsSplit[i].trim()) > 255) {
                    isCorrect = false;
                    break;
                }
            }

            if(colorsSplit[3].contains("-")) {
                return false;
            }

            if(Double.parseDouble("0" + colorsSplit[3].trim()) < 0.0 || Double.parseDouble("0" + colorsSplit[3].trim()) > 1.0) {
                isCorrect = false;
            }

            return isCorrect;

        } else if(color.substring(0,4).equals("rgb(")) {

            if(color.substring(4, color.length() - 1).contains("%")) {

                color = color.replaceAll("%", "");

                String[] colorsSplit = color.substring(4, color.length() - 1).split(",");

                if(colorsSplit.length != 3) {
                    return false;
                }


                for(int i = 0; i < colorsSplit.length; i++) {
                    if(Integer.parseInt(colorsSplit[i].trim()) < 0 ||  Integer.parseInt(colorsSplit[i].trim()) > 100) {
                        isCorrect = false;
                        break;
                    }
                }

                return isCorrect;
            }

            String[] colorsSplit = color.substring(4, color.length() - 1).split(",");

            if(colorsSplit.length != 3) {
                return false;
            }

            for(int i = 0; i < colorsSplit.length; i++) {
                if(colorsSplit[i].equals("") || colorsSplit[i].equals(" ")) {
                    isCorrect = false;
                    break;
                }

                if(Integer.parseInt(colorsSplit[i].trim()) < 0 ||  Integer.parseInt(colorsSplit[i].trim()) > 255) {
                    isCorrect = false;
                    break;
                }
            }

            return isCorrect;
        }

        return false;
    }
}
