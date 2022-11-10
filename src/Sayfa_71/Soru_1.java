package Sayfa_71;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        // “Sayi 5’in tam kati” yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        double sayi= scan.nextDouble();

        if (sayi%5==0) System.out.println("Girdiğiniz sayı 5'in tam katı bir sayıdır");
        else System.out.println("Girdiğiniz sayı 5'in tam katı bir sayı değildir");
    }
}
