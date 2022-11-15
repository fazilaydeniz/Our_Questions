package Sayfa_126;

import java.util.Scanner;
                              //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
                              //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
                              //baslangic degerinden kucuk olsa da program calissin
public class Soru_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Arasındaki sayıları toplamak  için bir başlangıç değeri ve entera bastıtan sonra bir de " +
                                              "bitiş değeri girin");
        int baslangicSayisi = scan.nextInt();
        int bitisSayisi = scan.nextInt();
        int toplamsayi = 0;

        if (baslangicSayisi<bitisSayisi) {
            for (int i = baslangicSayisi; i <= bitisSayisi; i++) {

                toplamsayi += i;
            }

            System.out.println("Başlangıç ve bitiş arasındaki rakamların toplamı : " + toplamsayi);
        } if (baslangicSayisi>bitisSayisi) {
            for (int i = bitisSayisi; i <= baslangicSayisi; i++) {

                toplamsayi += i;


            }

            System.out.println("Başlangıç ve bitiş arasındaki rakamların toplamı : " + toplamsayi);
        }


    }
}