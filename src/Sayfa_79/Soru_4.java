package Sayfa_79;

import java.util.Scanner;

public class Soru_4 {
    /*Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
    “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
    gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
    zamani” yazdirin.
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String gunIsmi = scan.next();

        if (gunIsmi.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Şimdi çalışma zamanı. Tatile 5 gün var");
        } else if (gunIsmi.equalsIgnoreCase("Salı")) {
            System.out.println("Şimdi çalışma zamanı. Tatile 4 gün var");
        } else if (gunIsmi.equalsIgnoreCase("Çarşamba")) {
            System.out.println("Şimdi çalışma zamanı. Tatile 3 gün var");
        } else if (gunIsmi.equalsIgnoreCase("Perşembe")) {
            System.out.println("Şimdi çalışma zamanı. Tatile 2 gün var");
        } else if (gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Şimdi çalışma zamanı. Tatile 1 gün var");
        } else if (gunIsmi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Şimdi dinlenme zamanı. ");
        } else if (gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("şimdi dinlenme zamanı");
        } else {
            System.out.println("Hatalı giriş yaptınız");
        }
    }
}
