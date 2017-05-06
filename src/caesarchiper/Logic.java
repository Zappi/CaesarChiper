package caesarchiper;

public class Logic {

    public String encrypt(String text, int key) {

        String finalString = "";

        for (int i = 0; i < text.length(); i++) {

            int c1 = text.charAt(i);

            if (Character.isUpperCase(c1)) {
                c1 = c1 + (key % 26);

                if (c1 > 'Z') {
                    c1 = c1 - 26;
                }

            } else if(Character.isLowerCase(c1)) {
                c1=c1+(key%26);
                
                if(c1>'z') {
                    c1 = c1-26;
                }
            }
            finalString=finalString+(char)+c1;

        }
        
        return finalString;
    }

    

    public String decrypt(String text) {

        return "";
    }
}
