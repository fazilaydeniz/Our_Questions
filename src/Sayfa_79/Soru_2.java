package Sayfa_79;

import java.util.Scanner;

public class Soru_2 {
           /*Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
           karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
           %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
           alirsa %15, yoksa %10 indirim yapin
           */
           public static void main(String[] args) {
               Scanner scan= new Scanner(System.in);
               System.out.println("Lütfen ürün adedini giriniz");
               int urunadedi = scan.nextInt();
               System.out.println("Lütfen liste fiyatını giriniz");
               double listefiyati= scan.nextDouble();
               System.out.println("Müşteri kartınız varsa 1'i yoksa 2'yi tuşlayınız");
               int musteriKarti= scan.nextInt();

               //Müşteri katrtı varsa
               if (musteriKarti==1 && urunadedi>10) System.out.println(urunadedi*listefiyati*0.80);
               else if (musteriKarti==1 && urunadedi<=10) System.out.println(urunadedi*listefiyati*0.85);
               else if (musteriKarti==2 && urunadedi>10) System.out.println(urunadedi*listefiyati*0.85);
               else if (musteriKarti==2 && urunadedi<=10)System.out.println(urunadedi*listefiyati*0.90);
               else System.out.println("Hatalı giriş yaptınız");




           }
}
