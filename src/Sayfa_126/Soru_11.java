package Sayfa_126;

import java.util.Scanner;

public class Soru_11 {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //kontrol edin ve sonucu yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen asal sayı olup olmadığını kontrol etmek için bir sayı giriniz");
        int sayi= scan.nextInt();
        boolean bayrak=true;

        for (int i = 2; i <=sayi-1 ; i++) {

            if (sayi % i==0){
                bayrak=false;
                break;
            }
        }


        System.out.println(bayrak);


        if (bayrak){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }
    }
}
