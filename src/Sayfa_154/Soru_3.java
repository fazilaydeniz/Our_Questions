package Sayfa_154;

import java.util.Scanner;

public class Soru_3 {
    //Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
    //bulunuz, tamkare ise true değilse false yazdırınız.
    //Ornek : input : 16, output: 4

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int sayi = scan.nextInt();
        int baslangic = 1;
        int bayrak = 0;


        do {
            if (baslangic*baslangic==sayi){
                System.out.println(true);
                bayrak++;
                break;
            }
            baslangic++;
        }while (baslangic*baslangic<=sayi);

        if (bayrak==0){
            System.out.println(false);
        }
    }
}