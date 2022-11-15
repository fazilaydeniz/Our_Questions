package Sayfa_126;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Arasındaki sayıları toplamak  için bir başlangıç değeri ve entera bastıtan sonra bir de " +
                "bitiş değeri girin");
        int baslangicSayisi= scan.nextInt();
        int bitisSayisi = scan.nextInt();
        int toplamsayi= 0;

        if (bitisSayisi<baslangicSayisi) {
            System.out.println("Bitiş sayısı başlangıç sayısından küçük");
        }
        for (int i = baslangicSayisi; i <= bitisSayisi ; i++) {

            toplamsayi+=i;

        }
        System.out.println("Başlangıç ve bitiş arasındaki rakamların toplamı : " +toplamsayi);



    }

}
