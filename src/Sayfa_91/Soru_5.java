package Sayfa_91;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        //Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1den 7ye bir gün numarası giriniz");
        int gunNo = scan.nextInt();

        if (gunNo==1) System.out.println("Pazartesi haftaiçi bir gündür");
        else if (gunNo==2) System.out.println("Salı haftaiçi bir gündür");
        else if (gunNo==3) System.out.println("Çarşamba haftaiçi bir gündür");
        else if (gunNo==4) System.out.println("Perşembe haftaiçi bir gündür");
        else if (gunNo==5) System.out.println("Cuma haftaiçi bir gündür");
        else if (gunNo==6) System.out.println("Cumartesi haftasonu bir gündür");
        else if (gunNo==7) System.out.println("Pazar haftasonu bir gündür");
        else System.out.println("Hatalı giriş yaptınız");
    }
}
