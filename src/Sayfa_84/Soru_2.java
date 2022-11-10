package Sayfa_84;

import java.util.Scanner;

public class Soru_2 {
    //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
    //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Arada enter tuşuna basarak üçgen için 3 kenar uzunluğu giriniz ");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if(kenar1 == kenar2 || kenar2==kenar3) System.out.println("Bu bir eşkenar üçgendir");
        else System.out.println("Bu bir eşkenar üçgen değildir");
    }
}
