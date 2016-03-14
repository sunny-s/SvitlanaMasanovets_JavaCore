/**
 * Created by svitlana.masanovets on 3/13/2016.
 */
public class TextWrapper {

    String inputStr = "";

    private String wrap() {
        if (inputStr != null) {
            if (inputStr != "") {
                String outputStr = Character.toString(inputStr.charAt(0));
                int i, counter = 1;
                outer:
                for (i = 0; i < inputStr.length() - 1; i++) {
                    if (inputStr.charAt(i) == inputStr.charAt(i + 1)) {
                        counter++;
                        continue outer;
                    }

                    if (counter == 1) {
                        outputStr = outputStr + Character.toString(inputStr.charAt(i + 1));
                    } else {
                        outputStr = outputStr + Integer.toString(counter) + Character.toString(inputStr.charAt(i + 1));
                        counter = 1;
                    }
                }
                if (counter != 1) {
                    outputStr = outputStr + Integer.toString(counter);
                }
                return outputStr;
            }
            return "";
        }
        return null;
    }

    private String unwrap() {
        if (inputStr != null) {
            if (inputStr != "") {
                String outputStr = Character.toString(inputStr.charAt(0));
                int i;
                String temp = "";
                char startChar = inputStr.charAt(1);
                outer:
                for (i = 1; i < inputStr.length(); i++) {
                    if (inputStr.charAt(i) >= '0' && inputStr.charAt(i) <= '9' && startChar != ' ') {
                        temp = temp + Character.toString(inputStr.charAt(i));
                        continue outer;
                    }

                    if (temp != "") {
                        int intvar = Integer.valueOf(temp);
                        for (int j = 1; j < intvar; j++) {
                            outputStr = outputStr + Character.toString(startChar);
                        }
                        temp = "";
                        startChar = inputStr.charAt(i);
                        outputStr = outputStr + Character.toString(startChar);

                    } else {
                        startChar = inputStr.charAt(i);
                        outputStr = outputStr + Character.toString(startChar);
                    }

                }
                return outputStr;
            }
            return "";
        }
        return null;


    }

    public static void main(String[] args) {
        TextWrapper check = new TextWrapper();
        System.out.println(check.unwrap());
        System.out.println(check.wrap());

    }
}

