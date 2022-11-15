package Sayfa_126;

import java.util.Scanner;

public class Soru_9 {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime= scan.next();

        for (int i = kelime.length()-1; i >=0 ; i--) {

            System.out.print(kelime.charAt(i));
        }

        }

}
