package Sayfa_121;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anlatim {
    public static void main(String[] args) {
        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 26.70 €
Scanner scan  = new Scanner(System.in);
        System.out.println("fiyat");

        String fiyat1= scan.nextLine();
        String fiyat2= scan.nextLine();
        double output= 0;
        List<String> myList = new ArrayList<>();
        myList.add(fiyat1);
        myList.add(fiyat2);


        for (String each : myList
        ) {
            each=each.replaceAll("\\D","");
            each=each.substring(0,2)+"." +each.substring(2);
                   output+=Double.parseDouble(each);
        }

        System.out.printf("€ "+"%.2f",output);

    }
}






