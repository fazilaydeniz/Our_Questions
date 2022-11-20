package Sayfa_172;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_5 {
    // Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
    //donduren bir method olusturun.

    public static void main(String[] args) {
     int [] kullaniciArrayi= arrayOlustur();
        System.out.println("Kullanıcının oluşturduğu Array : " + Arrays.toString(kullaniciArrayi));

    }
    public static int[] arrayOlustur(){

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen arrayin boyutunu giriniz");
        int boyut= scan.nextInt();

         int [] kullaniciArrayi= new int[boyut];

        for (int i = 0; i < boyut ; i++) {

            System.out.println("Lütfen arraye eklemek istediğiniz sayıları giriniz");

            kullaniciArrayi[i]+= scan.nextInt();
        }
            return kullaniciArrayi;
        }

}
