package com.mycompany.app;
import java.util.*;

public class CaesarCypher {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("What's the message? ");
        String message = input.nextLine();
        System.out.print("The amount of shift? ");
        int shift = input.nextInt();
        input.nextLine();

        System.out.print("What do you want to do? \n [1] Encrypt: \n [2] Decrypt: \n Choice[1,2]: ");
        String userChoice = input.nextLine();

        if(userChoice.equals("1")){
            Encrypt encrypt = new Encrypt(message, shift);

        }else if(userChoice.equals("2")){
            Decrypt decrypt = new Decrypt(message, shift);

        }else{
            System.out.println("Error! Something went wrong");
        }

//        for(int i = 0; i < messageList.length; i++){
//            if(messageList[i].equals(" ")){
//                encryptedMessage += " ";
//            }else{
//                encryptedMessage += alphabetCSV[(alphabet.indexOf(messageList[i]) + shift) % 26];
////                System.out.println(alphabetCSV[(alphabet.indexOf(messageList[i].toUpperCase()) + shift) % 26]);
//            }
//        }


//        for(int i = 0; i < message.length(); i++){
//            if(Character.isWhitespace(message.charAt(i))){
//                encryptedMessage += ' ';
//            }else{
//                if(Character.isUpperCase(message.charAt(i))){
//                    int pos = ALPHABET.indexOf(message.charAt(i));
//                    int encryptedPos = (pos + shift) % 26;
//                    encryptedMessage +=  ALPHABET.charAt(encryptedPos);
//                }else if(Character.isLowerCase(message.charAt(i))){
//                    int pos = alphabet.indexOf(message.charAt(i));
//                    int encryptedPos = (pos + shift) % 26;
//                    encryptedMessage +=  alphabet.charAt(encryptedPos);
//                }
//            }
//        }
//
//        System.out.println(encryptedMessage);

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
