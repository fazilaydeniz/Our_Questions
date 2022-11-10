package Sayfa_47;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen önce bir tam sayı, sonra bir de ondalıklı sayı giriniz");

        int sayi1= scan.nextInt();
        double sayi2= scan.nextDouble();

        double sonuc= sayi2/sayi1;

        System.out.println((int)sonuc);
    }
}
