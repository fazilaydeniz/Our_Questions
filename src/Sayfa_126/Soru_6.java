package Sayfa_126;

import java.util.Scanner;

public class Soru_6 {
    //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
    //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
    //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen faktoryel hesaplamak için 20den küçük bir sayı giriniz");
        int sayi = scan.nextInt();
        int faktoryel = 1;

        for (int i = sayi; i >= 1; i--) {

            faktoryel = i * faktoryel;


        }
        System.out.println("Girilen sayıların faktoryeli : " + faktoryel);
    }
}
