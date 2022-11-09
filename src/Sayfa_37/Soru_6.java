package Sayfa_37;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap)

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen iki tamsayı giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        int bos;

        bos= sayi2;

        sayi2=sayi1;


        sayi1=bos;
        System.out.println("Sayı1'in değeri :" + sayi1);
        System.out.println("Sayı2'nin değeri :" + sayi2);

    }
}