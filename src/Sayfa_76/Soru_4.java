package Sayfa_76;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen iki adet ondalıklı sayı giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        double sonuc=sayi1/ sayi2;

        System.out.println((int)sonuc);



    }
}
