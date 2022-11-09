package Sayfa_37;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {
        /*Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
         yazdirin

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi = scan.nextInt();

        System.out.println("Lütfen ondalıklı bir sayı giriniz");
        double sayi2= scan.nextDouble();

        System.out.println("Lütfen isminizi giriniz");
        String  ad = scan.next();


        System.out.println("Girilen tamsayi :" + sayi +
                "\nGirilen ondalikli sayi: " + sayi2 +
                "\nGirilen isim : " + ad);




    }
}
