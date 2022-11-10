package Sayfa_84;

import java.util.Scanner;

public class Soru_1 {
    //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
    //“Sayi 5’in tam kati” yazdirin.

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi%5==0) System.out.println("Girdiğiniz sayı 5'in tam katıdır");
        else System.out.println("Girdiğiniz sayı 5'in tam katı değildir");
    }
}
