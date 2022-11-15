package Sayfa_126;

import java.util.Scanner;

public class Soru_7 {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        long sayi= scan.nextLong();
        String sayistr=""+sayi;

        long birlerBasamagi=0;
        long rakamlarToplami=0;

        for (int i = 0; i < sayistr.length(); i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;




        }

        System.out.println(rakamlarToplami);
    }
}