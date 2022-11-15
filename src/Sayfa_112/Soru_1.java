package Sayfa_112;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {
        //Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        //icerip icermedigini lastIndexOf( ) method’u kullanarak yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle= scan.nextLine();
        System.out.println("Lütfen cümlede arancak bir kelime giriniz");
        String aranacakKelime= scan.next();
        int ilkIndex= cumle.indexOf(aranacakKelime);
        int sonIndex=cumle.lastIndexOf(aranacakKelime);

        if (ilkIndex== (-1)) System.out.println("Cümle aranan kelimeyi içermiyor");
        else if (ilkIndex==sonIndex) System.out.println("Cümlede aranan kelime 1 kere geçiyor");
        else System.out.println("Cümlede aranan kelime birden fazla geçiyor");

    }
}
