package Sayfa_37;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        /*
         Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
         Isminiz : John
         Soyisminiz : Doe
         Yasiniz : 44
         Kaydiniz basariyla tamamlanmisti
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String ad= scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyad= scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        System.out.println("İsminiz: " + ad +
                "\nSoyisminiz :" + soyad +
                "\nYaşınız : " + yas +
                "\nKaydınız başarıyla tamamlanmıştır");




    }
}
