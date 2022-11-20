package Sayfa_127;

import java.util.Scanner;

public class Soru_1 {
    /*
    Soru 1- Kullanicidan input olarak bir String alin,
    baslangic ve bitis indexlerine gore baslangic index'i dahil, bitis index'i haric olacak sekilde
    aradaki harfleri yazdiran bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */
    public static void main(String[] args) {

        String input = "Beykoz bahar aylarında daha güzeldir";
        int basIndexi = 7;
        int bitIndexi = 12;
            kendiSubstringMethodumuz(input,basIndexi,bitIndexi);

    }

    public static void kendiSubstringMethodumuz(String input, int basIndexi, int bitIndexi){

        if (basIndexi>bitIndexi){
            System.out.println("Baslangic indexi, bitis indexinden buyuk olamaz");
        } else if (bitIndexi>=input.length()) {
            System.out.println("Bitis indexi String'in sinirlari disinda");
        }else{
            //     baslangic ve bitis indexlerine gore baslangic index'i dahil,
            //     bitis index'i haric olacak sekilde
            //     aradaki harfleri yazdiran bir method olusturun.

            for (int i = basIndexi ; i <bitIndexi ; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println("");
        }

    }

}










