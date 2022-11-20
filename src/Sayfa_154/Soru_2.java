package Sayfa_154;

import java.util.Scanner;

public class Soru_2 {
    //Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
    //kontrol edin ve sifredeki hatalari yazdirin.
    //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
    //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
    //- Sifre kucuk harf icermelidir
    //- Sifre en az 8 karakter olmalidir.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Boolean sifreGecerliMi = false;
        String sifre="";
        int bayrak = 0;

        while (sifreGecerliMi != true) {
            System.out.println("Lütfen şifre giriniz ");
            sifre = scan.next();

            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {

                System.out.println("Şifrenin ilk harfi küçük harf olmalı");
                bayrak++;
            }

            if (!(sifre.charAt(sifre.length()-1) >= '0' && sifre.charAt(sifre.length()-1) <= '9')) {
                System.out.println("Şifrenin son karakteri rakam olmalı");
                bayrak++;

            }
            if (!(sifre.length()== 8)){
                System.out.println("Sifre 8 karakter olmali");
                bayrak++;
            }
            if (bayrak == 0) {
                sifreGecerliMi = true;
                System.out.println("Şifreniz başarıyla kaydedildi.");
            }

        }
    }
}
