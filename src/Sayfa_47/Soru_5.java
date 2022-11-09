package Sayfa_47;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        /*Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Aldığınız notu giriniz");
        int aldıgıNot= scan.nextInt();

        if (aldıgıNot>=50) System.out.println("Sınıfı geçtiniz");
        if (aldıgıNot<50) System.out.println("Malesef sınıfta kaldınız");
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Aldığınız notu giriniz");
        int aldıgıNot= scan.nextInt();

        if(aldıgıNot>=85 && aldıgıNot<=100) System.out.println("Takdir Belgesi almaya hak kazanarak sınıfınızı geçtiniz");
        else if (aldıgıNot>=70 && aldıgıNot<=85) System.out.println("Teşekkür Belgesi almaya hak kazanarak sınıfınızı geçtiniz");
        else if(aldıgıNot>=50 && aldıgıNot<=70) System.out.println("Sınıfınızı geçtiniz");
        else if(aldıgıNot<50) System.out.println("Sınıfta kaldınız");
        else System.out.println("Yanlış giriş yaptınız");

    }

}
