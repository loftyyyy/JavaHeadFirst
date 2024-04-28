package com.mycompany.app;

import java.util.Scanner;

public class Decrypt {
    String message;
    int shift;

    public Decrypt(String message, int shift){
        this.message = message;
        this.shift = shift;

        decryptingProcess();
    }

    private void decryptingProcess(){

        String decryptedMessage = "";

        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) == ' '){

                decryptedMessage += ' ';
            }else{
                if(Character.isUpperCase(message.charAt(i))){
                    int pos = CONSTANTS.ALPHABET.indexOf(message.charAt(i));
                    int decryptedPos = (pos - shift) % 26;
                    decryptedMessage += CONSTANTS.ALPHABET.charAt(decryptedPos);
                }else if(Character.isLowerCase(message.charAt(i))){

                    int pos = CONSTANTS.alphabet.indexOf(message.charAt(i));
                    int decryptedPos = (pos - shift) % 26;
                    decryptedMessage += CONSTANTS.alphabet.charAt(decryptedPos);
                }
            }
        }

        System.out.println("Decrypted Message: " + decryptedMessage);

    }
}
