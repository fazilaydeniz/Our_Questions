package Sayfa_79;

import java.util.Scanner;

public class Soru_3 {
    /*Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
yazdirin.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();

        if (!(sayi %2==0)) System.out.println("Girdiğiniz  sayı negatif veya pozitif tek sayıdır");
        else if (sayi%10 ==0 ) System.out.println("Girdiğiniz sayı 10'un katı olan bir sayıdır");
        else System.out.println("Hatalı giriş yaptınız");
            


    }
}
