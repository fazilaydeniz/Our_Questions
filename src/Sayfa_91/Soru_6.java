package Sayfa_91;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
        //Kullanicidan ay numarasini alip mevsimi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1'den 12'ye bir ay numarası giriniz");

        int ayNo = scan.nextInt();



        if (ayNo==12 || ayNo==1 || ayNo==2 ){
            System.out.println("Aralık, Ocak ve Şubat ayları kış mevsiminin ayıdır");
        }
        else if (ayNo==3 || ayNo==4 || ayNo==5 ){
            System.out.println("Mart, Nisan, Mayıs ayları ilkbahar mevsiminin ayıdır");
        }
        else if (ayNo==6 || ayNo==7 || ayNo==8 ) {
            System.out.println("Haziran, Temmuz, Ağustos ayları yaz mevsiminin ayıdır");
        }
        else if (ayNo==9 || ayNo==10 || ayNo==11 ){
            System.out.println("Eylül, Ekim, Kasım ayları sonbahar mevsiminin ayıdır");
        } else{
            System.out.println("Hatalı giriş yaptınız");
        }


    }
}
