package Sayfa_79;

import java.util.Scanner;

public class Soru_1 {
      /*Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
     */
      public static void main(String[] args) {
          Scanner scan= new Scanner(System.in);
          System.out.println("Lütfen cinsiyetinizi E/K olarak giriniz");
          char cinsiyet=scan.next().charAt(0);
          System.out.println("Lütfen yaşınızı giriniz");
          int yas= scan.nextInt();

          if (cinsiyet =='E' && yas>=65) System.out.println("Emekli olabilirsiniz");
          else if (cinsiyet=='E' && yas<=65) System.out.println("Emekli olabilmek için " +(65-yas)+ " yıl daha çalışmalısın");
          else if (cinsiyet =='K' && yas>=60) System.out.println("Emekli olabilirsiniz");
          else if (cinsiyet=='K' && yas<=60) System.out.println("Emekli olabilmek için " +(60-yas)+ " yıl daha çalışmalısın");
          else System.out.println("Hatalı giriş yaptınız");




      }
}
