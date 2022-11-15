package Sayfa_91;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {
        //Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scan= new Scanner(System.in);
        System.out.println("ISTQB harflerinden anlamını öğrenmek istediğiniz harfi giriniz");

        char harf  = scan.next().charAt(0);

        if (harf=='I' || harf=='ı' ) System.out.println("Girdiğiniz harfin anlamı : International");
        else if (harf=='S' || harf=='s' ) System.out.println("Girdiğiniz harfin anlamı : Software");
        else if (harf=='T' || harf=='t' ) System.out.println("Girdiğiniz harfin anlamı : Testing");
        else if (harf=='Q' || harf=='q' ) System.out.println("Girdiğiniz harfin anlamı : Qualifications");
        else if (harf=='B' || harf=='b' ) System.out.println("Girdiğiniz harfin anlamı : Board");
        else System.out.println("Hatalı giriş yaptınız");


    }


}
