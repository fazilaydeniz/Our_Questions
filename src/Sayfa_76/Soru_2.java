package Sayfa_76;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
        /*Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
alirsa %15, yoksa %10 indirim yapin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ürün adedinizi giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("Lütfen liste fiyatını giriniz");
        double listeFiyati= scan.nextDouble();
        double toplamfiyat= 0;
        System.out.println("Müşteri kartınız varsa 1'i +" +
                " yoksa 2'yi tuşlayınız");
        int musterikarti= scan.nextInt();

        //Kart varsa

        if(musterikarti==1 && urunAdedi>=10) {
            toplamfiyat = urunAdedi * listeFiyati * (0.8);
            System.out.println("%20 indirimli toplam fiyat :" + toplamfiyat);
        } else if (musterikarti==1 && urunAdedi<10) {
            toplamfiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat :" + toplamfiyat);
        } else if (musterikarti==2 && urunAdedi>=10) {
            toplamfiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat :" + toplamfiyat);
        } else if (musterikarti==2 && urunAdedi<10) {
            toplamfiyat = urunAdedi * listeFiyati * (0.90);
            System.out.println("%10 indirimli toplam fiyat :" + toplamfiyat);
        }else System.out.println("Hatalı giriş yaptınız");
    }
}

