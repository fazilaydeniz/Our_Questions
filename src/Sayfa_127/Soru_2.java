package Sayfa_127;

import java.util.Scanner;

public class Soru_2 {
    //Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    //isim bosluk soyisim seklinde bize donduren bir method olusturun
    //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lütfen soyisminzi giriniz.");
        String soyisim = scan.nextLine();
        isimYazdırma(isim,soyisim);
        System.out.println(isim+" "+ soyisim );

    }
    public static String isimYazdırma(String isim, String soyisim){
        isim=isim.substring(0).toUpperCase()+
                isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0).toUpperCase()+
                soyisim.substring(1).toLowerCase();


       return isim;
    }
}
