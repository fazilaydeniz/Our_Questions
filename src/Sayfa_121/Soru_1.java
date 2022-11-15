package Sayfa_121;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {
        //Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle = scan.nextLine();
        String kopyacumle= cumle.toLowerCase();

        if (kopyacumle.contains("ev") && cumle.contains("iş")){
            System.out.println("Hem ev lazim hem iş");
           } else if (kopyacumle.contains("ev")) {
            System.out.println("home home sweet home");
           } else if (kopyacumle.contains("iş")) {
            System.out.println("Çalışmak güzeldir");
        }
        else System.out.println("Çok çalışman lazım");
    }
}
