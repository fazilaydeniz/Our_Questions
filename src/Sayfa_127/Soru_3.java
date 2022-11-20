package Sayfa_127;

import java.util.Scanner;

public class Soru_3 {
    //Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
    //sonuclarini donduren bir method olusturun.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayi = scan.nextInt();

              asalSayiBulma(sayi);

    }

    public static int asalSayiBulma(int sayi) {
        boolean bayrak = true;

        for (int i = 2; i < sayi - 1; i++) {

            if (sayi % i == 0) {
                bayrak = false;
                break;

            }

        }

        System.out.println(bayrak);
        if (bayrak) System.out.println("Girdiğiniz sayı asal sayıdır.");
        else System.out.println("Girdiğiniz sayı asal sayı değildir.");
        return sayi;
    }
}

