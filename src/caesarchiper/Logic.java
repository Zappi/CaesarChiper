package caesarchiper;

public class Logic {

    public String encrypt(String text, int key) {

        String finalString = "";

        for (int i = 0; i < text.length(); i++) {

            int asciiValue = text.charAt(i);

            if (Character.isUpperCase(asciiValue)) {
                asciiValue = asciiValue + (key % 26);

                if (asciiValue > 'Z') {
                    asciiValue = asciiValue - 26;
                }

            } else if (Character.isLowerCase(asciiValue)) {
                asciiValue = asciiValue + (key % 26);

                if (asciiValue > 'z') {
                    asciiValue = asciiValue - 26;
                }
            }
            finalString = finalString + (char) +asciiValue;

        }

        return finalString;
    }

    public String decrypt(String text, int key) {

        String decrypt="";
        for (int i = 0; i < text.length(); i++) {
            
            int asciiValue = text.charAt(i);
            
            if(Character.isUpperCase(asciiValue)) {
                asciiValue = asciiValue-(key%26);
                
                if(asciiValue < 'A') 
                    asciiValue+=26;
            } else if(Character.isLowerCase(asciiValue)) {
                asciiValue=asciiValue-(key%26);
                
                if(asciiValue<'a') {
                    asciiValue+=26;
                }
            }
            
            decrypt+=(char)asciiValue;
            
        }
        
        return decrypt;
    }
}
