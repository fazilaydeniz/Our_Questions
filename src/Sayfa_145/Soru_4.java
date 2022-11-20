package Sayfa_145;

import java.util.Scanner;

public class Soru_4 {
    //Kullanicidan toplanmak uzere pozitif tamsayilar isteyin. Kullaniciya bitirmek
    //istediginde 0'a basmasini soyleyin
    //Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
    //bunlarin toplaminin kac oldugunu yazdirin
    //Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
    //negatif sayiyi sayi adedine ve toplama eklemeyin
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int girilenSayi=3;
        int sayac=0;
        int toplam=0;

        while (girilenSayi!=0){

            System.out.println("Lütfen pozitif tamsayılar girin ve girme işlemi bitince 0 tuşuna basınız");

            girilenSayi= scan.nextInt();

            if (girilenSayi!=0){

                sayac++;
                toplam+=girilenSayi;

            }


        }
        System.out.println("Girilen " + sayac + " sayının toplamı " + toplam);

    }
}
