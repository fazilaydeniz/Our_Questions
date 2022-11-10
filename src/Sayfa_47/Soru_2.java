package Sayfa_47;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen alfabeden bir harf giriniz");

        char girilenkrk= scan.next().charAt(0);

        System.out.println((char)(girilenkrk)+ " "+ (char)(girilenkrk+1)+ " "+
                (char)(girilenkrk+2)+ " " +(char)(girilenkrk+3));

    }
}
