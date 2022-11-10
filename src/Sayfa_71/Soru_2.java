package Sayfa_71;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //  NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        if (harf=='o'|| harf=='O') System.out.println("Ocak");
        if (harf=='s'|| harf=='S') System.out.println("Şubat");
        if (harf=='m'|| harf=='M') System.out.println("Mart veya Mayıs");
        if (harf=='n'|| harf=='N') System.out.println("Nisan");
        if (harf=='h'|| harf=='H') System.out.println("Haziran");
        if (harf=='t'|| harf=='T') System.out.println("Temmuz");
        if (harf=='a'|| harf=='A') System.out.println("Ağustos veya Aralık");
        if (harf=='e'|| harf=='E') System.out.println("Eylül veya Ekim");
        if (harf=='k'|| harf=='K') System.out.println("Kasım");

      /*
             String str1= "123";
             String str2= "12";

        // str1 ve str2'nin degerlerini matematiksel olarak toplayin
        System.out.println(str1 + str2); //Böyle toplanırsa 12312 sonucunu verir.
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));//Şeklinde yazarsak 135 sonucunu verir.

        */
    }
}

