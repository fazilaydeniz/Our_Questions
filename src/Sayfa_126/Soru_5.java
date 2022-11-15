package Sayfa_126;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen faktoryel hesaplamak için 20den küçük bir sayı giriniz");
        int sayi= scan.nextInt();
        int faktoryel=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel=i*faktoryel;
        }
        System.out.println("Girilen sayının faktöryeli= " + faktoryel);
    }
}
