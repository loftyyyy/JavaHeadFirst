package com.mycompany.app;
import java.util.*;

public class CaesarCypher {

    public static void main(String[] args){
        String[] alphabetCSV = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet = "abcdefghijklmnopgrstuvwxyz";
        String encryptedMessage = "";
        Scanner input = new Scanner(System.in);
        System.out.print("How many shifts? ");
        int shift = input.nextInt();
        input.nextLine();
        System.out.print("To Encrypt: ");
        String message = input.nextLine();
        String[] messageList = message.split("");

//        for(int i = 0; i < messageList.length; i++){
//            if(messageList[i].equals(" ")){
//                encryptedMessage += " ";
//            }else{
//                encryptedMessage += alphabetCSV[(alphabet.indexOf(messageList[i]) + shift) % 26];
////                System.out.println(alphabetCSV[(alphabet.indexOf(messageList[i].toUpperCase()) + shift) % 26]);
//            }
//        }


        for(int i = 0; i < message.length(); i++){
            if(Character.isWhitespace(message.charAt(i))){
                encryptedMessage += ' ';
            }else{
                if(Character.isUpperCase(message.charAt(i))){
                    int pos = ALPHABET.indexOf(message.charAt(i));
                    int encryptedPos = (pos + shift) % 26;
                    encryptedMessage +=  ALPHABET.charAt(encryptedPos);
                }else if(Character.isLowerCase(message.charAt(i))){
                    int pos = alphabet.indexOf(message.charAt(i));
                    int encryptedPos = (pos + shift) % 26;
                    encryptedMessage +=  alphabet.charAt(encryptedPos);
                }
            }
        }

        System.out.println(encryptedMessage);

        // Formula (x + n) % 26



//        for(String message : messageArray){
//            if(message.equals(" ")){
//                encryptedMessage += " ";
//            }else{
//
//            }
//        }




    }
}
