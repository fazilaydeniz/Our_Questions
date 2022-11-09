package Sayfa_71;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        /*Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        zayif yazdirin.
            */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double agirlik= scan.nextDouble();
        System.out.println("lütfen boyunuzu cm olarak giriniz");
        int boy= scan.nextInt();

        double vki=(agirlik*10000/(boy*boy));

        if (vki>30) System.out.println("Obez");
        else if (vki>25) System.out.println("Kilolu");
        else if (vki>20) System.out.println("Normal");
        else if (vki<20) System.out.println("Zayıf");
        else System.out.println("Hatalı giriş yaptınız");


    }
}
