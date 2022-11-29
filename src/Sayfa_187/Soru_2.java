package Sayfa_187;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_2 {
    //Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
    //liste olarak dondurecek bir method olusturun.
    public static void main(String[] args) {

        System.out.println(isimListesiOlustur());


    }
    public static List<String> isimListesiOlustur(){

        List<String> isimListesi=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        String isim="";

        while (!isim.equalsIgnoreCase("Q")){
            System.out.println("İsimleri girin ve bitince Q tuşuna basınız");
            isim= scan.nextLine();

            if(!isim.equalsIgnoreCase("Q")){
                isimListesi.add(isim);
            }
        }
        return isimListesi;
    }
}
