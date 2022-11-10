package Sayfa_71;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        /*Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
          sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi= scan.nextInt();

        if (sayi%3==0) System.out.println("Girdiğiniz sayı 3 ile tam bölünebilen bir sayıdır.");
        if (sayi%5==0) System.out.println("Girdiğiniz sayı 5 ile tam bölünebilen bir sayıdır.");
        else System.out.println("Girdiğiniz sayı 3 ve 5 ile tam bölünebilen bir sayı değildir.");

    }
}
