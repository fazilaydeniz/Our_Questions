package Sayfa_37;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        /*Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
                  girilen bilgiler : J Doe, 44

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizin baş harfini giriniz");
        char isminbasharfi = scan.next().charAt(0);

        System.out.println("Lütfen soyisminizi giriniz");
        String soyadi =scan.next();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        System.out.print(isminbasharfi+ " "+ soyadi+","+  " "+ yas);
    }
}
