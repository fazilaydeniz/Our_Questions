package Sayfa_37;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        //        yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen dikdötgenin alanı hesaplamak için kenar uzunluklarını giriniz"+
                "\nBirinci kenar uzunluğunu girdikten sonra entera basıp 2.yi girin");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Dikdörtgenin alanı : " + kenar1*kenar2);
    }
}

