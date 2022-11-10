package Sayfa_71;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {
        /*Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
                  “Eskenar ucgen” yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir üçgen için 3 kenar uzunluğu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if ((kenar1==kenar2) && (kenar2==kenar3)) System.out.println("Bu bir eşkenar üçgendir");
        else System.out.println("Bu bir eşkenar üçgen değildir.");
    }
}