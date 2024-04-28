package com.mycompany.app;
import java.util.*;

public class CaesarCypher {

    public static void main(String[] args){
        String[] alphabetCSV = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] alphabet = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
        String encryptedMessage = "";
        Scanner input = new Scanner(System.in);
        System.out.print("How many shifts? ");
        int shift = input.nextInt();
        input.nextLine();
        System.out.print("To Encrypt: ");
        String message = input.nextLine();
        String[] messageList = message.split("");

        for(int i = 0; i < messageList.length; i++){
            if(messageList[i].equals(" ")){
                encryptedMessage += " ";
            }else{
                encryptedMessage += alphabetCSV[(alphabet[0].indexOf(messageList[i]) + shift) % 26];
//                System.out.println(alphabetCSV[(alphabet[0].indexOf(messageList[i].toUpperCase()) + shift) % 26]);
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
