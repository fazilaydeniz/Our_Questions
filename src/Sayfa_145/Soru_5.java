package Sayfa_145;

import java.util.Scanner;

public class Soru_5 {
    //Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
    //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
    //olusturun.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı ve hesaplamak istediğiniz üssünü giriniz");
        int sayi= scan.nextInt();
        int us=scan.nextInt();



         usHesaplama(sayi,us);

    }
         public static void usHesaplama(int sayi, int us){

         int sonuc=1;

         while (us>0){
             sonuc*=sayi;
             us--;

         }
             System.out.println(sonuc);

    }
}
