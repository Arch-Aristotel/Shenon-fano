package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /** Программа для кодирования с префексным провилом
         *
         */
            System.out.println("Input your word \n");
    Scanner cin = new Scanner(System.in);
    FanoEncryption encryption = new FanoEncryption(cin.nextLine());
    System.out.println(encryption.get_Word_output());

    FanoDecryption decryption = new FanoDecryption(cin.nextLine());
    System.out.println(decryption.get_Word_output());

    }
}