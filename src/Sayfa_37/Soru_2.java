package Sayfa_37;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        //        yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ondalıklı bir sayı giriniz");
        double ondaliklisayi= scan.nextDouble();

        System.out.println("Lütfen bir tam sayi giriniz");
        int tamsayi= scan.nextInt();

        System.out.println("Ondalıklı sayı ile tam sayının çarpımı: " +ondaliklisayi*tamsayi);
    }
}
