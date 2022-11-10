package Sayfa_84;

import java.util.Scanner;

public class Soru_3 {
    //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
    //harf olarak yazdirin, yoksa girilen harfi yazdirin

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        if (harf>='a' && harf<= 'z') {
            System.out.println("Girdiğiniz " + harf+ " küçük bir harftir. \n" +
                    "Bu harfin büyük yazılışı " +((char)(harf-32)) ); // Bunu  (Character.toUpperCase()) olarak da kullanabilirdik.
        }
        else {
            System.out.println("Girdiğiniz harf büyük harftir : " + harf);
        }

    }
}
