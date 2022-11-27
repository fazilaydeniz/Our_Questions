package Sayfa_121;

import java.text.DecimalFormat;

public class Soru_2 {
    public static void main(String[] args) {
        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 26.70 €

        String input1= "15.30 €";
        String input2= "11.40 €";
        double output= 0;


        input1= input1.replaceAll("\\D" , "");
        input1=input1.substring(0,2)+"."+ input1.substring(2);
        input2= input2.replaceAll("\\D", "");
        input2=input2.substring(0,2)+"."+ input2.substring(2);
        output=Double.parseDouble(input1) + Double.parseDouble(input2);

        System.out.printf("%.2f", output );
        System.out.print(" €");
    }
}
