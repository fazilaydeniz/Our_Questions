package Sayfa_71;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {
        /*Soru 4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        zamani” yazdirin.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Bugün günlerden ne? Lütfen yazınız");
        String gun= scan.next();

        if(gun.equalsIgnoreCase("pazartesi")) System.out.println("hafta sonu tatiline 5 gun var");
        if(gun.equalsIgnoreCase("salı")) System.out.println("hafta sonu tatiline 4 gun var");
        if(gun.equalsIgnoreCase("çarşamba")) System.out.println("hafta sonu tatiline 3 gun var");
        if(gun.equalsIgnoreCase("perşembe")) System.out.println("hafta sonu tatiline 2 gun var");
        if(gun.equalsIgnoreCase("cuma")) System.out.println("hafta sonu tatiline 1 gun var");
        if(gun.equalsIgnoreCase("cumartesi")) System.out.println("Şimdi dinlenme zamanı");
        if(gun.equalsIgnoreCase("pazar")) System.out.println("Şimdi dinlenme zamanı");



    }
}