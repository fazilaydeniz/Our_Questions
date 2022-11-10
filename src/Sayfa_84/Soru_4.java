package Sayfa_84;

import java.util.Scanner;

public class Soru_4 {
    //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
    //kucukse “Maalesef kaldin” ,bunun haricindeyse "hatalı giriş" yazdırın

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen almış olduğunuz notu giriniz");
        int not= scan.nextInt();

        if (not>=50 && not<=100) System.out.println("Sınıfınızı geçtiniz");
        else if (not>=0 && not<50) System.out.println("Malesef kaldınız");
        else System.out.println("Hatalı giriş yaptınız");
    }
}
