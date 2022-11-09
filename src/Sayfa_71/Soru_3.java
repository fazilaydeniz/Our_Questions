package Sayfa_71;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
       /* Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        yazdirin.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scan.nextInt();

        if(!(sayi%2==0) && sayi>0){
            System.out.println("Girdiğiniz sayı pozitif bir tek sayıdır");
        } else if (!(sayi%2==0) && sayi<0) {
            System.out.println("Girdiğiniz sayı negatif bir tek sayıdır");

        } if (sayi%2==0 && sayi%10==0) {
            System.out.println("Girdiğiniz sayı 10'un katı olan bir çift sayıdır");
        }
    }
}