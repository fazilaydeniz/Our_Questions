package Sayfa_84;

import java.util.Scanner;

public class Soru_5 {
    //Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen arada entera basarak iki sayı giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        if (sayi1>sayi2) System.out.println("Büyük olan sayı :" + sayi1);
        else if(sayi2>sayi1) System.out.println("Büyük olan sayı :" + sayi2);
        else System.out.println("Hatalı giriş yaptınız");
    }
}
