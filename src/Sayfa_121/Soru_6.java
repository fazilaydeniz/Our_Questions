package Sayfa_121;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
        //Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime = scan.nextLine();
        int kelimeUzunlugu = kelime.length();

        if (kelimeUzunlugu % 2 == 0) {
            kelime = kelime.substring(0, kelimeUzunlugu / 2) + ":)" + kelime.substring(kelimeUzunlugu / 2);
            System.out.println(kelime);

        } else { kelime=kelime.substring(0, kelimeUzunlugu / 2)+":(" +kelime.substring(kelimeUzunlugu/2+1);
            System.out.println(kelime);


        }
    }
}