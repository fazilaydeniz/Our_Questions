package Sayfa_76;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz(E/K olarak");
        char cinsiyet= scan.next().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();


        if((cinsiyet=='k'|| cinsiyet=='K') && yas>60)System.out.println("Emekli olabilirsiniz");
        else if ((cinsiyet=='k'|| cinsiyet=='K') && yas<60)
            System.out.println("Emekli olmak için " + (60- yas) + " yıl daha çalışmalısınız" );
        else if ((cinsiyet=='e'|| cinsiyet=='E') && yas>65)System.out.println("Emekli olabilirsiniz");
        else if ((cinsiyet=='e'|| cinsiyet=='E') && yas<65)
            System.out.println("Emekli olmak için " + (65- yas) + " yıl daha çalışmalısınız" );
        else System.out.println("Hatalı giriş yaptınız");

    }
}

