package Sayfa_145;

import java.util.Scanner;

public class Soru_2 {
    // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int sayi= scan.nextInt();
        String sayistr=""+sayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi!=0) {

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi=sayi/10;

            }

        System.out.println(rakamlarToplami);

        }

    }

