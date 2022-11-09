package Sayfa_76;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //le 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        int girilensayi= scan.nextInt();

        byte donusensayi=(byte)girilensayi;

        System.out.println("Girilen sayının " + girilensayi + "dönüşmüş hali :" + donusensayi);

    }
}
