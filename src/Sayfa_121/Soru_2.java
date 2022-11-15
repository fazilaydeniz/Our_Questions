package Sayfa_121;

public class Soru_2 {
    public static void main(String[] args) {
        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 36.70 €

        String input1= "15.30 €";
        String input2= "11.40 €";
        String output= "0";


        input1= input1.replaceAll("\\D" , "");
        input2= input2.replaceAll("\\D", "");
        System.out.println(Integer.parseInt(input1) + Integer.parseInt(input2) + "€");
    }
}
