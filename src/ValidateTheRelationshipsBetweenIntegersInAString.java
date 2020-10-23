public class ValidateTheRelationshipsBetweenIntegersInAString {

    public static void main(String[] args) {

        System.out.println(validateTheRelationships("5>-1<0=0<-5>5=5"));
        System.out.println();
        System.out.println(validateTheRelationships("-15<-10<=0=0<5"));
        System.out.println();
        System.out.println(validateTheRelationships("0=807<1000<=1000>9990<-3605<=20"));

    }

    public static boolean validateTheRelationships(String str) {
        boolean isCorrect = true;
        String num1;
        String num2;
        String symbol;
        int count;
        int temp1;
        int temp2;


        for(int i = 0; i < str.length(); i++) {
            count = 0;
            num1 = "";
            num2 = "";
            symbol = "";

            if(Character.isDigit(str.charAt(i)) || str.charAt(i) == '-') {
                num1 += str.charAt(i);
                count++;

                for(int j = i + 1; j < str.length(); j++) {
                    if(!Character.isDigit(str.charAt(j))) {
                        break;
                    }
                    num1 += str.charAt(j);
                    count++;
                }
            }

            i += count;
            count = 0;

            if(!Character.isDigit(str.charAt(i)) && str.charAt(i) != '-') {
                symbol += str.charAt(i);
                count++;

                for(int j = i + 1; j < str.length(); j++) {
                    if(!Character.isDigit(str.charAt(j)) && str.charAt(j) != '-') {
                        symbol += str.charAt(j);
                        count++;
                    }
                    break;
                }
            }

            i += count;
            count = 0;

            if(Character.isDigit(str.charAt(i)) || str.charAt(i) == '-') {
                num2 += str.charAt(i);
                count++;

                for(int j = i + 1; j < str.length(); j++) {
                    if(!Character.isDigit(str.charAt(j))) {
                        break;
                    }
                    num2 += str.charAt(j);
                    count++;
                }
            }

            temp1 = Integer.parseInt(num1);
            temp2 = Integer.parseInt(num2);

            if(symbol.equals("=") && temp1 != temp2) {
                isCorrect = false;
                break;
            } else if(symbol.equals("<") && temp1 >= temp2) {
                isCorrect = false;
                break;
            } else if(symbol.equals(">") && temp1 <= temp2) {
                isCorrect = false;
                break;
            } else if(symbol.equals("<=") && temp1 > temp2) {
                isCorrect = false;
                break;
            } else if(symbol.equals(">=") && temp1 < temp2) {
                isCorrect = false;
                break;
            }

            i--;

            if(i + count == str.length() - 1) {
                break;
            }

        }

        return isCorrect;
    }
}
