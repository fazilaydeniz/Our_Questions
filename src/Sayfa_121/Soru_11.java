package Sayfa_121;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen double olacak şekilde iki ürün fiyatı girin");
        String fiyat1= scan.nextLine();
        String fiyat2= scan.nextLine();
        //fiyat1="€11.40";
        //fiyat2="€15.30";
        double toplam = 0.0;
        //String bir listede ki fiyatları toplama
        List<String> myList = new ArrayList<>();
        myList.add(fiyat1);
        myList.add(fiyat2);


        for (String each : myList
        ) {
            each=each.replaceAll("[A-Z,a-z,$,€,£,₺]","");
            toplam+=Double.parseDouble(each);
        }
        System.out.printf("€ "+ "%.2f",toplam);



    }
}

