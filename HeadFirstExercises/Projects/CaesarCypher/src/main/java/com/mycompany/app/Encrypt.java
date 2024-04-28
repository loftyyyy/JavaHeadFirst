package com.mycompany.app;

import java.util.Scanner;

import java.util.*;
public class Encrypt {
    String message;
    int shift;

    public Encrypt(String message, int shift){
        this.message = message;
        this.shift = shift;

        encryptingProcess();
    }

    private void encryptingProcess(){
        String encryptedMessage = "";
        Scanner input = new Scanner(System.in);
        System.out.print("How many shifts? ");
        int shift = input.nextInt();
        input.nextLine();
        System.out.print("To Encrypt: ");
        String message = input.nextLine();

        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) == ' '){
                encryptedMessage += " ";
            }else{
                if(Character.isUpperCase(message.charAt(i))){
                    int pos = CONSTANTS.ALPHABET.indexOf(message.charAt(i));
                    int encryptedPos = (pos + shift) % 26;
                    encryptedMessage += CONSTANTS.ALPHABET.charAt(encryptedPos);

                }else if(Character.isLowerCase(message.charAt(i))){

                    int pos = CONSTANTS.alphabet.indexOf(message.charAt(i));
                    int encryptedPos = (pos + shift) % 26;
                    encryptedMessage += CONSTANTS.alphabet.charAt(encryptedPos);
                }
            }

        }
        System.out.println("The encrypted Message is: " + encryptedMessage);
    }
}
